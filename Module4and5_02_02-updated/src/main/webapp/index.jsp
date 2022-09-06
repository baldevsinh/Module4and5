<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend style="font-size: 200%">Register</legend>
		<form action="ReadUpdateServlet" method="post">

			<pre>
Name  : <input type="text" name="name" placeholder="enter name" /><br>
Email : <input type="email" name="email" placeholder="enter email" /><br>
Phone : <input type="tel" name="phone" placeholder="enter phone" /><br>
     <input type="submit" name="update" value="Submit" />

</pre>

		</form>
	</fieldset>

</body>
</html>