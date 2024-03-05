<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>수정하기</title>
</head>
<body>
    <form action="/blog/update" method="post">
        <input type="hidden" name="num" value="${detail.num}">
        <p>제목 : <input type="text" name="title" value="${detail.title}"></p>
        <p>아이디 : <input type="text" name="id" value="${detail.id}"></p>
        <p>내용 : <textarea name="content" rows="5" cols="3">${detail.content}</textarea></p>
        <p><input type="submit" value="수정"></p>
        <p><input type="reset" value="취소"></p>
    </form>
</body>
</html>
