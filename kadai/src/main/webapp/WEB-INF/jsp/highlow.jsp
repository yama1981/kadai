<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "model.*"%>
    <%
    HighLow hl = (HighLow)session.getAttribute("hl");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>HighLow</title>
</head>
<body>
<div class="wrapper">
	<p>1～9の乱数を生成したよ！</p>
	<p>いくつかな？</p>
	<form action="/kadai/HighLowController" method ="post">
	<input type="number" name="userAns" value= "<%= hl.getUserAns() %>">
	<input type="submit" value="送信">
	</form>
	<% if(hl.getList().size() >0) {%>
		<p><%= hl.getMsg() %></p>
		<ol>
		<% for(int i:hl.getList()) {%>
			<li><%= i %></li>
			<% } %>
		</ol>
		<% } %>
		<% if(hl.getUserAns()==hl.getCorrectAns()) { %>
		<a href="/kadai/HighLowController">もう一度</a>
		<% } %>
		<a href="/kadai/Main">メインへ</a>
</div>
</body>
</html>