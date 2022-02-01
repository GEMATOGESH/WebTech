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
				<form action="reglang" method="post">
					<input type="submit" name="btn" value="RU" class="btn btn-warning" alt="Русский"/>
					<input type="submit" name="btn" value="EN" class="btn btn-warning en" alt="English"/>
				</form>
			</header>

		<%-- <div class = "background-image"> </div> --%>

		<div class = "reg-rectangle-container">
			<div id = "rectangle" align="center">
				<form action="reg" method="POST" class="reg">
    				<input type="hidden" name="lang" value="<%= lang %>"/>
					<h3 class="form-title"> <% if (lang) out.println("Регистрация"); else out.println("Registration"); %> </h1>
					<% if (lang) out.println("Логин"); else out.println("Login"); %><br>
					<input type="text" name="login"/><br>
	    			<% if (lang) out.println("Пароль"); else out.println("Password"); %><br>
	    			<input type="password" name="password"/><br>
	    			<% if (lang) out.println("Повторите пароль"); else out.println(" Repeat password"); %><br>
	    			<input type="password" name="password"/><br><br>
    				<input type="submit" class="btn btn-warning" value="<% if (lang) out.println("Зарегистрироваться"); else out.println("Continue"); %>"/>
				</form>
				<form  action = "auth.jsp">
    				<input type="hidden" name="language" value="<%= lang %>"/>
    				<input type="submit" class="btn btn-danger" value="<% if (lang) out.println("Отмена"); else out.println("Cancel"); %>"/>
   				</form>
				<p style="color:red;">${error}</p>
			</div>
		</div>
    </body>
</html>