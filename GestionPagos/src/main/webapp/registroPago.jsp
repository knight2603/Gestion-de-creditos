<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registro de Pago</title>
</head>
<body>
    <h2>Registrar Pago</h2>
    <form action="PagoController" method="post">
        <input type="hidden" name="accion" value="registrar">

        <label for="creditoId">ID del Crédito:</label>
        <input type="number" name="creditoId" required><br><br>

        <label for="monto">Monto del Pago:</label>
        <input type="number" step="0.01" name="monto" required><br><br>

        <label for="tipoPago">Tipo de Pago:</label>
        <select name="tipoPago" required>
            <option value="parcial">Parcial</option>
            <option value="total">Total</option>
        </select><br><br>

        <button type="submit">Registrar Pago</button>
    </form>
</body>
</html>





