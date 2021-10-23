<%--
  Created by IntelliJ IDEA.
  User: igorp
  Date: 19.10.2021
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Students</title>
</head>
<body>
    <h1>Students</h1>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Group</th>
        <tr>
    </tr>

    <c:forEach var="stud" items="${students}">
        <tr>
            <td>${stud.id}</td>
            <td>${stud.name}</td>
            <td>${stud.group}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
