<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>멤버 목록</title>
</head>
<body>
    <div class="container">
        <h2>멤버리스트</h2>
        <div class="panel panel-default">
            <div class="panel-body">
                <table class="table table-bordered table-hover" border="1">
                    <tr>
                        <td>번호</td>
                        <td>이름</td>
                        <td>암호</td>
                        <td>주소</td>
                    </tr>
                    <c:forEach var="vo" items="${list}">
                        <tr>
                            <td>${vo.num}</td>
                            <td><a href="/memDetail?num=${vo.num}">${vo.name}</a></td>
                            <td>${vo.pwd}</td>
                            <td>${vo.addr}</td>
                        </tr>
                    </c:forEach>
                </table>
                <p><a href="/memReg">등록</a></p>
            </div>
        </div>
    </div>
</body>
</html>
