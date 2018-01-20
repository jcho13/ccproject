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
                    <h1 class="page-header">공지사항</h1>
                </div>
            </div>
           
         
            	<form id="form1" name="form1" role="form" action="noticeSave.do" method="post" onsubmit="return fn_formSubmit();" >
            		<input type="hidden" name="nno" value="${noticeVO.nno}">
					<div class="panel panel-default">
	                    <div class="panel-body">
	                    	<div class="row form-group">
	                            <label class="col-lg-2">제목</label>
	                            <div class="col-lg-8">
	                            	<input type="text" class="form-control" id="ntitle" name="ntitle" maxlength="255" 
	                            	value="${noticeVO.ntitle}">
	                            </div>
	                        </div>
	                    	<div class="row form-group">
	                            <label class="col-lg-2">내용</label>
	                            <div class="col-lg-8">
	                            	<textarea class="form-control" id="ncontent" name="ncontent">${noticeVO.ntitle}</textarea>
	                            </div>
	                        </div>
	                    </div>
	                </div>
			        <button class="btn btn-outline btn-primary">저장하기</button>
			        <button class="btn btn-outline btn-primary" onclick="location.href='notice.do'">리스트</button>
				</form>	
                
            </div>
            <!-- /.row -->
          </div>
            </div>
       


 <%@include file="../../admin/include/plugin_js.jsp" %>



</body>

</html>
