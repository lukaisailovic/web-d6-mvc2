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
                All posts
            </h1>
        </div>
    </div>
    <div class="row justify-content-center">
        <div class="col col-md-6">
            <ul class="list-group">
                <c:forEach var="post" items="${posts}">
                    <li class="list-group-item">
                        <h5 class="text-muted">
                            <div class="row">
                                <div class="col text-start">
                                    <p>
                                        <c:out value="${post.getTitle()}"/>
                                    </p>
                                </div>
                                <div class="col text-end">
                                    <p>
                                        <fmt:formatDate value="${post.getCreatedAt()}" pattern="dd-MM-yyyy"  />
                                    </p>
                                </div>
                            </div>
                        </h5>
                        <p>
                            <c:out value="${post.getTruncatedContent()}"/>
                        </p>
                        <a href="" class="text-decoration-none text-muted">
                            Opsirnije...
                        </a>
                    </li>
                </c:forEach>
            </ul>

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
