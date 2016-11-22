<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<form id="form1" action="requestgetform" method="get">
    <table id="table1" cellspacing="5px" cellpadding="5%">
        <tr>
            <td align="right">Enter Pokemon Name:
            <td>
                <input type="text" name="pokemon_name" value=""/></td>

            <td align="right">
                <input type="submit" value="send"/></td>

            <td align="right">Pokemon Name:
                <input type="text" name="pokemon_name_text" value="${pokemon_name}"/>
            </td>

            <td align="right">Pokemon Coefficiency:
                <input type="text" name="pokemon_coefficiency_table" value="${pokemon_coefficiency_table}"></td>

            <td align="right">Pokemon Efficiency:
                <input type="text" name="pokemon_efficiency" value="${pokemon_efficiency_table}"></td>

            <td align="right">Pokemon Effectiveness:
                <input type="text" name="pokemon_effectiveness" value="${pokemon_effectivness}"></td>

            <td align="right">Pokemon Image:
                <input type="text" name="pokemon_image" value="${pokemon_image}"></td>

            <td align="right">Pokemon Evoluation:
                <input type="text" name="pokemon_evolation" value="${pokemon_evoluation}"></td>
        </tr>

        <td align="right">
            <input type="submit" value="submit">
        </td>
    </table>
</form>
</body>
</html>
