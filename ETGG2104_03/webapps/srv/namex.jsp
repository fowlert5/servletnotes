<!DOCTYPE html>
<html>
    <head>
        <meta charset=utf8>
    </head><body>
<div>
    
<% if( request.getSession().getAttribute("name") == null ) { %>
    You are not logged in. Log in, http://localhost:2020/srv/login, or register, http://localhost:2020/srv/register, a new account.
<% } else { %>
    <!-- in HTML, we can expand a session variable with the {} notation -->
    You are logged in as: ${realname} Logout: http://localhost:2020/srv/logout
<% } %>
</div>
</body>
</html>
