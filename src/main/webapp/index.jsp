<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Online Quiz Management!</h1>
        <a href="<c:url value="/question/list" />">Question Management</a><br>
        <a href="<c:url value="/test/list" />">Test Management</a>
    </body>
</html>
