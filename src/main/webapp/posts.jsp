<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="head.jsp"/>
</head>
<body>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <h1>
                All posts
            </h1>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <c:forEach var="post" items="${posts}">
                <li>
                    <c:out value="${post.getTitle()}"/>
                </li>
            </c:forEach>
        </div>
    </div>
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <a href="<%=application.getContextPath()%>/new-post" class="btn btn-primary">New post</a>
        </div>
    </div>
</div>
</body>
</html>
