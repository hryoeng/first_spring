<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="/memReg" method="post">
        <p>이름 : <input type="text" name="name"></p>
        <p>암호 : <input type="text" name="pwd"></p>
        <p>주소 : <input type="text" name="addr"></p>
        <p><input type="submit" value="등록"></p>
        <p><input type="reset" value="취소"></p>
    </form>
</body>
</html>
