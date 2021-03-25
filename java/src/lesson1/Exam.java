package lesson1;


import java.util.Date;

public class Exam {
	int ID;
	int code;
	String Title;
	int Duration;
	Date CreateDate;
	Account creator;
	CategoryQuestion cateGory;
	
	ExamQuestion[] questions;
}
