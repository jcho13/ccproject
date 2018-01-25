<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
				<div class="panel panel-default">
                    <div class="panel-body">
                      <div class="row form-group">
                         <label class="col-lg-2">작성자</label>
                         <div class="col-lg-8">
                         	<span class="label label-danger">${noticeVO.nwriter}</span>
                         </div>
                      </div>
               		  <div class="row form-group">
                        <label class="col-lg-2">제목</label>
                           <div class="col-lg-8">
                           	<input type="text" class="form-control" id="ntitle" name="ntitle" maxlength="255" 
                           		value="${noticeVO.ntitle}" />
                           </div>
                       </div>
	                   	<div class="row form-group">
                           <label class="col-lg-2">내용</label>
                           <div class="col-lg-8">
                           	<textarea class="form-control" id="ncontent" name="ncontent">${noticeVO.ncontent}</textarea>
                           </div>
                       </div>
                        <div class="row form-group">
                            <label class="col-lg-2">작성 일자</label>
                            <div class="col-lg-8">
                            	 <span class="label label-info"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${noticeVO.nrdate}"/></span>
                            </div>
                        </div>
                    </div>
	           </div>
	              
			    <button class="btn btn-outline btn-primary" onclick="fn_moveToURL('notice.do')" >공지 리스트</button>
                <button class="btn btn-outline btn-danger" onclick="fn_moveToURL('noticeDelete.do?nno=${noticeVO.nno}', '삭제')" >삭제</button>
                <button class="btn btn-outline btn-warning" onclick="fn_moveToURL('noticeWrite.do?nno=${noticeVO.nno}')" >수정</button>
            </div>
       </div>
</div>
           

 <%@include file="../../admin/include/plugin_js.jsp" %>
<script type="text/javascript">
	function fn_moveToURL(url, msg){
		if (msg) {
			if (!confirm( msg + " 하시겠습니까??")) return;
		}
		location.href=url;
	}
</script>


</body>

</html>
