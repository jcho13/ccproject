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
          		<!-- <button class="btn btn-outline btn-primary" data-toggle="modal" data-target="#myModal" type="button">
                   <i class="fa fa-search"></i>검색하기
               </button>  -->
               <!--Blue select-->

                <%@include file="../../admin/include/searchModal.jsp" %>
				<button type="button" class="btn btn-outline btn-primary pull-right" onclick="fn_moveToURL('noticeWrite.do')">
	         	 <i class="fa fa-edit fa-fw"></i> 공지사항 작성
	            </button>      
		  </div>
  		</div>
       <div class="panel panel-default">
       		<div class="panel-heading">공지사항 </div>
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
					       <c:forEach items="${noticeVO}" var="noticeVO" varStatus="status">
				        	<c:url var="link" value="noticeRead.do">
								<c:param name="nno" value="${noticeVO.nno}" />
							</c:url>
			          		 <tr>
				               <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">${status.count}</td>
				               <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;"><a href="${link}">${noticeVO.ntitle}</a></td>
				               <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;">${noticeVO.nwriter}</td>
				               <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${noticeVO.nrdate}"/></td>
				               <td style="max-width: 50px; overflow: hidden; white-space: nowrap; text-overflow: ellipsis;"><span class="label label-danger">${noticeVO.nviewcnt}</span></td>
			           		</tr>
					       </c:forEach>
	            		</tbody>
			        </table>
			      	
			          <form role="form" id="form1" name="form1"  method="get">
			         	<%@include file="../../admin/include/pagingforSubmit.jsp" %>
							
							<div class="form-group">
						        <div class=" col-lg-3 pull-left">
								  <select class="form-control" name="searchType" id="searchType">
								    <option value="ntitle">제목</option>
								    <option value="ncontent">내용</option>
								  </select>
								</div>
										
					          	  <div class="input-group custom-search-form col-lg-4">
		                         		<input type="text" name="searchText" class="form-control" placeholder="Search...">
		                             <span class="input-group-btn">
		                                 <button class="btn btn-default" onclick="fn_formSubmit()" >
		                                   	<i class="fa fa-search"></i>
		                                    </button>
		                             </span>
		                      	  </div>
						     </div>
						    
			        	</form>
			        	</div>
		       		 </div>
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
	
	
	function fnSubmitForm(page){ 
		document.form1.page.value=page;
		document.form1.submit();
	}

</script>



</body>

</html>
