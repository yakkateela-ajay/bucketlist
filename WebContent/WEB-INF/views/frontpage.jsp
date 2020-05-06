
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Game on Collections</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="./assets/style.css" />
</head>
<body>
	<main class="main">

	<form action="${pageContext.request.contextPath}/frontpage" method="post">
		<div class="form-group">
			<div class="button-group">
				 <input type="submit" value="LIST" name="ID1" id="list">
				 <input type="submit" value="SET" name="ID2" id="set"> 
				 <input type="submit" value="MAP" name="ID3" id="map">
			</div>
		</div>
	</form>
	</main>
</body>
</html>