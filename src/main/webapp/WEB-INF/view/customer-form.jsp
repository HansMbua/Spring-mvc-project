<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers Form </title>
    <style>
        .error{
           color: red;
        }
    </style>
</head>
<body>
<i>fill out the form .Asterick(*) means required.<i/>

    <form:form action="processForm"  modelAttribute="customer">
    firs Name: <form:input path="firstName"/>
    <br><br>
    Last Name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
    <br><br>
    <input type="submit"value="submit"/>


    </form:form>

</body>
</html>
