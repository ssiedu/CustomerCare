<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h3>Product-Successfully-Stored</h3>
	<h5>Following Details Are Saved : </h5>
	<hr>
		<pre>
		Code	${prod.pcode}
		Name	${prod.pname}
		Price	${prod.price}
		</pre>
	<hr>
	<h4><a href="newproduct">Add-More</a></h4>
	<h4><a href="index.jsp">Home</a></h4>
</body>
</html>