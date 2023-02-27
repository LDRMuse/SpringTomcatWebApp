<!DOCTYPE html>
<html>

<head>

    <link rel="stylesheet" type="text/css"

            href="${pageContext.request.contextPath}/resources/css/process-form.css">

                <script src="${pageContext.request.contextPath}/resources/js/process-form.js"></script>


</head>

<body>
<h2>Your name in lowercase: ${param.name}</h2>

<hr>

<h2>The message in uppercase: ${message}!!</h2>

<hr>

<a href="/">Go to Home Page</a>

</body>

</html>