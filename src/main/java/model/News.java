package model;

public class News {
    private String id;
    private String title;
    private String content;
    private String image;
    private String postedDate;
    private String author;
    private int viewCount;
    private String categoryId;
    private boolean home;

    // Constructor, getters, setters
    public News(String id, String title, String content, String image, String postedDate, 
                String author, int viewCount, String categoryId, boolean home) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setImage(image);
        this.setPostedDate(postedDate);
        this.setAuthor(author);
        this.setViewCount(viewCount);
        this.setCategoryId(categoryId);
        this.setHome(home);
    }
    // Getters and setters...

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public boolean isHome() {
		return home;
	}

	public void setHome(boolean home) {
		this.home = home;
	}
    
}
