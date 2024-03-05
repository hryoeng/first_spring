<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>수정하기</title>
</head>
<body>
    <form action="/memUpdate" method="post">
        <input type="hidden" name="num" value="${detail.num}">
        <p>이름 : <input type="text" name="name" value="${detail.name}"></p>
        <p>암호 : <input type="text" name="pwd" value="${detail.pwd}"></p>
        <p>주소 : <input type="text" name="addr" value="${detail.addr}"></p>
        <p><input type="submit" value="수정"></p>
        <p><input type="reset" value="취소"></p>
    </form>
</body>
</html>
