<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h3>UserList page</h3>

<script src = "static/js/userList.js"></script>
<input type="text" id="name" class = "form-control">
	<option value = "Male">  남성</option>
	<option value = "Female">여성</option>

<div id = "show">
  <table border ="1" id = "tableList">
     <thead>
   <!--    <tr>
        <th>id</th>
        <th>first_name</th>
        <th>last_name</th>
        <th>email</th>
        <th>salary</th>
      </tr> -->
    </thead>
    
    <tbody>
    	<tr>
    	  <td>101</td>
    	  <td>fisrt_name</td>
    	  <td>last_name</td>
    	  <td>email@cc</td>
    	  <td>2345</td>
    	</tr>
    </tbody>
  </table>
</div>