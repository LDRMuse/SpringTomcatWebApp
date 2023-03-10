<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<DOCTYPE! html>


<html>
<head>

<link rel="stylesheet" type="text/css"

            href="${pageContext.request.contextPath}/resources/css/customer-form.css">

<title> Customer Form</title>
</head>

<body>

Fill out the form. Asterisk (*) means required.

<br><br>

  <form:form action="processForm" modelAttribute="customer">

      First name: <form:input path="firstName" />

      <br><br>

      Last name (*): <form:input path="lastName" />
      <form:errors path="lastName" cssClass="error" />

      <br><br>
      Free passes: <form:input path="freePasses" />
            <form:errors path="freePasses" cssClass="error" />

      <br><br>
      Postal Code: <form:input path="postalCode" />
            <form:errors path="postalCode" cssClass="error" />

      <br><br>
      Course code: <form:input path="courseCode" />
             <form:errors path="courseCode" cssClass="error" />

      <br>


      <input type="submit" value="Submit"/>

    </form:form>

</body>


</html>