package tr.org.linux.kamp.blog.dao;

import java.util.Collection;

import tr.org.linux.kamp.blog.FakeDb;
import tr.org.linux.kamp.blog.model.Post;

public class PostDao {

	public boolean save(Post post) {

		if (post.getId() == null || post.getId().trim().length() == 0) {
			String id = String.valueOf(System.currentTimeMillis());
			post.setId(id);
		}

		FakeDb.save(post.getId(), post);

		return true;
	}

	public Collection<Post> getAllPosts() {
		return FakeDb.getAllPosts();

	}

	public Post getPost(String id) {
		return FakeDb.getPost(id);
	}

}
