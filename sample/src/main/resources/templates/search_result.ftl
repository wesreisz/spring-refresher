<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset=""UTF-8>
    <title>${projName}</title>
</head>
    <body>
        <h2>Results of keyword: ${keyword} </h2>
        <table>
            <#list harvest as prod>
                <tr>
                    <td>${ prod }</td>
                </tr>
            </#list>
        </table>
    </body>
</html>