<!DOCTYPE html>

<html>

<head>

 <link rel="stylesheet" type="text/css"

            href="${pageContext.request.contextPath}/resources/css/greeting-form.css">

                <script src="${pageContext.request.contextPath}/resources/js/greeting-form.js"></script>



<title> Greeting - Input Form</title>
</head>

<body>

  <form action="processFormVersionTwo" method="GET">
    <input type="text" name="name"
    placeholder="What's your name?" />

    <input type="submit" />

    </form>

</body>




</html>