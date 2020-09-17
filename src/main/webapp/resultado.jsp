<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="co.edu.eafit.protoapp.Calculadora" %>
<%! Calculadora calc = new Calculadora(); %>
<%
    Double numero = Double.valueOf(request.getParameter("numero"));
    Double cuadrado = calc.cuadrado(numero);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <p>El cuadrado de <%= numero %> es <%= cuadrado %></p>
        <p>Puede volver <a href="index.jsp">atrás</a> y hacer un nuevo cálculo.</p>
        <p>All Rights Reserved - Universidad EAFIT</p>
    </body>
</html>
