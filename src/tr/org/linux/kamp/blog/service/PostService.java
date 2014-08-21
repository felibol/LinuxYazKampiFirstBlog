package tr.org.linux.kamp.blog.service;

import java.util.Collection;

import tr.org.linux.kamp.blog.dao.PostDao;
import tr.org.linux.kamp.blog.model.Post;

public class PostService {
	private PostDao postDao;

	public boolean save(Post post) {
		return getPostDao().save(post);
	}

	private PostDao getPostDao() {
		if (this.postDao == null) {
			this.postDao = new PostDao();
		}

		return this.postDao;
	}

	public Collection<Post> getAllPosts() {
		return getPostDao().getAllPosts();
	}
	
	public Post getPost(String id) {
		return getPostDao().getPost(id);
	}
}
