<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1> My Blog </h1>
<ul>
	<c:forEach items="${postList}" var="post">
	    <li><a href="showPost?id=${post.id}"> <c:out value="${post.title}"/> </a></li>
	</c:forEach>
</ul>
 
<c:if test="${message != null}">
   <p>${message}<p>
</c:if>

<a href="createPost?type=text"><button type="button">Create Text Post</button></a>
<a href="createPost?type=photo"><button type="button">Create Photo Post</button></a>
<a href="createPost?type=video"><button type="button">Create Video Post</button></a>
