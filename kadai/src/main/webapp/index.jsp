<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>メニュー</title>
</head>
<body>
	<div class="wrapper">
	<h1>メニュー</h1>
	<form action="/kadai/Login" method="post">
	ユーザー名:<input type="text" name="name"><br>
	パスワード:<input type="text" name="pass"><br>
	<input type="submit" value="ログイン">
	</form>
	</div>
</body>
</html>