<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="vi">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Student List</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    </head>
</head>

<body>
    <div class="container">
        <h3 class="mt-4">Them sinh vien</h3>
        <form:form action="${pageContext.request.contextPath}/test/save" modelAttribute="student" method="POST" cssClass="col-6 mt-2">
            <form:hidden path="studentId" />
            <div class="form-group">
                <label>Ho</label>
                <form:input path="lastName" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Ten</label>
                <form:input path="firstName" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Email</label>
                <form:input path="email" type="email" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Ngay sinh</label>
                <form:input path="birthday" type="date" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Gioi tinh</label><br/>
                <div class="form-check form-check-inline">
                    <form:radiobutton path="gender" value="0" checked="true" cssClass="form-check-input" />
                    <label class="form-check-label">Nam</label>
                </div>
                <div class="form-check form-check-inline">
                    <form:radiobutton path="gender" value="1" cssClass="form-check-input" />
                    <label class="form-check-label">Nu</label>
                </div>
            </div>
            <div class="form-group">
                <button class="btn btn-info" type="submit">Them</button>
            </div>
        </form:form>
    </div>
</body>
</html>
