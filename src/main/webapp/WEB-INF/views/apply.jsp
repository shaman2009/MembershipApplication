<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">
<title>Apply</title>
</head>
<body>

	<form class="form-horizontal">
		<fieldset>
			<div id="legend" class="">
				<legend class="">申請會員</legend>
			</div>
			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">申請人姓名</label>
				<div class="controls">
					<input placeholder="" class="input-xlarge" type="text">
					<p class="help-block"></p>
				</div>
			</div>



			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">申請日期</label>
				<div class="controls">
					<input placeholder="yyyy-mm-dd" class="input-xlarge" type="text">
					<p class="help-block"></p>
				</div>
			</div>





			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">推薦人姓名</label>
				<div class="controls">
					<input placeholder="" class="input-xlarge" type="text">
					<p class="help-block"></p>
				</div>
			</div>

			<div class="control-group">

				<!-- Select Basic -->
				<label class="control-label">申請會員類型</label>
				<div class="controls">
					<select class="input-xlarge">
						<option>A等會員</option>
						<option>B等會員</option>
						<option>C等會員</option>
						<option></option>
					</select>
				</div>

			</div>

			<div class="control-group">

				<!-- Text input-->
				<label class="control-label" for="input01">信用卡信息</label>
				<div class="controls">
					<input placeholder="" class="input-xlarge" type="text">
					<p class="help-block"></p>
				</div>
			</div>

			<div class="control-group">
				<label class="control-label"></label>

				<!-- Button -->
				<div class="controls">
					<button class="btn btn-success">Submit</button>
				</div>
			</div>

		</fieldset>
	</form>

	<!-- Bootstrap core JavaScript -->
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.js" />"></script>

</body>
</html>