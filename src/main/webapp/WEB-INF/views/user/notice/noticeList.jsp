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
               
                   <div class="row" style="text-align: center">    
                       <div class="col-lg-6 pull-left">
                         <div class="input-group">
                               <div class="input-group-btn search-panel">
                                   <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                                      <span id="search_concept">Filter by</span><span class="caret"></span>
                                   </button>
                                   <ul class="dropdown-menu" role="menu">
                                     <li><a href="#">Contains</a></li>
                                     <li><a href="#its_equal">It's equal</a></li>
                                     <li><a href="#greather_than">Greather than</a></li>
                                     <li><a href="#less_than">Less than < </a></li>
                                     <li class="divider"></li>
                                     <li><a href="#all">Anything</a></li>
                                   </ul>
                               </div>
                               <input type="hidden" name="search_param" value="all" id="search_param">         
                               <input type="text" class="form-control" name="x" placeholder="Search term...">
                               <span class="input-group-btn">
                                   <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                               </span>
                           </div>
                       </div>
                  </div>
               </div>
            </div>
         </div>
       </div>
   </div>


 <%@include file="../../admin/include/plugin_js.jsp" %>
<script type="text/javascript">
   /* function fn_moveToURL(url, msg){
      if (msg) {
         if (!confirm( msg + " 하시겠습니까??")) return;
      }
      location.href=url;
   }
   
   function fnSubmitForm(page){ 
      
       document.form1.page.value=page;
      /* document.from1.submit();  */
   } */
   
</script>



</body>

</html>