<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.3.min.js"
	integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function() {

	})

	function data(val) {
		
		
		$.get("data",{val},function(response){
			$("#data").html(response);
		})
	}
</script>

</head>
<body>
	<input type="text" id="value" onkeyup="data(value)">
	<div id="data"></div>
</body>
</html>