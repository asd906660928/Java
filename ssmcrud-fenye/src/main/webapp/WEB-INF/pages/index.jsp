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
<body >
<div align="center">
    <a href="${pageContext.request.contextPath}/edit">增加学生信息</a>
    <table  border="1" cellpadding="20" cellspacing="0" >
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年级</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="student">
            <tr>

                <th>${student.id}</th>
                <th>${student.name}</th>
                <th>${student.sex}</th>
                <th>${student.gradeId}</th>
                <th>
                    <a href="edit?id=${student.id}" >编辑</a>
                    <a href="${pageContext.request.contextPath}/delete?id=${student.id}" >删除</a>
                </th>

            </tr>
        </c:forEach>
    </table>
    <span>第${pageInfo.pageNum}页 / 共${pageInfo.pages}页</span>
    <a href="students?pageNum=1" >首页</a>


    <c:if test="${pageInfo.hasPreviousPage}">
        <a href="students?pageNum=${pageInfo.pageNum-1}" >上一页</a>
    </c:if>
    <c:if test="${pageInfo.hasNextPage}">
        <a href="students?pageNum=${pageInfo.pageNum+1}" >下一页</a>
    </c:if>

    <a href="students?pageNum=${pageInfo.pages}" >尾页</a>
</div>
</body>
</html>
