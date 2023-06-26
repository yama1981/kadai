<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>ルーレット</title>

</head>
<body>
<div class="wrapper">
	<h1>ルーレット</h1>

	<button class="btn  btn-primary" onclick="location.reload();">押してください</button>
	<p class="lead">ルーレットの結果：<span id="result"> ${result}</span></p>
	<div class="marquee2"><span><p>1:<font color="chocolate">吉野家</font>　2：<font color="blue">松屋</font>　3：<font color="vermilion">すき家</font>　4:<font color="yellow">マクドナルド</font>　5:<font color="grean"> コンビニ</font></p></span></div>
	<p class="text-center"><a href="/kadai/Main">メインへ</a></p>
	</div>
</body>
</html>