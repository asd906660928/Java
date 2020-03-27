<%--
  Created by IntelliJ IDEA.
  User: wxh1
  Date: 2020/3/25
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${student==null?'addStudent':'doUpdate'}" method="post">
    <c:if test="${student!=null}">
        <p>编号：<input type="text" name="id" value="${student.id}"></p>
    </c:if>

    <p>姓名：<input type="text" name="name" value="${student.name}"></p>
    <p>性别：<input type="text" name="sex" value="${student.sex}"></p>
    <p>年级id：<input type="text" name="gradeId" value="${student.gradeId}"></p>
    <p><input type="submit" value="提交"></p>

</form>
</body>
</html>
