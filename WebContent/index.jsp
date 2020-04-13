<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 12/04/2020
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>App Mascotas</title>
</head>
<body>

    <div class="jumbotron">
        <h1 class="display-4">App Mascotas</h1>
        <p class="lead">Bienvenido a la App Mascotas. Puedes dar click en alguno de los 3 botones para navegar a los diferentes formularios</p>
        <hr class="my-4">

        <a class="btn btn-primary btn-lg" href="/Mascotas/ClienteServlet" role="button">Clientes</a>
        <a class="btn btn-primary btn-lg" href="/Mascotas/MedicamentoServlet" role="button">Medicamentos</a>
        <a class="btn btn-primary btn-lg" href="/Mascotas/MascotaServlet" role="button">Mascotas</a>
    </div>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>