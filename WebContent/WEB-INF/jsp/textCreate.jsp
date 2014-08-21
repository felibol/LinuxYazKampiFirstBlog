<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form action="createPost?type=text" method="post">
	<input type="text" name="title" placeholder="title"> <br>
	<textarea name="content" rows="30" cols="50" placeholder="content"></textarea> <br>
	<button type="submit">Create</button>
	<a href="javascript: history.back (-1);"><button type="button">Cancel</button></a>	
</form>
