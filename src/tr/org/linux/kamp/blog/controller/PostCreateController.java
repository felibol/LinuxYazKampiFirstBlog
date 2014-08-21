package tr.org.linux.kamp.blog.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tr.org.linux.kamp.blog.model.*;
import tr.org.linux.kamp.blog.service.PostService;

@WebServlet("/createPost")
public class PostCreateController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String postType = (String) req.getParameter("type");
		switch (postType) {
		case "text":
			req.getRequestDispatcher("/WEB-INF/jsp/textCreate.jsp").forward(req, resp);
			break;
		case "photo":
			req.getRequestDispatcher("/WEB-INF/jsp/photoCreate.jsp").forward(req, resp);
			break;
		case "video":
			req.getRequestDispatcher("/WEB-INF/jsp/videoCreate.jsp").forward(req, resp);
			break;
		default:
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String title = (String) req.getParameter("title");
		String content = (String) req.getParameter("content");
		
		PostService postService = new PostService();
		
		String postType = (String) req.getParameter("type");
		
		Post post = null;
		
		switch (postType) {
		case "text":
			post = new Text(title, content);
			break;
		case "photo":
			String photoUrl = (String) req.getParameter("photoUrl");			
			post = new Photo(title, content, photoUrl);
			break;
		case "video":
			String videoUrl = (String) req.getParameter("videoUrl");
			post = new Video(title, content, videoUrl);
			break;
		default:
			break;
		}
		
		boolean result = postService.save(post);
		if(result){
			req.setAttribute("message", "Post is saved..");	
		}else{
			req.setAttribute("message", "Problem occured during post save process..");				
		}

		req.getRequestDispatcher("/home").forward(req, resp);

	}
}
