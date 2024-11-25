<%@ page contentType="text/html;charset=UTF-8" language="java"
         isELIgnored="false" %><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
  <title>현재 듣고 있는 과목 목록</title>
</head>
<body>
<h1>현재 듣고 있는 과목 목록</h1>
<ul>
  <c:forEach var="subject" items="${subjects}">
    <li>${subject}</li>
  </c:forEach>
</ul>
<a href="${pageContext.request.contextPath}/">홈으로 돌아가기</a>
</body>
</html>
