<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User,model.Mutter,java.util.List" %>
    <%
    User loginUser = (User) session.getAttribute("loginUser");
    List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
    String errorMsg = (String) request.getAttribute("errorMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ルーレット</title>
</head>
<body>
<div class="wrapper">
	<h1>メインメニュー</h1>
	<p>
	<%= loginUser.getName() %>さん、ログイン中
	<a href="/kadai/Logout">ログアウト</a>
	</p>
	<p><a href="/kadai/RouletteController">ルーレット</a></p>
	<p><a href="/kadai/Slot">スロット</a></p
	<p><a href="/kadai/HighLowController">数あてゲーム</a></p>
	<p><a href="/kadai/Main">更新</a></p>
	<form action="/kadai/Main" method="post">
	<input type="text" name="text">
	<input type="submit" value="つぶやく">
	</form>
	<% if (errorMsg != null) { %>
	<p><%= errorMsg %></p>
	<% } %>
	<% for(Mutter mutter : mutterList) { %>
	<p><%= mutter.getUserName()  %>:<%= mutter.getText() %></p>
	<% } %>
	</div>
</body>
</html>