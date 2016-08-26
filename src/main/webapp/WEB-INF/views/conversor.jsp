<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script
	src="<c:url value="resources/js/jquery-3.1.0.min.js" />"></script>
</head>
<body>
	Conversor Numero
	<input type="text" id="numeroPorConverter" name="numeroPorConverter">
	<br>
	<script type="text/javascript">
		function converter(numero) {
			$.get("conversorNumero", {
				'numero' : numero
			}, function(resposta) {
				$("input[name=numeroConvertido]").val(resposta);
			});
		}
	</script>
	<button id="btnConverter"
		onClick="converter(document.getElementById('numeroPorConverter').value)">Converter</button>
	<br>Resultado
	<input type="text" id="numeroConvertido" name="numeroConvertido" value="">
</body>
</html>