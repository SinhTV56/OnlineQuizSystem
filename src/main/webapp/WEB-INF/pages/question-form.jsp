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
                <h2 class="text-center">Create Question</h2>
                <div class="panel panel-info">
                    <div class="panel-body">
                        <form:form action="saveQuestion" cssClass="form-horizontal"
                                   method="post" modelAttribute="question">

                            <form:hidden path="question_id" />

                            <div class="form-group">
                                <label for="content" class="col-md-3 control-label">Question Content</label>
                                <div class="col-md-9">
                                    <form:input path="content" cssClass="form-control" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="correct_answer" class="col-md-3 control-label">Answer</label>
                                <div class="col-md-9">
                                    <form:input path="correct_answer" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="answer_1" class="col-md-3 control-label">Answer 1</label>
                                <div class="col-md-9">
                                    <form:input path="answer_1" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="answer_2" class="col-md-3 control-label">Answer 2</label>
                                <div class="col-md-9">
                                    <form:input path="answer_2" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="answer_3" class="col-md-3 control-label">Answer 3</label>
                                <div class="col-md-9">
                                    <form:input path="answer_3" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
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
