<%-- 
    Document   : test-form
    Created on : Dec 13, 2019, 8:09:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/jquery-3.4.1.min.js" />"></script>
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="rol-4">
                    <ul class="nav flex-column">
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Menu</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Question Management</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Test Management</a>
                        </li>
                    </ul>
                </div>
                <div class="rol-8">
                    <center>Create Test</center>
                    <div style="color: white">
                        <form>
                            <div class="form-group">
                                <label>Test Name</label>
                                <input>
                                <label>Description</label>
                                <input>
                                <label>Test time (minutes)</label>
                                <input>
                                <label>Question number</label>
                                <input>
                            </div>

                            <div class="form-row align-items-center">
                                <div class="col-auto my-1">
                                    <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                                        <option selected>Type Name</option>
                                        <option value="1">Toan</option>
                                        <option value="2">Ly</option>
                                        <option value="3">Hoa</option>
                                    </select>
                                </div>

                            </div>
                            <label>PassWord</label>
                            <input>
                        </form>
                        </form>
                    </div>
                </div>
            </div>>
        </div>
    </body>
</html>
