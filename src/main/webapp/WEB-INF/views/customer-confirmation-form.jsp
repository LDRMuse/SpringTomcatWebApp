<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

<title>Customer Confirmation</title>

</head>

<body>
<h2>The customer is confirmed: ${customer.firstName} ${customer.lastName}</h2>

<br>

You have ${customer.freePasses} free passes.

<br>

Postal Code: ${customer.postalCode}

<br>

<a href="/">Go to Home Page</a>

</body>

</html>