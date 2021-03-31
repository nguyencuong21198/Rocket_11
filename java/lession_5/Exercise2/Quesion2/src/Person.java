import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private boolean gender;
	private LocalDate dateOfBirth;
	private String address;

	public Person() {

	}

	public Person(String name, boolean gender, LocalDate dateOfBirth, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		name = sc.nextLine();
		String gt = sc.nextLine();
		gender = gt.equals("Nam") ? true : false;
		System.out.println("Date of birth");
		dateOfBirth = LocalDate.parse(sc.nextLine());
		System.out.println("Address");
		address = sc.nextLine();

	}

	public void showInfo() {
		System.out.println("Name:" + getName());
		System.out.println("Gender:" + isGender());
		System.out.println("Date of birth:" + getDateOfBirth());
		System.out.println("Address:" + getAddress());
	}
}
