package tr.org.linux.kamp.blog.controller;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tr.org.linux.kamp.blog.model.Post;
import tr.org.linux.kamp.blog.service.PostService;

@WebServlet("/home")
public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private PostService postService = new PostService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Collection<Post> list = postService.getAllPosts();
		req.setAttribute("postList", list);
		// TODO add message
		req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {		
		Collection<Post> list = postService.getAllPosts();
		req.setAttribute("postList", list);
		// TODO add message
		req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req, resp);
	}
}
