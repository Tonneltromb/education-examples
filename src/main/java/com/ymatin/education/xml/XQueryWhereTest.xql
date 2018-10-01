
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<ul>
{
for $x in doc("books.xml")/bookstore/book/title
where $x/price>30 and $x/price<100
return <li>{data($x)}</li>
}
</ul>
</body>
</html>