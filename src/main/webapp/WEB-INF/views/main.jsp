<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coin lab</title>

<style>
body, html { 
    margin: 0;
    padding: 0;
    height: 100%;
}
.bgimg {
    border: 0;
    padding: 0; 
    background-image: url('/res/img/main_img.jpg');
    min-height: 100%;
    background-position: center;
    background-size: cover;
}
</style>
<script type="text/javascript">
function move(){
	location.href="/login";
}

</script>
</head>
<body>
    <div class="bgimg" onclick="move()"></div>
</body>
</html>
