package tr.org.linux.kamp.blog.model;

public class Photo extends Post{
	private String photoUrl;
	
	public Photo(String title, String content, String photoUrl) {
		super(title, content);
		this.setPhotoUrl(photoUrl);
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}
