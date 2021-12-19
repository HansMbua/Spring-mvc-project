<%--
  Created by IntelliJ IDEA.
  User: hansmbua
  Date: 26.10.21
  Time: 06:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <style><%@include file="/WEB-INF/view/style/style.css"%></style>
    <title>Process Form</title>
</head>
<body class="bodyclass">
<div class="form">
    <div class="form-first">

        <form:form action="processForm" modelAttribute="student" class="form-link">

            First name: <form:input path="firstName" class="form-items"/>
            <br><br>

            Last name: <form:input path="lastName" class="form-items"/>
            <br><br>
            Country:
            <form:select path="country" class="form-items">
                <form:options items="${student.countryOptions}"/>
                <%--    <form:option value="France" label="France"/>--%>
                <%--    <form:option value="Germany" label="Germany"/>--%>
                <%--    <form:option value="India" label="India"/>--%>
            </form:select>
            <br><br>
            Fevorite Language:
            <br>
            java <form:radiobutton path="favoriteLanguage" value="java" class="form-items"/>
            C# <form:radiobutton path="favoriteLanguage" value="C#" class="form-items"/>
            HTML <form:radiobutton path="favoriteLanguage" value="HTML" class="form-items"/>
            SPRING <form:radiobutton path="favoriteLanguage" value="SPRING" class="form-items"/>
            <br><br>
            Linux <form:checkbox path="operatingSystem" value="Linux"/>
            Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
            Windows <form:checkbox path="operatingSystem" value="Windows"/>
            <br><br>


            <input type="submit" value="Submit" class="form-items">


        </form:form>

    </div>


</div>
</body>
</html>
