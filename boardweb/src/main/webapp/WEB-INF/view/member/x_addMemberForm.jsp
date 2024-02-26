<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../../includes/header.jsp"></jsp:include>
<!-- addMember의 파일을 불러옴. -->
<form action="addMember.do" method="post" enctype="multipart/form-data">
<table class="table">
	<tr>
		<th>아이디</th>
		<td><input type="text" name="id" class="form-control" required></td>
	</tr>

	<tr>
		<th>비밀번호</th>
		<td><input type="text" name="pw" class="form-control" required></td>
	</tr>

	<tr>
		<th>이름</th>
		<td><input type="text" name="name" class="form-control" required></td>
	</tr>

	<tr>
		<th>이미지</th>
		<td><input type="file" name="image" class="form-control" required></td>
	</tr>

	<tr>
		<td colspan="2" align="center">
			<button type="submit" class="btn btn-primary">저장</button>
		</td>
	</tr>
</table>
</form>
<jsp:include page="../../includes/footer.jsp"></jsp:include>