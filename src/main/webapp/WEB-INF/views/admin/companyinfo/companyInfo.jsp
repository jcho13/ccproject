<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@include file="../../admin/include/head.jsp" %>

<body>

    <div id="wrapper">
		 <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
       		<%@include file="../../admin/include/nav.jsp" %>

            <%@include file="../../admin/include/sidebar.jsp" %>
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">업체정보</h1>
                </div>
            </div>
                <div class="row">
                    <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Hover Rows
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>회사명</th>
                                            <th>회사이메일</th>
                                            <th>전화번호</th>
                                            <th>회원가입일</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${list}" var="list">
                                        <tr>
                                            <td>${list.cpname}</td>
                                            <td>${list.cpemail}</td>
                                            <td>${list.cpcallnum}</td>
                                            <td>${list.cprdate}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                   
                </div>
            </div>
        </div>
   </div>

 <%@include file="../../admin/include/plugin_js.jsp" %>



</body>

</html>
