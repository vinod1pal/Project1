<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>EDUCARE</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container"><br>
		<h1 class="text-success text-center"> AdminRegistration</h1><br>
		<div class="col-lg-8 m-auto" d-block>
			
			<form action="regAdmin" onsubmit="return validation()" class="bg-light">
				<div class="form-group">
					<label> Admin Username:</label>
					<input type="text" name="adminUSN" class="form-control" id="adminuser" autocomplete="off">
					<span id="auname" class="text-danger font-weight-bold"></span>

					<div class="form-group">
					<label> Admin Password:</label>
					<input type="Password" name="adminPWD" class="form-control" id="adminpass" autocomplete="off">
					<span id="apass" class="text-danger font-weight-bold"></span>

					<div class="form-group">
					<label>Admin Name:</label>
					<input type="text" name="adminName" class="form-control" id="adminname" autocomplete="off">
					<span id="aname" class="text-danger font-weight-bold"></span>

					<div class="form-group">
					<label>Employee ID:</label>
					<input type="text" name="empID" class="form-control" id="empID" autocomplete="off">
					<span id="Eid" class="text-danger font-weight-bold"></span><br>
					<input type="submit" name="submit" value="submit" class="btn-success">

			</form>
		</div>
	</div>
<script type="text/javascript">
	
	function validation(){
		var aduser=document.getElementById("adminuser").value;
		var adpas=document.getElementById("adminpass").value;
		var aname=document.getElementById("adminname").value;
		var eid=document.getElementById("empID").value;

		if( aduser== ""){

			document.getElementById("auname").innerHTML="**Please fill the AdminUser Name field ";
			return false;
		}
		if ((aduser.length<3) || (aduser.length >15))  {
			document.getElementById("auname").innerHTML="**Admin Username lenght must be between 3 and  15 character's ";
			return false;
		}

		if (!isNaN(aduser)) {
			document.getElementById("auname").innerHTML="**Only character's  are allowed";
			return false;
		}

		if(adpas == ""){

			document.getElementById("apass").innerHTML="**Please fill the AdminPassword field ";
			return false;
		}
		if ((adpas.length<4) || (adpas.length >10))  {
			document.getElementById("apass").innerHTML="**Admin Password lenght must be between 4 and  10 digit's ";
			return false;
		}
		if (isNaN(adpas)) {
			document.getElementById("apass").innerHTML="**Only digits  are allowed";
			return false;
		}
		if( aname== ""){

			document.getElementById("aname").innerHTML="**Please fill the AdminName field ";
			return false;
		}
		if (!isNaN(aname)) {
			document.getElementById("aname").innerHTML="**Only character's  are allowed";
			return false;
		}
		if( eid== ""){

			document.getElementById("Eid").innerHTML="**Please fill the EmployeeId field ";
			return false;
		}
		if (isNaN(eid)) {
			document.getElementById("Eid").innerHTML="**Only digit's  are allowed";
			return false;
		}
		


	}

</script>
</body>
</html>


