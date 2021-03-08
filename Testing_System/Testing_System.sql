drop database if exists Testing_System_Assignment_1;
create database Testing_System_Assignment_1;
use Testing_System_Assignment_1;

drop table if exists Department;
create table Department(
DepartmentID tinyint unsigned primary key auto_increment,
DepartmentName nvarchar(50) unique key not null
);


drop table if exists `Position`;
create table `Position`(
PositionID		tinyint unsigned auto_increment primary key,
PositionName	varchar(50) unique key not null		
);


drop table if exists `Account`;
create table `Account`(
AccountID			tinyint unsigned auto_increment primary key,
Email				nvarchar(50) unique key not null,
UserName			nvarchar(50) unique key not null,
FullName			nvarchar(50) not null,
DepartmentID		tinyint unsigned not null,
PositionID			tinyint unsigned not null,
CreateDate			datetime default now(),
foreign key(DepartmentID) references Department(DepartmentID),
foreign key(PositionID) references `Position`(PositionID)
);


drop table if exists `Group`;
create table `Group`(
GroupID				tinyint  unsigned auto_increment primary key,
GroupName			nvarchar(50) not null,
CreatorID			tinyint unsigned not null,
CreateDate			datetime default now(),

foreign key(CreatorID) references `Account`(AccountID)

);



drop table if exists GroupAccount;
create table GroupAccount(
GroupID			tinyint unsigned not null,
AccountID		tinyint unsigned not null,
JoinDate		datetime default now(),

primary key(GroupID,AccountID)
);


drop table if exists TypeQuestion;
create table TypeQuestion(
TypeID			tinyint unsigned auto_increment primary key,
TypeName		enum('Essay','Multiple-Choice') not null 
);


drop table if exists CategoryQuestion;
create table CategoryQuestion(
CategoryID			tinyint unsigned auto_increment primary key,
CategoryName		enum('Java','.NET','SQL','Postman','Ruby','C#') not null unique key
);


drop table if exists Question;
create table Question(
QuestionID			tinyint unsigned auto_increment primary key,
Content				nvarchar(255) not null unique key,
CategoryID			tinyint unsigned not null,
TypeID				tinyint unsigned not null,
CreatorID			tinyint unsigned not null,
CreateDate			datetime default now(),
foreign key(TypeID) references TypeQuestion(TypeID),
foreign key(CategoryID) references CategoryQuestion(CategoryID),
foreign key(CreatorID) references `Account`(AccountID)
);


drop table if exists Answer;
create table Answer(
AnswerID			tinyint unsigned auto_increment primary key,
Content				nvarchar(255) not null unique key,
QuestionID			tinyint unsigned not null,
isCorrect			bit /*1:đúng, 0: sai*/,
foreign key(QuestionID) references Question(QuestionID)
);


drop table if exists Exam;
create table Exam(
ExamID				tinyint unsigned primary key auto_increment, 
`Code`				varchar(10) not null unique key,
Title				nvarchar(255) not null unique key,
CategoryID			tinyint unsigned,
Duration			TINYINT UNSIGNED,
CreatorID			tinyint unsigned,
CreateDate			datetime default now(),

foreign key(CreatorID) references `Account`(AccountID),
foreign key(CategoryID) references CategoryQuestion(CategoryID)
);



drop table if exists ExamQuestion;
create table ExamQuestion(
ExamID				tinyint unsigned auto_increment primary key,
QuestionID			tinyint unsigned,
foreign key(QuestionID) references Question(QuestionID)
);


/*==============ADD DATA============*/
/*--ADD Data Department--*/
insert into Department	(DepartmentName	)
values				  	(N'Sale'		),
						(N'Maketing'	),
                        (N'Bảo vệ'		),
                        (N'Nhân sự'		),
                        (N'Tài chính'	);
                        
/*--ADD data Position --*/

insert into `Position`	(PositionName)
values					('Dev'),
						('Test'),
                        ('Scrum_Master'),
                        ('PM');

/*--ADD data `Account` --*/

insert into `Account`	(Email						, UserName			, FullName					, DepartmentID	,	PositionID		, CreateDate	)
values					(N'cuongbn198@gmail.com'	,	N'Cuong'		, N'NGuyễn Phương Cường'	,		'1'		,	'1'				,'2020-01-01'	),
						(N'dat@gmail.com'			,	N'Dat'			, N'Bùi Đình Đạt'			,		'2'		,	'4'				,'2020-05-10'	),
                        (N'HanhHN@gmail.com'		,	N'HanhHN'		, N'Hà Văn Hanh'			,		'3'		,	'3'				,'2020-02-20'	),
                        (N'VTI@gmail.com'			,	N'VTI'			, N'VTI Academy'			,		'4'		,	'2'				,null			),
                        (N'Anh@gmail.com'			,	N'Conquynho'	, N'NGuyễn Phương Cường'	,		'5'		,	'1'				,null			);
                        
                        
/*--ADD data Group--*/
insert into `Group`	(GroupName		,CreatorID	,CreateDate)
values				(N'Sale'		,'1'		,'2020/01/01'),	
					(N'Tài Chính'	,'2'		,'2020/02/20'),
                    (N'Bảo vệ'		,'3'		,'2020/03/30'),
                    (N'Nhân sự'		,'4'		,'2020/04/14'),
                    (N'Maketing'	,'5'		,'2020/11/21');


/*--Add data GroupAccount--*/
insert into GroupAccount(GroupID	,AccountID	,JoinDate)
values					('1'		,'5'		,'2020/01/01'	),
						('2'		,'4'		,'2020/01/10'	),
                        ('3'		,'3'		,'2020/01/20'	),
                        ('4'		,'2'		,null			),
                        ('5'		,'1'		,null			);
                        
/*--Add data --*/
insert into TypeQuestion(TypeName			)
values					('Essay'			),
						('Multiple-Choice'	);
                        
                        
/*--Add data CategoryQuestion--*/
insert into CategoryQuestion(CategoryName)
values						('Java'),
							('.NET'),
                            ('SQL'),
                            ('Postman'),
                            ('Ruby'),
                            ('C#');
                            
/*--Add data Question--*/

INSERT INTO Question(Content								,CategoryID	,TypeID		,CreatorID	,CreateDate)
VALUES				(N'Platform là gì'						,'1'		,'1'		,'2'		,'2010-01-01'),
					(N'.NET hỗ trợ bao nhiêu ngôn ngữ'		,'2'		,'2'		,'3'		,'2020-05-10'),
                    (N'Unique Key là gì'					,'3'		,'1'		,'5'		,'2018-12-31'),
                    (N'Strong Parameters là gì'				,'5'		,'2'		,'1'		,'2020-01-08'),
                    (N'Filter trong controller là gì'		,'4'		,'1'		,'4'		,'2020-11-21');
                    
		/*== ADD data Answer == */
INSERT INTO Answer	(Content			,QuestionID			,isCorrect)
VALUES				(N'Bất cứ môi trường phần cứng hoặc phần mềm nào mà trong đó có một chương trình chạy'		,'1'	,1),
					(N'10 ngôn nhữ'		,'1'				,0),
                    (N'khoas chinh'		,'1'				,0),
                    (N'là phương thức chạy trước, chạy sau hoặc chạy cùng với các action trong controller'		,'4'	,1),
                    (N'là phương thức chạy trước','5',0);
                    
/*--ADD data Exam---*/  
INSERT INTO Exam(`Code`		,Title				,CategoryID			,Duration		,CreatorID		,CreateDate)
VALUES			('VTI01'	,'Đánh giá năng lực','1'				,'90'			,'5'			,'2020-03-01'), 
				('VTI02'	,'kiểm tra '		,'2'				,'90'			,'4'			,'2017-03-01'), 
                ('VTI03'	,'Test'				,'3'				,'90'			,'3'			,'2019-03-01'), 
                ('VTI04'	,'Test1'			,'4'				,'90'			,'2'			,'2020-03-01'), 
                ('VTI05'	,'Test2'			,'5'				,'90'			,'1'			,'2018-03-01');
                    
 /*--Add data ExamQuestion--*/
 INSERT INTO ExamQuestion	(QuestionID)
 VALUES						('3'),
							('5'),
                            ('2'),
                            ('1'),
                            ('4');
  /*==========================================================================*/                  
                    
/*Question 1: Lấy các phòng ban*/
select * from 	Department;

/*Question 2:lấy ID của phòng ban có tên sale*/	
select * from Department where DepartmentName ='sale';

/*Question 3: lấy ra thông tin account có full name dài nhất*/
SELECT FullName, char_length(FullName) 
FROM `Account`;


SELECT MAX(char_length(FullName))
FROM `Account`;


SELECT FullName, MAX(char_length(FullName))
FROM `Account`
WHERE char_length(FullName)=(SELECT MAX(char_length(FullName) )
FROM `Account`)

;

/*Question 4:Lấy ra tên group đã tham gia trước ngày 20/12/2019*/
select GroupName from  `Group` where CreateDate< '2020-12-09';

/*Question 5:Lấy ra ID của question có >= 4 câu trả lời*/
SELECT QuestionID from answer 
GROUP BY QuestionID
HAVING COUNT(QuestionID)>=4;


/*Question 6: Lấy ra 5 group được tạo gần đây nhất*/
SELECT * FROM `Group` ORDER BY GroupID ASC
LIMIT 5;

/*Question 8: Xóa tất cả các exam được tạo trước ngày 20/12/2019*/
DELETE FROM Exam WHERE CreateDate>'2019-03-01';


/* Question 9: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và
 email thành loc.nguyenba@vti.com.vn */
 
 UPDATE `Account`
 SET FullName = 'Nguyễn Bá Lộc', Email = 'loc.nguyenba@vti.com.vn'
 WHERE AccountID ='5';
 
 
 /*Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ*/
 SELECT *
 FROM `account` a
 JOIN department b on a.departmentID = b.departmentid;
 
 
 /*Viết lệnh để lấy ra tất cả các dev*/
 
 SELECT *
 FROM `account` a
 JOIN `position` b on a.PositionID = b.PositionID
WHERE PositionName = 'dev'
;

/*left join*/
SELECT *
 FROM `account` a
 LEFT JOIN `position` b on a.PositionID = b.PositionID;
 
 /*right join*/
SELECT *
 FROM `account` a
 RIGHT JOIN `position` b on a.PositionID = b.PositionID;
 
 
 
 /*   Question 19: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm  */
 
 SELECT *, COUNT(QuestionID) as SOLUONG
 FROM question  a
 JOIN typequestion b on a.TypeID = b.TypeID
 GROUP BY b.TypeID;
 
 
 /*Question 15: Lấy ra Question có nhiều câu trả lời nhất*/
 
 
 