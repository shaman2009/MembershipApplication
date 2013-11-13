<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="<c:url value="/resources/img/favicon.jpg"/>">

<title>Membership application</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-datetimepicker.min.css" />" rel="stylesheet">
<!-- Add custom CSS here -->
<style>
body {
	margin-top: 60px;
}
</style>

</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand">Membership</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li><a href="#about">About</a></li>
					<li><a href="#services">Services</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<div class="container">

		<form id="applyForm"   class="form-horizontal">
			<fieldset>
				<div id="legend" class="">
					<legend class="">
						<h1>申請會員</h1>
					</legend>
				</div>

				<div class="control-group">

					<!-- Text input-->
					<label class="control-label" for="input01" >申請人姓名</label>
					<div class="controls">
						<input id="name_input" placeholder="" class="input-xlarge" type="text" name="applicantName">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<!-- Text input-->
					<label class="control-label" for="input01">申請日期</label>
					<div class="controls">
						<input  class="input-xlarge" type="text" id="datetimepicker" name="applyDate"
							data-date-format="yyyy-mm-dd">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<!-- Text input-->
					<label class="control-label" for="input01">推薦人姓名</label>
					<div class="controls">
						<input id="refername_input" placeholder="" class="input-xlarge" type="text" name="referrerName">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">
					<!-- Text input-->
					<label class="control-label" for="input01">信用卡信息</label>
					<div class="controls">
						<input id="credit_input" placeholder="" class="input-xlarge" type="text" name="creditCardNumber">
						<p class="help-block"></p>
					</div>
				</div>
				<div class="control-group">




					<!-- Select Basic -->
					<label class="control-label">申請會員類型</label>
					<div class="controls">
						<select class="input-xlarge" name="memberType">
							<option>A等會員</option>
							<option>B等會員</option>
							<option>C等會員</option>
							<option></option>
						</select>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label"></label>
					<!-- Button -->
					<div class="controls">
						<button class="btn btn-success">提交</button>
					</div>
					
				</div>
		
			</fieldset>
					
		</form>
		<div id="alertSuccess" class="alert alert-success" style="display: none;">提交成功  :)</div>
		<div id="alertError" class="alert alert-danger" style="display: none;">の(⊙o⊙)…  出錯了,請正確填寫</div>
	</div>
	<!-- /.container -->

	<!-- Bootstrap core JavaScript -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- Make sure to add jQuery - download the most recent version at http://jquery.com/ -->
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap-datetimepicker.min.js" />"></script>
	<script src="<c:url value="/resources/js/jquery.form.js" />"></script>
	<script type="text/javascript">
		$('#datetimepicker').datetimepicker({
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			startView : 2,
			minView : 2,
			forceParse : 0
		});
	
		$(document).ready(function() {

			var options = {
				url : "Submit", // target element(s) to be updated with server response 
				beforeSubmit : showRequest, // pre-submit callback 
				success : showResponse,
				type : 'post',
			// post-submit callback 
			// other available options: 
			//url:       url         // override for form's 'action' attribute 
			//type:      type        // 'get' or 'post', override for form's 'method' attribute 
			//dataType:  null        // 'xml', 'script', or 'json' (expected server response type) 
			//clearForm: true        // clear all form fields after successful submit 
			//resetForm: true        // reset the form after successful submit 

			// $.ajax options can be used here too, for example: 
			 timeout:   3000 
			};

			// bind form using 'ajaxForm' 
			$("#applyForm").ajaxForm(options);
		});
		// pre-submit callback 
		function showRequest(formData, jqForm, options) { 
			if(!$("#name_input").val()) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確填寫【申請人姓名】"); 
				return false;
			}
			if(!isNaN($('#name_input').val())) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確填寫【申請人信息】"); 
				return false;
			}
			if(!$("#datetimepicker").val()) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確選擇【申請日期】"); 
				return false;
			}
			if(!$("#refername_input").val()) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確填寫【推薦人姓名】"); 
				return false;
			}
			if(!isNaN($('#refername_input').val())) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確填寫【推薦人信息】"); 
				return false;
			}
			
			if(!$("#credit_input").val()) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確填寫【信用卡信息】"); 
				return false;
			}
			if(isNaN($('#credit_input').val())) {
				$("#alertError").css('display','block').text("の(⊙o⊙)…  出錯了,請正確填寫【信用卡信息】"); 
				return false;
			}


		    var queryString = $.param(formData); 
		    //alert('About to submit: \n\n' + queryString); 
		 	
		    return true; 
		};
		 
		// post-submit callback 
		function showResponse(responseText, statusText, xhr, $form)  { 
		    // for normal html responses, the first argument to the success callback 
		    // is the XMLHttpRequest object's responseText property 
		 
		    // if the ajaxForm method was passed an Options Object with the dataType 
		    // property set to 'xml' then the first argument to the success callback 
		    // is the XMLHttpRequest object's responseXML property 
		 
		    // if the ajaxForm method was passed an Options Object with the dataType 
		    // property set to 'json' then the first argument to the success callback 
		    // is the json data object returned by the server 
		 
		    //alert('status: ' + statusText + '\n\nresponseText: \n' + responseText + 
		     //   '\n\nThe output div should have already been updated with the responseText.'); 
		    //alert("申請成功");
		    $("#alertSuccess").css('display','block'); 
		    $("#alertError").css('display','none'); 
		};
	</script>
</body>
</html>