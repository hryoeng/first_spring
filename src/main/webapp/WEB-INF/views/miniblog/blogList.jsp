<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mini Blog</title>
</head>
<body>
    <div class="container">
        <h2>미니 블로그 리스트</h2>
        <div class="panel panel-default">
            <div class="panel-body">
                <table class="table table-bordered table-hover" border="1">
                    <tr>
                        <td>번호</td>
                        <td>제목</td>
                        <td>아이디</td>
                        <td>작성일</td>
                    </tr>
                    <c:forEach var="vo" items="${list}">
                        <tr>
                            <td><a href="/blog/detail?num=${vo.num}">${vo.num}</a></td>
                            <td><a href="/blog/detail?num=${vo.num}">${vo.title}</a></td>
                            <td>${vo.id}</td>
                            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${vo.regdate}"></fmt:formatDate></td> <!--날짜 형식 변경-->
                        </tr>
                    </c:forEach>
                </table>
                <p><a href="/blog/reg">등록</a></p>
            </div>
        </div>
    </div>
</body>
</html>
