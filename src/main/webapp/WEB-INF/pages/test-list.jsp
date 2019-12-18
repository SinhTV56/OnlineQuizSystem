<%-- 
    Document   : list-customer
    Created on : Dec 8, 2019, 12:27:02 PM
    Author     : XV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	      rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery-3.4.1.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <title>JSP Page</title>
    </head>
    <body>
	<div class="container">
	    <div class="col-md-offset-1 col-md-10">
		<h2>QUESTION MANAGEMENT</h2>
		<hr />

		<input type="button" value="Create Question"
		       onclick="window.location.href = 'showForm'; return false;"
		       class="btn btn-primary"/>
		<br/><br/>
		<div class="panel panel-info">
			<table class="table table-striped table-bordered">
                            <tr class="th-question">
				<th>Question Content</th>
				<th>Correct Answer</th>
				<th>Answer 1</th>
				<th>Answer 2</th>
                                <th>Answer 3</th>
                                <th>Action</th>
			    </tr>

			    <!-- loop over and print our questions -->
			    <c:forEach var="tempQuestion" items="${questions}">

				<!-- construct an "update" link with customer id -->
				<c:url var="updateLink" value="/question/updateForm">
				    <c:param name="questionId" value="${tempQuestion.question_id}" />
				</c:url>

				<!-- construct an "delete" link with customer id -->
				<c:url var="deleteLink" value="/question/delete">
				    <c:param name="questionId" value="${tempQuestion.question_id}" />
				</c:url>

				<tr>
				    <td>${tempQuestion.content}</td>
				    <td>${tempQuestion.correct_answer}</td>
				    <td>${tempQuestion.answer_1}</td>
                                    <td>${tempQuestion.answer_2}</td>
				    <td>${tempQuestion.answer_3}</td>

				    <td>
					<!-- display the update link --> 
					<a href="${updateLink}">Update</a>| 
                                        
					<a href="${deleteLink}"	onclick="if (!(confirm('Are you sure you want to delete this question?')))
					    return false">Delete</a>
				    </td>
				</tr>
			    </c:forEach>
			</table>
		</div>
	    </div>
	</div>
    </body>
</html>
