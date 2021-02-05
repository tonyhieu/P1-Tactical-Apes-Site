<%@tag description="Base Page Template" pageEncoding="UTF-8"%>
<%@attribute name="title" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>


<html>

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.js" ></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="shortcut icon" href="/static/assets/coolguy.PNG" type="image/x-icon">
    <link rel="icon" href="/static/assets/coolguy.PNG" type="image/x-icon">

    <style>
        .memestyle {
            font-size: 5vw;
            color: black;
            font-family: "Comic Sans MS";
            background-color: cornflowerblue;
            padding: 2%
        }

        a {
            color: orange;
        }
    </style>

    <div id="title">
        <jsp:invoke fragment="title"/>
    </div>

</head>

<body class="memestyle">
    <div id="pageheader">
        <jsp:invoke fragment="header"/>
    </div>

    <div id="body">
        <jsp:doBody/>
    </div>

    <div id="pagefooter">
        <jsp:invoke fragment="footer"/>
    </div>
</body>
</html>
