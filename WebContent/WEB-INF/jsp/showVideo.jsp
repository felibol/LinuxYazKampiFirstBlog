<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>${post.title}</h1>

<p>${post.content}</p><br>

<video src="${post.videoUrl}" controls>
</video><br>

<a href="home"><button type="button">Return to homepage</button></a>