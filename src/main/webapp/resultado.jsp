<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="co.edu.eafit.protoapp.Calculadora" %>
<%! Calculadora calc = new Calculadora();%>
<%
    Double numero = Double.valueOf(request.getParameter("numero"));
    Double cuadrado = calc.cuadrado(numero);
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Resultado</title>
    </head>
    <body>
        <div>
            <h1>Resultado</h1>
            <p>El cuadrado de <%= numero%> es <%= cuadrado%></p>
            <p>Puede volver <a href="index.jsp">atrás</a> y hacer un nuevo cálculo.</p>
            <p>All Rights Reserved 2021 - Universidad EAFIT</p>
        </div>
    </body>
</html>
