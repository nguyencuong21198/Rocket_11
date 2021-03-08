DROP DATABASE IF EXISTS Training_Management;

CREATE DATABASE Training_Management;

USE Training_Management;

DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
TraineeID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
Full_Name				NVARCHAR(50) NOT NULL,
Birth_Date				DATE NOT NULL,
Gender					ENUM('Male','Female','Unknown'),
ET_IQ					TINYINT UNSIGNED CHECK(ET_IQ<=20) NOT NULL,
ET_Gmath				TINYINT UNSIGNED CHECK(ET_Gmath<=20) NOT NULL,
ET_English				TINYINT UNSIGNED CHECK(ET_English<=20) NOT NULL,
Training_Class			CHAR(9) NOT NULL,
Evaluation_Notes		NVARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS Ques2;
CREATE TABLE Ques2(
ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Name				NVARCHAR(50) NOT NULL,
Code				CHAR(5) NOT NULL,
ModifiedDate		DATETIME DEFAULT NOW()
);


DROP TABLE IF EXISTS Ques3;
CREATE TABLE Ques3(
ID					TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
`Name`				NVARCHAR(50) NOT NULL,
BirthDate			DATE NOT NULL,
Gender				ENUM('0','1','2'),     /*0:Male,  1:Female,  2:Unknown*/
IsDeletedFlag		BIT						/*1: Đã xóa,  0: hoạt động*/
);

/*Thêm cột VTI_Account vào bảng Trainee*/
ALTER TABLE Trainee
ADD COLUMN VTI_Account		CHAR(5) NOT NULL UNIQUE KEY;


/* INSERT bản ghi vào bảng Trainee*/
INSERT INTO Trainee(Full_Name				,Birth_Date		,Gender		,ET_IQ	,ET_Gmath	,ET_English	,Training_Class		,Evaluation_Notes	,VTI_Account)
VALUES				(N'Nguyễn Phương Cường'	,'1998-01-08'	,'Male'		,'15'	,'20'		,'10'		,'Rocket_11'		,'aaa'				,'VTI_1'	),
					(N'Bùi Đình Đạt'		,'1999-10-21'	,'Male'		,'10'	,'20'		,'10'		,'Rocket_11'		,'aaa'				,'VTI_2'	),
                    (N'Hoàng Thị Vui'		,'1999-11-21'	,'Female'	,'15'	,'10'		,'15'		,'Rocket_11'		,'aaa'				,'VTI_3'	),
                    (N'Mai Thị Loan'		,'1999-02-10'	,'Female'	,'20'	,'10'		,'20'		,'Rocket_11'		,'aaa'				,'VTI_4'	),
                    (N'Hà Văn Hanh'			,'1999-03-08'	,'Male'		,'15'	,'15'		,'10'		,'Rocket_11'		,'aaa'				,'VTI_5'	),
                    (N'Nguyễn Thanh Tùng'	,'1999-05-20'	,'Male'		,'10'	,'10'		,'10'		,'Rocket_11'		,'aaa'				,'VTI_6'	),
                    (N'Triệu Quốc Dũng'		,'2001-10-20'	,'Male'		,'10'	,'10'		,'15'		,'Rocket_11'		,'aaa'				,'VTI_7'	),
                    (N'Nguyễn Thị Huyền'	,'1997-08-05'	,'Female'	,'20'	,'15'		,'15'		,'Rocket_11'		,'aaa'				,'VTI_8'	),
                    (N'Phong Thanh Dương'	,'1998-10-15'	,'Male'		,'10'	,'10'		,'15'		,'Rocket_11'		,'aaa'				,'VTI_9'	),
                    (N'Vũ Nhật Anh'			,'2000-02-07'	,'Female'	,'15'	,'15'		,'10'		,'Rocket_11'		,'aaa'				,'VTI_0'	);
                    
                    
/*INSERT bản ghi vào bảng Ques2*/
INSERT INTO Ques2	(Name		,Code		,ModifiedDate)
VALUES				(N'Cường'	,'AB001'	,'2020-01-01'),
                    (N'Đạt'		,'AB002'	,'2020-01-10'),
                    (N'Vui'		,'AB003'	,'2020-02-15'),
                    (N'Loan'	,'AB004'	,'2020-02-20'),
                    (N'Huyền'	,'AB005'	,'2020-03-08'),
                    (N'Hanh'	,'AB006'	,'2020-03-21'),
                    (N'Dũng'	,'AB007'	,'2020-11-21'),
                    (N'Anh'		,'AB008'	,'2020-10-20'),
                    (N'Dương'	,'AB009'	,'2020-12-31'),
                    (N'Thành'	,'AB000'	,'2020-05-20');
                    
                    
INSERT INTO Ques3	(`Name`			,BirthDate		,Gender		,IsDeletedFlag)
VALUES				(N'DuongQua'	,'1990-01-10'	,'0'		,1		),
					(N'CoCo'		,'1990-10-30'	,'1'		,0		),
                    (N'DoanDu'		,'1995-12-31'	,'0'		,0		),
                    (N'TieuPhong'	,'1989-05-20'	,'0'		,1		),
                    (N'HuTruc'		,'2000-11-21'	,'0'		,1		),
                    (N'DocCo'		,'1999-02-28'	,'0'		,1		),
                    (N'Minh'		,'1990-07-21'	,'0'		,0		),
                    (N'Thanh'		,'1990-09-10'	,'1'		,1		),
                    (N'Truc'		,'2001-03-30'	,'1'		,0		),
                    (N'DuongQua'	,'1999-10-10'	,'0'		,1		);



/*Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
nhóm chúng thành các tháng sinh khác nhau*/
SELECT * FROM Trainee;

/*Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:
tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)*/
SELECT Full_Name, char_length(Full_Name) 
FROM Trainee;


SELECT MAX(char_length(Full_Name))
FROM Trainee;


SELECT Full_Name, MAX(char_length(Full_Name))
FROM Trainee
WHERE char_length(Full_Name)=(SELECT MAX(char_length(Full_Name) )
FROM trainee);


/*Question 5: xóa thực tập sinh có TraineeID = 3*/
DELETE FROM Trainee WHERE TraineeID ='3';



/*Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật
thông tin vào database*/
UPDATE Trainee
SET  Training_Class='Rocket_02'
WHERE TraineeID='5';



