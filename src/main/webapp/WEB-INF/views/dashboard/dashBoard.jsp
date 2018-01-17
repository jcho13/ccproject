<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@include file="../dashboard/include/head.jsp" %>

<body>

    <div id="wrapper">
		 <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
       		<%@include file="../dashboard/include/nav.jsp" %>

            <%@include file="../dashboard/include/sidebar.jsp" %>
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Blank</h1>
                        <c:forEach items="${list}" var="list">
                        	${list.title}
                        </c:forEach>
                    </div>
                   
                </div>
            </div>
        </div>
        

    </div>
    <!-- /#wrapper -->

 <%@include file="../dashboard/include/plugin_js.jsp" %>

</body>

</html>
