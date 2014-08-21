package tr.org.linux.kamp.blog.model;

public class Video extends Post{
	private String videoUrl;

	
	public Video(String title, String content, String videoUrl) {
		super(title, content);
		this.videoUrl = videoUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	
}
