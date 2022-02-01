<!DOCTYPE html>
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
    	%>
    	<header class="lang">
				<form action="newroomlang" method="post">
					<input type="submit" name="btn" value="RU" class="btn btn-warning " alt="Русский"/>
					<input type="submit" name="btn" value="EN" class="btn btn-warning en" alt="English"/>
				</form>
			</header>


		<div class = "reg-rectangle-container">
			<div id = "rectangle" align = "center">
				<h3 class="form-title"> <% if (lang) out.println("Новая комната"); else out.println("New room"); %> </h1>
				<form action="newroom" method="POST" class="new-room">
					<input type="hidden" name="lang" value="<%= lang %>"/>
					<% if (lang) out.println("Тип"); else out.println("Type"); %> <br>
					<input name="type"/><br>
	    			<% if (lang) out.println("Цена"); else out.println("Cost"); %> <br>
	    			<input name="cost"/><br><br>
	   				<input type="submit" class="btn btn-warning" value="<% if (lang) out.println("Создать"); else out.println("Submit"); %>"/>
				</form>
			</div>
		</div>
    </body>
</html>