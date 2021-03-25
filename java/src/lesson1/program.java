package lesson1;

import java.time.LocalDate;
import java.util.Date;

public class program {
	public static void main(String[] args) {
		
		Department department = new Department();
		department.ID =1;
		department.Department_Name="Sale";
		
		Department department2 = new Department();
		department2.ID =1;
		department2.Department_Name="Maketing";
		
		Department department3 = new Department();
		department3.ID =1;
		department3.Department_Name="Kỹ thuật";
		
		Position position1 = new Position();
		position1.ID=1;
		position1.Position_name="Dev";
		
		Position position2 = new Position();
		position2.ID=2;
		position2.Position_name="Test";
		
		Position position3 = new Position();
		position3.ID=3;
		position3.Position_name="PM";
		
		
		/*Thông tin account*/
		
		
		Account account = new Account();
		account.ID=1;
		account.email="cuongbn198@gmail.com";
		account.userName="cuong";
		account.fullName="NGuyễn Phương Cường";
		account.department = department3;
		account.position = position2;
		account.createDate=new Date("2021/03/17");
		account.gender = Gender.MALE;
		
		Account account2 = new Account();
		account2.ID=2;
		account2.email="cuong198@gmail.com";
		account2.userName="cuong98";
		account2.fullName="NGuyễn Cường";
		account2.department = department2;
		account2.position = position1;
		account2.createDate=new Date("2021/03/15");
		account2.gender = Gender.UNKNOW;
		
		
		/*Thông tin Group*/
		Group group1 = new Group();
		group1.ID=1;
		group1.GroupName="abc";
		
		Group group2 = new Group();
		group2.ID=2;
		group2.GroupName="ada";
		
		Group group3 = new Group();
		group3.ID=3;
		group3.GroupName="au";
		
		/*groupAccount*/
		GroupAccount groupAccount = new GroupAccount();
		groupAccount.account = account;
		groupAccount.group = group1;
		groupAccount.joinDate = new Date();
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.account = account2;
		groupAccount2.group = group2;
		groupAccount2.joinDate = new Date("2012/01/02");
		
		GroupAccount[] groupAccounts = {groupAccount,groupAccount2};
		account.groups=groupAccounts;
		
		/*đối tượng categoryQuestion*/
		CategoryQuestion categoryQuestion=new CategoryQuestion();
		categoryQuestion.ID=1;
		categoryQuestion.CategoryName="Câu hỏi Java";
		
		CategoryQuestion categoryQuestion2=new CategoryQuestion();
		categoryQuestion2.ID=2;
		categoryQuestion2.CategoryName="Câu hỏi C#";
		
		CategoryQuestion categoryQuestion3=new CategoryQuestion();
		categoryQuestion3.ID=3;
		categoryQuestion3.CategoryName="Câu hỏi SQL";
		
		
		/*TypeQuestion*/
		TypeQuestion typeQuestion = new TypeQuestion();
		typeQuestion.ID=1;
		typeQuestion.TypeName="essay";
		
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.ID=2;
		typeQuestion2.TypeName="Multiple-Choice";
		
		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.ID=3;
		typeQuestion3.TypeName="essay";
		
		/*Question*/
		Question question1 = new Question();
		question1.ID=1;
		question1.content="Java là gi?";
		question1.CreateDate=new Date();
		question1.cateGory=categoryQuestion2;
		question1.creator=account;
		question1.type=typeQuestion;
		
		
		Question question2 = new Question();
		question2.ID=2;
		question2.content="Có bao nhiêu ngôn ngữ lập trình?";
		question2.CreateDate=new Date();
		question2.cateGory=categoryQuestion3;
		question2.creator=account2;
		question2.type=typeQuestion2;
		
		
		Question question3 = new Question();
		question3.ID=3;
		question3.content="abcxyz";
		question3.CreateDate=new Date();
		question3.cateGory=categoryQuestion2;
		question3.creator=account;
		question3.type=typeQuestion2;
		
		
		/*Exam*/
		Exam exam1 = new Exam();
		exam1.ID=1;
		exam1.code=101;
		exam1.Title="đề thi java";
		exam1.cateGory= categoryQuestion2;
		exam1.creator=account;
		exam1.Duration=60;
		exam1.CreateDate=new Date();
		 
		Exam exam2 = new Exam();
		exam2.ID=2;
		exam2.code=102;
		exam2.Title="đề thi C#";
		exam2.cateGory= categoryQuestion2;
		exam2.creator=account;
		exam2.Duration=90;
		exam2.CreateDate=new Date();
		

		/*ExamQuestion*/
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.question = question1;
		examQuestion1.exam = exam1;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.question = question2;
		examQuestion2.exam = exam2;
		
		
		ExamQuestion[] examQuestions = {examQuestion1,examQuestion2};
		question1.exams = examQuestions;
		
		/*answer*/
		Answer answer = new Answer();
		answer.ID=1;
		answer.Content="Java là một một ngôn ngữ lập trình hiện đại, bậc cao, hướng đối tượng, bảo mật và mạnh mẽ";
		answer.isCorrect=true;
		answer.quesion = question1;
		
		
		Answer answer1 = new Answer();
		answer1.ID=2;
		answer1.Content="Java là một một ngôn ngữ lập trình hiện đại, bậc cao, hướng đối tượng, bảo mật và mạnh mẽ";
		answer1.isCorrect=false;
		answer1.quesion = question2;
		
		
		System.out.println("Thông tin phong ban");
		System.out.println("ID:"+department.ID);
		System.out.println("name:"+department.Department_Name);
		System.out.println("\n");
		System.out.println("Thông tin phong ban2");
		System.out.println("ID:"+department2.ID);
		System.out.println("name:"+department2.Department_Name);
		System.out.println("\n");
		System.out.println("Thông tin phong ban3");
		System.out.println("ID:"+department3.ID);
		System.out.println("name:"+department3.Department_Name);
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("Thông tin chức vụ 1");
		System.out.println("ID:"+position1.ID);
		System.out.println("name:"+position1.Position_name);
		System.out.println("\n");
		System.out.println("Thông tin chức vụ 2");
		System.out.println("ID:"+position2.ID);
		System.out.println("name:"+position2.Position_name);
		System.out.println("\n");
		System.out.println("Thông tin chức vụ 3");
		System.out.println("ID:"+position3.ID);
		System.out.println("name:"+position3.Position_name);
		System.out.println("\n");
		System.out.println("==========================================================");
		System.out.println("Thông tin account");
		System.out.println("ID:"+account.ID);
		System.out.println("email:"+account.email);
		System.out.println("userName:"+account.userName);
		System.out.println("fullName:"+account.fullName);
		System.out.println("department:"+account.department.Department_Name);
		System.out.println("position:"+account.position.Position_name);
		System.out.println("createDate:"+account.createDate);
		System.out.println("gender:"+account.gender);
		System.out.println("\n");
		System.out.println("Thông tin account 2");
		System.out.println("ID:"+account2.ID);
		System.out.println("email:"+account2.email);
		System.out.println("userName:"+account2.userName);
		System.out.println("fullName:"+account2.fullName);
		System.out.println("department:"+account2.department.Department_Name);
		System.out.println("position:"+account2.position.Position_name);
		System.out.println("createDate:"+account2.createDate);
		System.out.println("gender:"+account2.gender);
		System.out.println("==========================================================");
		System.out.println("Thông tin groupAccount");
		System.out.println("tên account:"+groupAccount.account.fullName);
		System.out.println("tên group:"+groupAccount.group.GroupName);
		System.out.println("ngày tham gia nhóm:"+groupAccount.joinDate);
		
		System.out.println("==========================================================");
		System.out.println("id:"+question1.ID);
		System.out.println("ND đề thi:"+question1.content);
		System.out.println("Định danh Đề Thi:"+question1.cateGory.CategoryName);
		System.out.println("Ngày Thi:"+question1.CreateDate);
		System.out.println("Người tạo:"+question1.creator.fullName);
		System.out.println("Loại câu hỏi:"+question1.type.TypeName);
		System.out.println("\n");
		System.out.println("id:"+question2.ID);
		System.out.println("ND đề thi:"+question2.content);
		System.out.println("Định danh Đề Thi:"+question2.cateGory.CategoryName);
		System.out.println("Ngày Thi:"+question2.CreateDate);
		System.out.println("Người tạo:"+question2.creator.fullName);
		System.out.println("Loại câu hỏi:"+question2.type.TypeName);
		
		
		System.out.println("==========================================================");
		System.out.println("id:"+exam1.ID);
		System.out.println("Mã đề thi:"+exam1.code);
		System.out.println("Tên Đề Thi:"+exam1.Title);
		System.out.println("CHủ đề Thi:"+exam1.cateGory.CategoryName);
		System.out.println("Thời gian thi:"+exam1.Duration);
		System.out.println("Người tạo:"+exam1.creator.fullName);
		System.out.println("Ngày thi:"+exam1.CreateDate);
		System.out.println("\n");
		System.out.println("id:"+exam2.ID);
		System.out.println("Mã đề thi:"+exam2.code);
		System.out.println("Tên Đề Thi:"+exam2.Title);
		System.out.println("CHủ đề Thi:"+exam2.cateGory.CategoryName);
		System.out.println("Thời gian thi:"+exam2.Duration);
		System.out.println("Người tạo:"+exam2.creator.fullName);
		System.out.println("Ngày thi:"+exam2.CreateDate);
		System.out.println("==========================================================");
		System.out.println("Định danh đề:"+examQuestion1.exam.Title);
		System.out.println("Định danh câu hỏi:"+examQuestion1.question.content);
		
		
		System.out.println("==========================================================");
		System.out.println("Câu hỏi:"+answer.quesion.content);
		System.out.println("câu trả lời:"+answer.Content);
		System.out.println("True Or False:"+answer.isCorrect);
		System.out.println("\n");
		System.out.println("Câu hỏi:"+answer1.quesion.content);
		System.out.println("câu trả lời:"+answer1.Content);
		System.out.println("True Or False:"+answer1.isCorrect);
		
	}
}
