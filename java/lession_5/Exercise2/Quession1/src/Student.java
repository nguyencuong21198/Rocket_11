import java.util.Scanner;

public class Student implements IStudent	 {
	private int id;
	private String name;
	private int group;


	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public void diemdanh() {
		System.out.println(name+"Điểm danh");
		
	}

	@Override
	public void hocbai() {
		System.out.println(name+"Học bài");
		
	}

	@Override
	public void didonvesinh() {
		System.out.println(name+"Đi dọn vệ sinh");
		
	}
}
