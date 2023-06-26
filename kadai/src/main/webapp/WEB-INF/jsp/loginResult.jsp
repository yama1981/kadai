<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    User loginUser = (User) session.getAttribute("loginUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ルーレット</title>
</head>
<body
<div class="wrapper">
	<h1>ログイン</h1>
	<% if(loginUser != null) { %>
	<p>ログインに成功しました</p>
	<p>ようこそ<%= loginUser.getName() %>さん</p>
	<a href="/kadai/Main">メインメニュー</a>
	<% } else { %>
	<p>ログインに失敗しました</p>
	<a href="/kadai/">TOPへ</a>
	<% } %>
</div>
</body>
</html>