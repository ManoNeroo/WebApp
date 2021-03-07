<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <h3 class="mt-4">Danh sach sinh vien</h3>
        <a class="btn btn-info mt-2 mb-2" href="${pageContext.request.contextPath}/test/add">Them</a>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Ho ten</th>
                    <th>Email</th>
                    <th>Ngay sinh</th>
                    <th>Gioi tinh</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.lastName} ${student.firstName}</td>
                        <td>${student.email}</td>
                        <td><fmt:formatDate type="date" value = "${student.birthday}"/></td>
                        <td>${student.gender == 0 ? "Nam" : "Nu"}</td>
                        <td>
                            <a class="btn btn-sm btn-warning" href="${pageContext.request.contextPath}/test/edit?student_id=${student.studentId}">Sua</a>
                            <a class="ml-2 btn btn-sm btn-danger" href="${pageContext.request.contextPath}/test/delete?student_id=${student.studentId}"
                               onclick="return confirm('Xac nhan xoa!')">Xoa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
