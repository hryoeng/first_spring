<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>상세보기</title>
    <script>
        function delConfirm() {
            if(confirm("정말 삭제하시겠습니까?")) {
                    return true;
                } else {
                    return false;
                }
        }
    </script>
</head>
<body>
    <p>제목 : ${detail.title}</p>
    <p>아이디 : ${detail.id}</p>
    <p>내용 : ${detail.content}</p>
    <td>작성일 : <fmt:formatDate pattern="yyyy-MM-dd" value="${detail.regdate}"></fmt:formatDate></td> <!--날짜 형식 변경-->
    <p><a href="/blog/list">목록</a></p>
    <p><a href="/blog/update?num=${detail.num}">수정</a></p>
    <p><a href="/blog/delete?num=${detail.num}" onclick="return delConfirm()">삭제</a></p>
</body>
</html>
