DROP DATABASE IF EXISTS QL_NhanVien;
CREATE DATABASE QL_NhanVien;
USE QL_NhanVien;


DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
Department_Number			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY key,
Department_Name				NVARCHAR(50) UNIQUE KEY NOT NULL
);


DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
Employee_Number			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Employee_Name			NVARCHAR(50) NOT NULL,
Department_Number		TINYINT UNSIGNED NOT NULL,

FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);


DROP TABLE IF EXISTS Skill;
CREATE TABLE Skill(
Skill_ID				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
Skill_Code				VARCHAR(10) NOT NULL,
Date_Registered			DATETIME DEFAULT NOW(),
Employee_Number			TINYINT UNSIGNED NOT NULL,

FOREIGN KEY(Employee_Number) REFERENCES Employee(Employee_Number)
);




/*Question 2: Thêm ít nhất 10 bản ghi vào table*/


INSERT INTO Department	(Department_Name)
VALUES					(N'Bảo vệ'),
						(N'Tài chính'),
                        (N'Nhân sự'),
                        (N'Kinh doanh'),
                        (N'Sáng tạo'),
                        (N'Kỹ thuật'),
                        (N'Maketing'),
                        (N'Sale'),
                        (N'Giám đốc'),
                        (N'TRuyền thông');
                        
INSERT INTO Employee	(Employee_Name				,Department_Number	)
VALUES					(N'Nguyễn Phương Cường'		,'6'				),
						(N'Bùi Đình Đạt'			,'6'				),
                        (N'Mai Loan'				,'1'				),
                        (N'Vui Hoàng'				,'2'				),
                        (N'Độc Văn Cô'				,'3'				),
                        (N'Tiêu Văn Phong'			,'1'				),
                        (N'Vũ Ngọc Anh'				,'10'				),
                        (N'Quốc Dũng'				,'8'				),
                        (N'ThànhCD'					,'5'				),
                        (N'Hà Híp'					,'7'				);
					
                        
INSERT INTO Skill			(Skill_Code		,Date_Registered	,Employee_Number	)
VALUES						('Java'			,'2000-01-01'		,'1'				),
							('PHP'			,'2020-01-10'		,'1'				),
                            ('C#'			,'2019-12-21'		,'3'				),
                            ('Ruby'			,'2020-05-20'		,'4'				),
                            ('Java'			,'2018-10-20'		,'7'				),
                            ('C++'			,'2019-10-10'		,'10'				),
                            ('Ruby'			,'2020-01-08'		,'8'				),
                            ('PHP'			,'2017-01-01'		,'5'				),
                            ('javascript'	,'2018-02-20'		,'1'				),
                            ('Android'		,'2000-09-25'		,'8'				);
                            
/*Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java*/
SELECT Employee_Name FROM Employee
UNION 
SELECT Skill_Code FROM Skill
;

/*Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên*/
SELECT * FROM Department a
JOIN Employee b ON a.Department_Number = b.Department_Number
GROUP BY b.Department_Number
HAVING COUNT(b.Department_Number)>=2;


/*Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.*/
SELECT * FROM Department A
JOIN Employee b ON a.Department_Number = b.Department_Number
GROUP BY A.Department_Number;

/*Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.*/
SELECT Employee_Name FROM Employee a
JOIN Skill b ON a.Employee_Number = b.Employee_Number
GROUP BY b.Employee_Number
HAVING COUNT(a.Employee_Number)>1;

