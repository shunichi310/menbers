<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>会員情変更画面</p>

<form action="indicate.java" method = post>
<p>会員番号<input type = "text" name = no>
<input type ="submit" value = "表示"/>
</p>
</form>


<form action="modify.action" method = post>
<p>名前<input type = "text" name = "name"></p>
<p>年齢<input type = "text" name = "age"></p>
<p>
生年月日

<select name = "year">
<c:forEach var="i" begin="1920" end="2020">
	<option value = "${i}">${i}</option>
</c:forEach>
</select>

<select name = "month">
<c:forEach var="z" begin="1" end="12">
	<option value = "${z}">${z}</option>
</c:forEach>
</select>

<select name = "day">
<c:forEach var="x" begin="1" end="31">
	<option value="${x}">${x}</option>
</c:forEach>
</select>

</p>
<p><input type ="submit" value = "変更"/>
</form>

<form action="menu.jsp" method = post>
<input type ="submit" value = "戻る"/>
</form>
</body>
</html>