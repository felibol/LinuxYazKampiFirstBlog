package tr.org.linux.kamp.blog;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import tr.org.linux.kamp.blog.model.Post;

public class FakeDb {

	private static Map<String, Post> storage;
	
	static{
		storage =  new HashMap<String, Post>();
	}
	
	public static boolean save(String key, Post value){
		storage.put(key, value);
		return true;
	}

	public static Collection<Post> getAllPosts() {
		return storage.values();
		
	}

	public static Post getPost(String id) {
		return storage.get(id);
	}
}
