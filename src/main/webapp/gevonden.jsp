<%@ page import="com.example.demo3.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gevonden</title>
</head>
<body>
<% Student student = (Student) request.getAttribute("student");%>
<p>Je vroeg naar volgende gegevens:
    <%= student.getNaam()%>
    <%= student.getVoornaam()%>
    (<%= student.getLeeftijd()%> jaar):
    <%= student.getStudierichting()%>
</p>
</body>
</html>
