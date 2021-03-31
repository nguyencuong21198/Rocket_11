import java.util.ArrayList;
import java.util.Scanner;

public class Qlstudent {
	ArrayList<Student> students = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	Student student = new Student(); 
	public void nhap() {
		int n;
		
		System.out.println("Nhap so sinh vien");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("nhap sinh vien thu:"+(i+1));
		//	students.add(student);
		}
	}
	public void hienthi() {
		for(Student student:students) {
			student.showInfo();
		}
	}
	public void xethocbong() {
		System.out.println("Nhập tên sinh viên muốn xét:");
		String name = sc.nextLine();

		for (Student student : students) {
			
				if (student.ishocbong()) {
					System.out.println("Sinh viên này được học bổng !");
				} else {
					System.out.println("Không được học bổng !");
				}
				break;
			
		}
	}
}
