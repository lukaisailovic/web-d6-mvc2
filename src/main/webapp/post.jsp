<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <jsp:include page="head.jsp"/>
</head>
<body>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <h1>
                <c:out value="${post.getTitle()}"/>
            </h1>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col-md-6">
            <strong>
                <fmt:formatDate value="${post.getCreatedAt()}" pattern="dd-MM-yyyy"  />
            </strong>
            <p class="text-muted">
                <c:out value="${post.getAuthor()}"/>
            </p>
            <p>
                <c:out value="${post.getContent()}"/>
            </p>
        </div>
    </div>
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <h4>
                Comments
            </h4>
        </div>
    </div>
</div>
</body>
</html>

