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
    <h1>Update Client</h1>
    <br />
    <form action='/update' method='post'>

        <table class='table table-hover table-responsive table-bordered'>

            <tr>
                <td><b>Name</b></td>
                <td><input type='text' name='name' class='form-control' value="${client.name}" /></td>
            </tr>

            <tr>
                <td><b>Age</b></td>
                <td><input type='text' name='age' class='form-control' value="${client.age}" /></td>
            </tr>
            <input type='hidden' id='id' class='form-control' name='id' value="${client.id}"/>
            <tr>
                <td></td>
                <td>
                    <button type="submit" class="btn btn-primary">Update client Information</button>
                </td>
            </tr>

        </table>
    </form>
</div>
</body>
</html>
