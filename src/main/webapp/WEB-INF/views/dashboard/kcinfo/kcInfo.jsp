<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@include file="../../dashboard/include/head.jsp" %>

<body>

    <div id="wrapper">
		 <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
       		<%@include file="../../dashboard/include/nav.jsp" %>

            <%@include file="../../dashboard/include/sidebar.jsp" %>
        </nav>

        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">검사 기관 관리</h1>
                      
						  <h2>Image Gallery</h2>
						  <p>The .thumbnail class can be used to display an image gallery.</p>
						  <p>The .caption class adds proper padding and a dark grey color to text inside thumbnails.</p>
						  <p>Click on the images to enlarge them.</p>
						  <div class="row">
						    <div class="col-md-4">
						      <div class="thumbnail">
						        <a href="#" target="_blank">
						          <img src="/resources/dashboard/images/intertek.jpg" alt="Lights" style="width:100%">
						          <div class="caption">
						            <p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>
						          </div>
						        </a>
						      </div>
						    </div>
						    <div class="col-md-4">
						      <div class="thumbnail">
						        <a href="/w3images/nature.jpg" target="_blank">
						          <img src="/resources/dashboard/images/fiti.JPG" alt="Nature" style="width:100%">
						          <div class="caption">
						            <p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>
						          </div>
						        </a>
						      </div>
						    </div>
						    <div class="col-md-4">
						      <div class="thumbnail">
						        <a href="/w3images/fjords.jpg" target="_blank">
						          <img src="/resources/dashboard/images/katri.PNG" alt="Fjords" style="width:100%">
						          <div class="caption">
						            <p>Lorem ipsum donec id elit non mi porta gravida at eget metus.</p>
						          </div>
						        </a>
						      </div>
						    </div>
						  </div>
						</div>
                    </div>
                   
                </div>
            </div>
        </div>
        

   

 <%@include file="../../dashboard/include/plugin_js.jsp" %>

</body>

</html>
