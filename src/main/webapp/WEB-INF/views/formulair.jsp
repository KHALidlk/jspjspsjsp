<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Message</title>
</head>
<body>
<h1>${message}</h1>
<h2>Add New Student</h2>
<form action="hello" method="post">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
    </div>
    <div>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
    </div>
    <div>
        <label for="note">Note Modul1 (/20):</label>
        <input type="number" id="note" name="notes" step="0.01" min="0" max="20" required>
        <label for="note">Note Modul2 (/20):</label>
        <input type="number" id="note" name="notes" step="0.01" min="0" max="20" required>
        <label for="note">Note Modul3 (/20):</label>
        <input type="number" id="note" name="notes" step="0.01" min="0" max="20" required>

    </div>
    <button type="submit">Add Student</button>
</form>
 </ul>
</body>
</html>
