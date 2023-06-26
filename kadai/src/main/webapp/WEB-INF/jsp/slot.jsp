<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<script src="odometer.js"></script>
<title>Slot</title>
</head>
<body>
	<div class="wrapper">
	<h1>今夜の夕食は</h1>
	<h2><div class="marquee"><span><font color="black"> ${result}</font><font color="red"> ${result2}</font><font color="blue"> ${result3}</font> <font color="grean"> ${result4}</font></div></span> </h2>
	<p>こちらでどうですか。</p>
	<form action="Slot" method="GET">
	<input type="submit" value="押して下さい">
	</form>
	<p class="text-center"><a href="/kadai/Main">メインへ</a></p>
	</div>
</body>
</html>