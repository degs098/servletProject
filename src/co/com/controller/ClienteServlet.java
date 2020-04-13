package co.com.controller;

import co.com.business.ClienteBusiness;
import co.com.entities.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClienteServlet")
public class ClienteServlet extends HttpServlet {

    private ClienteBusiness clienteBusiness = new ClienteBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(null != action){
            switch (action) {
                case "save":
                    saveCliente(request, response);
                    break;
                case "update":
                    updateCliente(request, response);
                    break;
                case "delete":
                    deleteCliente(request, response);
                    break;
                case "getById":
                    getClienteById(request, response);
                    break;
                default:
                    listarClientes(request, response);
                    break;
            }
        }else{
            listarClientes(request, response);
        }
    }

    private void listarClientes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cliente> clienteList = clienteBusiness.fetchAll();
        request.setAttribute("clienteList", clienteList);
        getServletContext().getRequestDispatcher("/views/clientes.jsp").forward(request, response);
    }

    private void saveCliente(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Cliente cliente = buildClienteInfo(request);
        clienteBusiness.addCliente(cliente);
        response.sendRedirect("ClienteServlet");
    }

    private void updateCliente(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Cliente cliente = buildClienteInfo(request);
        clienteBusiness.updateCliente(cliente);
        response.sendRedirect("ClienteServlet");
    }

    private void deleteCliente(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Long id = Long.valueOf(request.getParameter("id"));
        clienteBusiness.deleteCliente(id);
        response.sendRedirect("ClienteServlet");
    }

    private void getClienteById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.valueOf(request.getParameter("id"));
        Cliente cliente = clienteBusiness.getClienteById(id);
        request.setAttribute("cliente", cliente);
        listarClientes(request, response);
    }

    private Cliente buildClienteInfo(HttpServletRequest request){
        Long id = null != request.getParameter("id") ? Long.valueOf(request.getParameter("id")) : null;
        Long cedula = Long.valueOf(request.getParameter("cedula"));
        String nombre = request.getParameter("nombre");
        String segundoNombre = request.getParameter("segundoNombre");
        String apellido = request.getParameter("apellido");
        String segundoApellido = request.getParameter("segundoApellido");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        return new Cliente(id, cedula, nombre, segundoNombre, apellido, segundoApellido, direccion, telefono);
    }
}
