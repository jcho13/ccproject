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
                    <h1 class="page-header">공지사항 관리</h1>
                </div>
            </div>
                   			
                    <div class="row">
		                <div class="col-lg-12">
					            <button type="button" class="btn btn-outline btn-primary pull-right" onclick="fn_moveToURL('noticeWrite.do')">
					            <i class="fa fa-edit fa-fw"></i> 공지사항 작성</button>      
							</div>
		            </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                                               공지사항
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th class="col-lg-1" style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">No.</th>
                                            <th class="col-lg-7" style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">제목</th>
                                            <th class="col-lg-1" style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">작성자</th>
                                            <th class="col-lg-2" style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">작성일</th>
                                            <th class="col-lg-1" style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">조회수</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${noticeVO}" var="noticeVO">
	                                    <c:url var="link" value="noticeRead.do">
											<c:param name="nno" value="${noticeVO.nno}" />
										</c:url>
                                        <tr>
                                            <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">${noticeVO.nno}</td>
                                            <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;"><a href="${link}">${noticeVO.ntitle}</a></td>
                                            <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">${noticeVO.nwriter}</td>
                                            <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${noticeVO.nrdate}"/></td>
                                            <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;"><span class="label label-danger">${noticeVO.nviewcnt}</span></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
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
