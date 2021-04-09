package entity;

public class Student {
	public static int id;
	public static String name;
	public static int counter = 0;
	public static final int maxStudent = 7;
	public static String college = "Dai hoc bach khoa";

	public Student(String name) throws Exception {

		if (counter > maxStudent) {
			throw new Exception("KhÃ´ng thá»ƒ táº¡o quÃ¡ 7 sinh viÃªn");
		}

		this.id = ++counter;
		this.name = name;

		
	}
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", college= " + college + '\'' + '}';
	}
}
