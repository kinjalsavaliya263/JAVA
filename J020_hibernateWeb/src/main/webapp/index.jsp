<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script type="text/javascript">
	
	
	$(document).ready(function(){
		$("#btn2").hide();
		viewBook();
	})
	
	function addBook()
	{
		var bname = $("#bname").val()
		var price = $("#price").val()
		var qty = $("#qty").val()
	
		$.post("addbook",{bname,price,qty},function(rt){
				alert(rt)
				viewBook()
		})
		$("#bname").val("")
		$("#price").val("")
		$("#qty").val("")
	}
	
	function viewBook()
	{
		$.get("viewBook",{},function(rt){
			const book = JSON.parse(rt);
			
			var row=""
			for(var i=0;i<book.length;i++)
			{
				row=row+"<tr><td>"+book[i].bid+"</td><td>"+book[i].bname+"</td><td>"+book[i].price+"</td><td>"+book[i].qty+"</td><td class='btn btn-danger' onclick='deletebook("+book[i].bid+")'>Delete</td><td></td><td class='btn btn-primary' onclick='getbyid("+book[i].bid+")'>Update</td></tr>";
			}
			$("#tdata").html(row)
			
		})
	}
	
	function deletebook(bid)
	{
		$.post("update",{bid},function(rt){
			alert(rt)
			viewBook()
		})
	}
	
	function getbyid(bid)
	{
		$.get("update",{bid},function(rt){
			const book = JSON.parse(rt)
			$("#bid").val(book.bid)
			$("#bname").val(book.bname)
		$("#price").val(book.price)
		$("#qty").val(book.qty)
			viewBook()
		})
		
		$("#btn1").hide();
		$("#btn2").show();
	}
	
	function updateBook()
	{
		var bid = $("#bid").val()
		var bname = $("#bname").val()
		var price = $("#price").val()
		var qty = $("#qty").val()
	
		$.post("updatebook",{bid,bname,price,qty},function(rt){
				alert(rt)
				viewBook()
		})
		$("#bid").val("")
		$("#bname").val("")
		$("#price").val("")
		$("#qty").val("")
		$("#btn2").hide();
		$("#btn1").show();
	}
	
	function searchBook(keyword){
		
		$.get("searchbook",{keyword},function(rt){
			const book = JSON.parse(rt);
			
			var row=""
			for(var i=0;i<book.length;i++)
			{
				row=row+"<tr><td>"+book[i].bid+"</td><td>"+book[i].bname+"</td><td>"+book[i].price+"</td><td>"+book[i].qty+"</td><td class='btn btn-danger' onclick='deletebook("+book[i].bid+")'>Delete</td><td></td><td class='btn btn-primary' onclick='getbyid("+book[i].bid+")'>Update</td></tr>";
			}
			$("#tdata").html(row)
			
		})
		
	}
	
	</script>
</head>
<body>
			<div class="container">
			<h1  class="bg-danger text-center" >Library Management</h1>
			<div class="row">
			
			<div class="col-md-4">
			<h1 class="bg-success text-center">Add Book</h1>
			<input type="hidden" id="bid">
			<div class="form-group">
			<label>Book name</label>
			<input type="text" id="bname" class="form-control">
			</div>
			<div class="form-group">
			<label>Book Price</label>
			<input type="text" id="price" class="form-control">
			</div>
			<div class="form-group">
			<label>Book Qty</label>
			<input type="text" id="qty" class="form-control">
			</div>
			
			<div class="form-group">
			<button class="btn btn-success form-control"  id="btn1" onclick="addBook()">Submit</button>			
			<button class="btn btn-success form-control" id="btn2" onclick="updateBook()">Update</button>			
			
			</div>
			
			</div>
			<div class="col-md-8">
			<h1 class="bg-success text-center">Book Details</h1>
			<div class="form-group">
			<input type="search" id="search" onkeyup="searchBook(value)" placeholder="Search book ...." class="form-control">
			</div>
			<table class="table">
			<thead class="thead-dark">
			<tr>
			<th>Id</th>
			<th>Book name</th>
			<th>Book Price</th>
			<th>Book Qty</th>
			<th colspan="3">Action</th>
			</tr>
			</thead>
			<tbody id="tdata">
			
			</tbody>
			</table>
			
			</div>
			</div>
			</div>
</body>
</html>