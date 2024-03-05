<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>상세보기</title>
    <script>
        function delConfirm() {
            if(confirm("정말 "))
        }
    </script>
</head>
<body>
    <p>이름 : ${detail.name}</p>
    <p>암호 : ${detail.pwd}</p>
    <p>주소 : ${detail.addr}</p>
    <p><a href="/memList">목록</a></p>
    <p><a href="/memUpdate?num=${detail.num}">수정</a></p>
    <p><a href="/memDelete?num=${detail.num}">삭제</a></p>
</body>
</html>
