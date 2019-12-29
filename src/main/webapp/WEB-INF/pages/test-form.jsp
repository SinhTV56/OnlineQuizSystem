<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-3.4.1.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <div class="container">
            <div class="col-md-offset-2 col-md-7">
                <h2 class="text-center">Create Test</h2>
                <div class="panel panel-info">
                    <div class="panel-body">
                        <form:form action="saveTest" cssClass="form-horizontal"
                                   method="post" modelAttribute="test">

                            <div class="form-group">
                                <label for="test_name" class="col-md-3 control-label">Test Name</label>
                                <div class="col-md-9">
                                    <form:input path="test_name" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="description" class="col-md-3 control-label">Description</label>
                                <div class="col-md-9">
                                    <form:input path="description" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="testtime" class="col-md-3 control-label">Test-time (minutes)</label>
                                <div class="col-md-9">
                                    <form:input path="testtime" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="question_number" class="col-md-3 control-label">Question number</label>
                                <div class="col-md-9">
                                    <form:input path="question_number" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="test_type_id" class="col-md-3 control-label">Test type</label>
                                <div class="col-md-9">
                                <form:select path="test_type_id" cssClass="form-control">
                                    <c:forEach items="${test.list_type}" var="type">
                                        <form:option value="${type}"></form:option>
                                    </c:forEach>
                                </form:select>
                                    </div>
                            </div>

                            <div class="form-group">
                                <label for="password" class="col-md-3 control-label">Password</label>
                                <div class="col-md-9">
                                    <form:input path="password" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <!-- Button -->
                                <div class="col-md-offset-3 col-md-9">
                                    <form:button class="btn btn-primary">Save</form:button>
                                        <input type="button" value="Cancel"
                                               onclick="window.location.href = 'list'; return false;"class="btn btn-primary"/>
                                    </div>
                                </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
