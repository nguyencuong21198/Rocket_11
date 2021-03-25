package lesson1;

import java.util.Date;

public class Question {
	int 			ID;
	String 			content;
	Date 			CreateDate;
	CategoryQuestion cateGory;
	Account 		creator;
	TypeQuestion 	type;
	
	ExamQuestion[]	exams;
}
