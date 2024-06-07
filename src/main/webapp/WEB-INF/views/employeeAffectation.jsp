<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Affectation Employé-Projet</title>
</head>
<body>
<h2>Affecter un employé à un projet</h2>
<form action="affectationController" method="post">
    <%--@declare id="employee"--%><%--@declare id="project"--%><%--@declare id="percentage"--%><label for="employee">Nom de l'employé :</label>
    <select name="employee">
        <c:forEach items="${employeeNames}" var="employeeName">
            <option>${employeeName}</option>
        </c:forEach>
    </select>
    <br>
    <label for="project">Nom du projet :</label>
    <select name="project">
        <c:forEach items="${projectNames}" var="projectName">
            <option>${projectName}</option>
        </c:forEach>
    </select>
    <br>
    <label for="percentage">Pourcentage d'implication :</label>
    <input type="text" name="percentage">
    <br>
    <input type="submit" value="Affecter projet">
</form>
</body>
</html>
