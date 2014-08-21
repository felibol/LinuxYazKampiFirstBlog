package tr.org.linux.kamp.blog.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tr.org.linux.kamp.blog.model.Photo;
import tr.org.linux.kamp.blog.model.Post;
import tr.org.linux.kamp.blog.model.Text;
import tr.org.linux.kamp.blog.model.Video;
import tr.org.linux.kamp.blog.service.PostService;

@WebServlet("/showPost")
public class ShowPostController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id = (String) req.getParameter("id");
		
		PostService postService = new PostService();
		Post post = postService.getPost(id);
		
		req.setAttribute("post", post);

		if(post instanceof Text){
			req.getRequestDispatcher("/WEB-INF/jsp/showPost.jsp").forward(req, resp);			
		}else if(post instanceof Photo){
			req.getRequestDispatcher("/WEB-INF/jsp/showPhoto.jsp").forward(req, resp);
		}else if(post instanceof Video){
			req.getRequestDispatcher("/WEB-INF/jsp/showVideo.jsp").forward(req, resp);
		}
	}
}
