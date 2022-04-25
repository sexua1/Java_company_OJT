<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link href="<c:url value="/css/tree.css" />" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>
<body>
  <ul>
    <li>
      <input type="checkbox" id="node"><label for="node">${tree[0].tree_nm}</label>
    </li>
  </ul>
</body>
<script type="text/javascript">
  let node = document.querySelector("#node");
  function tree() {
    $.ajax({
      type : "GET",
      url : "/tree",
      data : {
        tree : "${tree}"
      },
    })
    console.log("this is clicked");
  }
  
  node.addEventListener("click", tree);
</script>
</html>