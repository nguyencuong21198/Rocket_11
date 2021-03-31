import java.util.Scanner;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rate;

	public News() {

	}

	public News(int id, String title, String publishDate, String author, String content, float averageRate) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}
	
public int[] getRate() {
		return rate;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}

@Override
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID");
		id = sc.nextInt();
		System.out.println("Title");
		title = sc.nextLine();
		System.out.println("PublishDate");
		publishDate = sc.nextLine();
		System.out.println("Author");
		author = sc.nextLine();
		System.out.println("AverageRate");
		averageRate = sc.nextFloat();
	}

	@Override
	public float calculate( ) {
		averageRate = (float)(rate[0]+rate[1]+rate[2])/3;
		return  averageRate;
	}

}
