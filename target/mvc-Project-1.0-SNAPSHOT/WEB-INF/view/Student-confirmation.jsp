<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

the Student Country: ${student.country}
<br><br>
Student Favorite Language: ${student.favoriteLanguage}
<br><br>
Operation System:
<ul>
   <c:forEach var="temp" items="${student.operatingSystem}">
       <li>${temp}</li>

   </c:forEach>
</ul>
<br><br>
</body>
</html>
