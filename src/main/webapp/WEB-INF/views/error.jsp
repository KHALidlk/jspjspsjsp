<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
  <title>Message</title>
</head>
<body>
<ul>
  <li>Name: ${student.name}</li>
  <li>Email: ${student.email}</li>
  <li>Notes:
    <ul>
      <c:forEach var="note" items="${student.notes}" varStatus="status">
        <li>Note Modul${status.index + 1}: ${note}</li>
      </c:forEach>
    </ul>
  </li>

</ul>
  </body>
</html>
