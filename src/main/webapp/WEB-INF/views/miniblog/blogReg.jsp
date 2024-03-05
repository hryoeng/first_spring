<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>등록하기</title>
</head>
<body>
    <form action="/blog/reg" method="post">
        <p>제목 : <input type="text" name="title"></p>
        <p>아이디 : <input type="text" name="id"></p>
        <p>내용 : <textarea name="content" rows="5" cols="3"></textarea></p>
        <p><input type="submit" value="등록"></p>
        <p><input type="reset" value="취소"></p>
    </form>
</body>
</html>
