<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 12/04/2020
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>App Mascotas - Clientes</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-md">
            <c:choose>
                <c:when test="${cliente != null}">
                <form action="ClienteServlet?id=<c:out value="${cliente.id}"/>" method="post">
                </c:when>
                <c:otherwise>
                <form action="ClienteServlet" method="post">
                </c:otherwise>
            </c:choose>
                <div class="form-group">
                    <label for="cedulaInput">*Cédula</label>
                    <input name="cedula" type="number" class="form-control" id="cedulaInput" required
                           placeholder="Ingresa número de cédula" value="<c:out value="${cliente.cedula}"/>"/>
                </div>
                <div class="form-group">
                    <label for="nombreInput">*Nombre</label>
                    <input name="nombre" type="text" class="form-control" id="nombreInput" placeholder="Ingresa primer nombre"
                           required value="<c:out value="${cliente.nombre}"/>"/>
                </div>
                <div class="form-group">
                    <label for="segundoNombreInput">Segundo nombre</label>
                    <input name="segundoNombre" type="text" class="form-control" id="segundoNombreInput"
                           placeholder="Ingresa segundo nombre" value="<c:out value="${cliente.segundoNombre}"/>"/>
                </div>
                <div class="form-group">
                    <label for="apellidoInput">*Apellido</label>
                    <input name="apellido" type="text" class="form-control" id="apellidoInput" placeholder="Ingresa primer apellido"
                           required value="<c:out value="${cliente.apellido}"/>"/>
                </div>
                <div class="form-group">
                    <label for="segundoApellidoInput">Segundo Apellido</label>
                    <input name="segundoApellido" type="text" class="form-control" id="segundoApellidoInput"
                           placeholder="Ingresa primer apellido" value="<c:out value="${cliente.segundoApellido}"/>"/>
                </div>
                <div class="form-group">
                    <label for="direccionInput">*Dirección</label>
                    <input name="direccion" type="text" class="form-control" id="direccionInput" value="<c:out value="${cliente.direccion}"/>"
                           placeholder="Ingresa dirección domiciliaria" required/>
                </div>
                <div class="form-group">
                    <label for="telefonoInput">*Teléfono</label>
                    <input name="telefono" type="number" class="form-control" id="telefonoInput" placeholder="Ingresa número telefónico"
                           required value="<c:out value="${cliente.telefono}"/>"/>
                </div>
                <c:choose>
                    <c:when test="${cliente != null}">
                        <button type="submit" name="action" value="update" class="btn btn-primary">Guardar</button>
                    </c:when>
                    <c:otherwise>
                        <button type="submit" name="action" value="save" class="btn btn-primary">Guardar</button>
                    </c:otherwise>
                </c:choose>
                    <a href="/Mascotas" class="btn btn-danger">Atrás</a>
            </form>
        </div>
    </div>

    <div class="row">
        <div class="col-md">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Cédula</th>
                    <th scope="col">Nombres</th>
                    <th scope="col">Apellidos</th>
                    <th scope="col">Dirección</th>
                    <th scope="col">Teléfono</th>
                    <th scope="col">Acciones</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="cliente" items="${clienteList}">
                    <tr>
                        <th scope="row">${cliente.id}</th>
                        <td>${cliente.cedula}</td>
                        <td>
                            ${cliente.nombre} <c:if test="${cliente.segundoNombre != null}">${cliente.segundoNombre}</c:if>
                        </td>
                        <td>
                            ${cliente.apellido} <c:if test="${cliente.segundoApellido != null}">${cliente.segundoApellido}</c:if>
                        </td>
                        <td>${cliente.direccion}</td>
                        <td>${cliente.telefono}</td>
                        <td>
                            <a href="ClienteServlet?id=<c:out value='${cliente.id}'/>&action=getById" class="btn btn-primary">Editar</a>
                            <a href="ClienteServlet?id=<c:out value='${cliente.id}'/>&action=delete" class="btn btn-danger">Eliminar</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
