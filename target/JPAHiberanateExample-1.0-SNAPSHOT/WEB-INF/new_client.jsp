<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Create New Client</title>

    <style>
    .blue-button{
    background: #25A6E1;
    padding:3px 5px;
    color:#fff;
    font-family:'Helvetica Neue',sans-serif;
    font-size:12px;
    border-radius:2px;
    -moz-border-radius:2px;
    -webkit-border-radius:4px;
    border:1px solid #1A87B9
    }
    table {
    font-family: "Helvetica Neue", Helvetica, sans-serif;
    width: 50%;
    }
    th {
    background: SteelBlue;
    color: white;
    }
    td,th{
    border: 1px solid gray;
    width: 25%;
    text-align: left;
    padding: 5px 10px;
    }
    </style>

</head>
<body>
<div align="center">
    <h1>Create New Client</h1>
    <br />
    <form:form action="save" method="POST" modelAttribute="client" >

        <table border="0" cellpadding="10">
            <tr>
                <td>Client name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Client Age:</td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
