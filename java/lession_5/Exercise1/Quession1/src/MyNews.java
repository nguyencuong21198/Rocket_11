import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
	ArrayList<News> list = new ArrayList<News>();

	public void insert() {
		Scanner sc = new Scanner(System.in);
		News news = new News();
		int[] rate = new int[3];

		System.out.println("Nhập Title: ");
		news.setTitle(sc.nextLine());

		System.out.println("Nhập Publish Date: ");
		news.setPublishDate(sc.nextLine());

		System.out.println("Nhập Author: ");
		news.setAuthor(sc.nextLine());

		System.out.println("Nhập Content: ");
		news.setContent(sc.nextLine());

		System.out.println("Nhập 3 đánh giá: ");
		for (int i = 0; i < 3; i++) {
			System.out.println("Đánh giá " + (i + 1) + ": ");
			rate[i] = sc.nextInt();
		}
		

		list.add(news);
	}
	public void view() {
		for(News news:list) {
			news.display();
		}
			
	}
	public void averageRate() {
		for (News news : list) {
			System.out.println("Title: " + news.getTitle() + " / Average Rate: " + news.calculate());
		}
	}
}
