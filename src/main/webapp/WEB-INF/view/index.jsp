<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>

<c:forEach var="e" items="${tasks}">
	<tr>
		<td>
			${f:h(e.id)}
		</td>
		<td>
			${f:h(e.content)}
		</td>
		<td>
			${f:h(e.status)}
		</td>
	</tr>
</c:forEach>
</body>
</html>