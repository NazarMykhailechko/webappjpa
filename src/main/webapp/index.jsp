<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
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

<a href="/add">Add new client</a>
<h3>Clients List</h3>
<c:if test="${!empty listOfClients}">
    <table class="tg">
        <tr>
            <th width="80">Id</th>
            <th width="120">Name</th>
            <th width="120">age</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listOfClients}" var="client">
            <tr>
                <td>${client.id}</td>
                <td>${client.name}</td>
                <td>${client.age}</td>
                <td><a href="<c:url value='/updateClient/${client.id}' />" >Edit</a></td>
                <td><a href="<c:url value='/deleteClient/${client.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>