
public class Qlstudent {
	Student[] students = new Student[15];

	public void Student() {
		students[1] = new Student(1, "Cường", 1);
		students[2] = new Student(2, "Đạt", 1);
		students[3] = new Student(3, "Hanh", 1);
		students[4] = new Student(4, "Dũng", 2);
		students[5] = new Student(5, "lan", 2);
		students[6] = new Student(6, "Vui", 2);
		students[7] = new Student(7, "Loan", 2);
		students[8] = new Student(8, "Huyền", 3);
		students[9] = new Student(9, "Phong", 3);
		students[10] = new Student(10, "Đức", 3);
		students[11] = new Student(11, "Kiên", 3);
		students[12] = new Student(12, "Quang", 1);
		students[13] = new Student(13, "Khôi", 2);
		students[14] = new Student(14, "Mạnh", 3);
		
	}

	public void diemdanh() {
		for (int i = 1; i <= 15; i++) {
				students[i].diemdanh();
		}
	}

	public void hocbai() {
		for (int i = 1; i <= 15; i++) {
			if (students[i].getGroup() == 2) {
				students[i].hocbai();
			}
		}
	}

	public void donvs() {
		for (int i = 1; i <= 15; i++) {
			if (students[i].getGroup() == 3) {
				students[i].didonvesinh();
			}
		}
	}
}
