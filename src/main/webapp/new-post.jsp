<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="head.jsp"/>
</head>
<body>
<div class="container">
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <h1>
                Create new post
            </h1>
        </div>
    </div>
    <div class="row justify-content-center mt-5">
        <div class="col-md-6">
            <form action="<%=application.getContextPath()%>/new-post" method="post">

                <div class="form-group my-1">
                    <label for="author">Author:</label>
                    <input type="text" class="form-control" name="author" id="author">
                </div>

                <div class="form-group my-1">
                    <label for="title">Title:</label>
                    <input type="text" class="form-control" name="title" id="title">
                </div>

                <div class="form-group my-1">
                    <label for="content">Content:</label>
                    <textarea name="content" id="content" cols="30" rows="10" class="form-control"></textarea>
                </div>

                <div class="form-group mt-3">
                    <button type="submit" class="btn btn-primary">Save Post</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
