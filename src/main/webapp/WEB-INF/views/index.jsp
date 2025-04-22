<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Message</title>
</head>
<body>
<h1>${message}</h1>
<h2>Students:</h2>
<ul>
    <c:forEach var="student" items="${students}">
        <li>Name: ${student.name}</li>
        <li>Email: ${student.email}</li>
        <c:if test="${not empty student.notes}">
            <li>Notes:
                <ul>
                    <c:forEach var="note" items="${student.notes}" varStatus="status">
                        <li>Note Modul${status.index + 1}: ${note}</li>
                    </c:forEach>
                </ul>
            </li>
        </c:if>

        <!-- ✅ Formulaire de suppression ici, pour CHAQUE étudiant -->
        <form action="hello/delete" method="post" style="margin-bottom: 20px;">
            <input type="hidden" name="id" value="${student.id}" />
            <button type="submit">🗑️ Supprimer</button>
        </form>
        <hr/>
    </c:forEach>
</ul>
</body>
</html>
