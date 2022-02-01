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
			<form action="manglang" method="post">
				<input type="hidden" name="login" value="<%= login %>"/>
				<input type="submit" name="btn" value="rus" width=50 height=50 alt="Русский"/>
				<input type="submit" name="btn" value="eng" width=50 height=50 alt="English"/>
				<% if (lang) out.println("Менеджер"); else out.println("Manager"); %>: ${login}
			</form>
		</header>

	<div class = "outer">
		<div class = "inner">
			<div class = "control" align="right">
				<form action="newRoom.jsp" method="post">
   					<input type="hidden" name="language" value="<%= lang %>"/>
					<input type="submit" name="btnNew" value=<% if (lang) out.println("Новая комната"); else out.println("New room"); %> width=200 height=50/>
				</form>
				<form action="mangExit" method="post">
   					<input type="hidden" name="language" value="<%= lang %>"/>
					<input type="submit" name="btnExit" value=<% if (lang) out.println("Выйти"); else out.println("Exit"); %> width=200 height=50/>
				</form>
				<table class="table">
					<tr>
					    <th><% if (lang) out.println("#"); else out.println("id"); %></th>
					    <th><% if (lang) out.println("Тип"); else out.println("Type"); %></th>
					    <th><% if (lang) out.println("Цена"); else out.println("Cost"); %></th>
					    <th><% if (lang) out.println("Зарезервирована"); else out.println("Booked"); %></th>
					    <th><% if (lang) out.println("Пользователь"); else out.println("User"); %></th>
				  	</tr>
				 	<%
				 		ArrayList<Room> rooms = (ArrayList<Room>)request.getAttribute("rooms");
				 		for (Room room: rooms) {
				 			out.println("<tr><td>" + room.getId() + "</td><td>" + room.getType() + "</td><td>" + room.getCost() + "</td><td>" + room.getBooked() + "</td><td>" + room.getUser() + "</td></tr>");
				 		}
				 	%>
				</table>
			</div>
		</div>
	</div>

</body>

</html>