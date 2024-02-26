
<%@page import="co.yedam.common.PageDTO"%>
<%@page import="co.yedam.member.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<style>
.center {
  text-align: center;
  width: 60%;
  margin: auto;
}

.pagination {
  display: inline-block;
  
}

.pagination a {
  color: black;
  float: left;
  padding: 8px 16px;
  text-decoration: none;
  transition: background-color .3s;
  /*border: 1px solid #ddd;*/
  margin: 0 4px;
}

.pagination a.active {
  background-color: #4CAF50;
  color: white;
  border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {background-color: #ddd;}
</style>


  <div class="center">
    <form action="memberList.do" method="get">
      <div class="col-sm-4">
        <select name="searchCondition" class="form-control">
          <option value="">선택하세요.</option>
          <option value="T">제목</option>
          <option value="W">작성자</option>
          <option value="TW">제목 & 작성자</option>
        </select>
      </div>    
      <div class="col-sm-6">
        <input type="text" name="keyword" class="form-control">
      </div>
      <div class="col-sm-2">
        <input type = "submit" value = "조회" class="btn btn-primary">
      </div>
    </form>
  </div>
  <h3>멤버 목록</h3>
  <table class ="table">
    <thead>
     <tr>
      <th>ID</th>
      <th>PW</th>
      <th>NAME</th>
      <th>IMAGE</th>
     </tr>
    </thead>
    <tbody>
    <c:forEach var="member" items="${list }">
     <tr>
       <td>${member.id} </td>
       <td>${member.pw}</td>
       <td>${member.name }</td>
       <td>${member.image }</td>
     </tr>
    </c:forEach>
  
    </tbody>
  </table>
  <div class="center">
  <div class="pagination">
 	
 	<c:if test = "${page.prev }">
    <a href="MemberList.do?page=${page.starPage-1}&searchCondition=${searchCondition }&keyword=${keyword }"> &laquo; </a>
  	</c:if>
  
  
 
   	<c:forEach begin="${page.starPage }" end="${page.endPage }" var = "p">
   

   <c:choose>
   	<c:when test="${p eq page.page }">
    <a href="MemberList.do?page=${p }&searchCondition=${searchCondition }&keyword=${keyword}" class="active">${p}</a>
   	</c:when>
   	
   	<c:otherwise>
    <a href="MemberList.do?page=${p }&searchCondition=${searchCondition }&keyword=${keyword}">${p}</a>
   	</c:otherwise>
   </c:choose>
   	</c:forEach>
   	
   	<c:if test="${page.next} ">
    <a href="MemberList.do?page=${page.endpage +1}&searchCondition=${searchCondition }&keyword=${keyword }"> &raquo; </a>
    </c:if>
    
  </div>
  </div>
