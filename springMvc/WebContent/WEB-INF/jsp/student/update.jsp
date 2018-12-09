<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>修改学生</title>
</head>
<body>
<form action="student/save.do" method="post">
<table>
<tr>
    <th colspan="2">学生修改</th>
</tr>
<tr>
  <td>姓名：<input type="text" name="name" value="${student.username }" /></td>
</tr>
<tr>
  <td>年龄：<input type="text" name="age" value="${student.age }" /></td>
</tr>
<tr>
  <td>
  <input type="hidden" name="id" value="${student.id }" />
  <input type="submit" value="提交" /></td>
</tr>
</table>

</form>
</body>
</html>