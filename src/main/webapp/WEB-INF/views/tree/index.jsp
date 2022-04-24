<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link href="<c:url value="/css/tree.css" />" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript"></script>
<script type="text/javascript">
  /* function tree() {
    $.ajax({
       type : "GET",
       url : "/tree",
       data : {
         deptcd : "${deptcd}",
         name : "${name}",
         parent : "${parent}",
         depth : "${depth}",
         tree : "${tree}"
       },
     })
  } */
  /* console.log("이건 jspTree");
  console.log("${tree[0]}");*/
  
  /* HTML요소 */
  let treeUl = document.querySelector(".tree");
  let node = document.querySelector("#node");
  /* var */
  let treeSize = parseInt("${treeSize}");
  /* func */
  function findRoot() {
    for(let i = 0; i < treeSize; i++){    
      console.log(${parentdeptCd[i]});
      console.log(${deptname[i]});
      console.log(${depth[i]});
      /* console.log("${tree[i].parentdeptCd}");
      console.log("${tree[i]}");
      console.log("${tree[i].deptname}"); */
      /* if("${tree[i].parentdeptCd}" == ""){
        let rootNode = "${tree[i]}";
        treeUl.innerHTML = `<li><input type="checkbox" id="node"> <label for="root">${rootNode}</label>`
      } */
    }
  }
  /* function addNode() {
    for (var i = 0; i < ${treeSize}; i++) {
      
    }
  } */
  
  findRoot();
</script>
</head>
<body>
  <%-- <c:forEach var="tree" items="${tree}" varStatus="status">
    <h1>${tree}</h1>
  </c:forEach> --%>

  <ul class="tree">
    <li><input type="checkbox" id="node"> <label for="root">${tree[0].deptname}</label>
      <ul>
        <li><input type="checkbox" id="node1"> <label for="node1" class="lastTree">node1</label></li>
        <li><input type="checkbox" id="node2"> <label for="node2">node2</label>
          <ul>
            <li><input type="checkbox" id="node21"> <label for="node21" class="lastTree">node21</label></li>
          </ul>
        <li><input type="checkbox" id="node3"> <label for="node3">node3</label>
          <ul>
            <li><input type="checkbox" id="node31"> <label for="node31" class="lastTree">node31</label></li>
            <li><input type="checkbox" id="node32"> <label for="node32">node32</label>
              <ul>
                <li><input type="checkbox" id="node321"> <label for="node321" class="lastTree">node321</label></li>
                <li><input type="checkbox" id="node322"> <label for="node322" class="lastTree">node322</label></li>
                <li><input type="checkbox" id="node323"> <label for="node323" class="lastTree">node323</label></li>
              </ul>
            <li><input type="checkbox" id="node33"> <label for="node33" class="lastTree">node33</label></li>
          </ul></li>
      </ul></li>
  </ul>
</body>
</html>