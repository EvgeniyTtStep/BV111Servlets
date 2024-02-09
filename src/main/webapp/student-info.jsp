<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 09.02.2024
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page import="com.example.bv111servlets.lesson2.Student" %>--%>
<%--<jsp:useBean id="student" scope="request" type="com.example.bv111servlets.lesson2.Student"/>--%>
<jsp:useBean id="checks" scope="request" type="java.util.List"/>


<html>
<head>
    <title>Student</title>
</head>
<body>

<h1>Student info</h1>

<div>Name:
    <% out.println(request.getAttribute("name")); %>
</div>

<div>Surname:
    <%= request.getAttribute("surname") %>
</div>

<div>Age:
    <%= request.getAttribute("age") %>
</div>


<div>

    <c:forEach items="${checks}" var="check">
        <tr>
            <td>${check}</td>
        </tr>
    </c:forEach>

</div>


<%--<div>--%>
<%--    <% for (int i = 0; i < checks.size(); i++) {--%>
<%--        out.println(checks.get(i));--%>
<%--    }%>--%>
<%--</div>--%>

</body>
</html>
