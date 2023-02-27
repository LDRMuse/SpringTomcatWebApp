<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

<head>

<title> Student Confirmation</title>
</head>

</head>

<body>

Confirmed: ${student.firstName} ${student.lastName}
<br>
<br>
Country: ${student.country}
<br>
<br>
Favorite Coding Language: ${student.favoriteLanguage}
<br>
<br>
<br>
Operating System(s):
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
<br>
<br>
<br>
<a href="/">Go to Home Page</a>

</body>

</html>