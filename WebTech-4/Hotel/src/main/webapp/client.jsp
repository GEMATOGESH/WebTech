<!DOCTYPE html>
<%@page import="java.util.ArrayList" %>
<%@page import="logic.Room" %>
<html lang="ru">
<head>
	<link rel="stylesheet" href="styles.css">
	<link rel="stylesheet" href="bootstrap.css">
    <meta charset="utf-8">
    <meta http-equiv="default-style" content="text/css">
    <title>Hotel</title>
</head>
<body class = "backgr">
	<% boolean lang = false;
	   	String str = request.getParameter("language");
	   	Object obj = request.getAttribute("language");
	   	if (str != null) {
	   		if (str.equals("true"))
	   			lang = true;
	   	}
	   	else {
	       	if (obj != null) {
	       		lang = (boolean)obj;
	       	}
	   	}

        String login = (String)session.getAttribute("login");
   	%>
   	<header class="lang">
			<form action="userlang" method="post">
				<input type="hidden" name="login" value="<%= login %>"/>
				<input type="submit" name="btn" value="RU" class="btn btn-warning" alt="Русский"/>
				<input type="submit" name="btn" value="EN" class="btn btn-warning en" alt="English"/>
				<% if (lang) out.println("Пользователь"); else out.println("User"); %>: ${login}
			</form>
		 </header>

	<div class = "outer">
		<div class = "inner">
			<div class = "control" align="right">
				<form action="userExit" method="post" class="exit">
   					<input type="hidden" name="language" value="<%= lang %>"/>
					<input type="submit" class="btn btn-danger" name="btnExit" value="<% if (lang) out.println("Выйти"); else out.println("Exit"); %>" width=200 height=50/>
				</form>
				<table class="table">
					<tr>
					    <th><% if (lang) out.println("#"); else out.println("id"); %></th>
					    <th><% if (lang) out.println("Тип"); else out.println("Type"); %></th>
					    <th><% if (lang) out.println("Цена"); else out.println("Cost"); %></th>
					    <th><% if (lang) out.println("Зарезервирована"); else out.println("Booked"); %></th>
				  	</tr>
				 	<%
				 		ArrayList<Room> rooms = (ArrayList<Room>)request.getAttribute("rooms");
				 		for (Room room: rooms) {
				 			if (room.getBooked()) {
				 				out.println("<tr><td>" + room.getId() + "</td><td>" + room.getType() + "</td><td>" + room.getCost() + "</td><td>" + room.getBooked() + "</td></tr>");
				 			}
				 			else {
								String form = " <form action= \"book\" method=\"post\"> <input type=\"hidden\" name=\"language\" value=" + lang + " /> <input type=\"hidden\" name=\"login\" value=" + login + " /> <input type=\"hidden\" name=\"id\" value=" + room.getId() + " /><input type=\"submit\" class=\"btn btn-danger\" value=\"book\"/></form> ";
				 				out.println("<tr><td>" + room.getId() + "</td><td>" + room.getType() + "</td><td>" + room.getCost() + "</td><td>" + form + "</td></tr>");
				 			}
				 		}
				 	%>
				</table>
			</div>
		</div>
	</div>

</body>

</html>