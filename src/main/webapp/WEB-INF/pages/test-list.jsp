<%-- 
    Document   : list-test
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
		<h2>TEST MANAGEMENT</h2>
		<hr />

		<input type="button" value="Create Test"
		       onclick="window.location.href = 'showForm'; return false;"
		       class="btn btn-primary"/>
		<br/><br/>
		<div class="panel panel-info">
			<table class="table table-striped table-bordered">
                            <tr class="th-test">
				<th>Quiz Code</th>
				<th>Quiz Name</th>
				<th>Total Times</th>
				<th>Total Questions</th>
                                <th>Description</th>
                                <th>Quiz Type</th>
			    </tr>

			    <!-- loop over and print our tests -->
			    <c:forEach var="tempTest" items="${tests}">

				<!-- construct an "update" link with test id -->
				<c:url var="updateLink" value="/test/updateForm">
				    <c:param name="testId" value="${tempTest.test_id}" />
				</c:url>

				<!-- construct an "delete" link with test id -->
				<c:url var="deleteLink" value="/test/delete">
				    <c:param name="testId" value="${tempTest.test_id}" />
				</c:url>

				<tr>
				    <td>${tempTest.test_id}</td>
				    <td>${tempTest.test_name}</td>
				    <td>${tempTest.testtime}</td>
                                    <td>${tempTest.question_number}</td>
				    <td>${tempTest.description}</td>
                                    <td>${tempTest.test_type}</td>

				    <td>
					<!-- display the update link --> 
					<a href="${updateLink}">Update</a>| 
                                        
					<a href="${deleteLink}"	onclick="if (!(confirm('Are you sure you want to delete this test?')))
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
