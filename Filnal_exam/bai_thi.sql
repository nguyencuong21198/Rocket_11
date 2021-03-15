DROP DATABASE IF EXISTS ThucTap;

CREATE DATABASE ThucTap;

USE ThucTap;


-- create table country
DROP TABLE IF EXISTS Country;
CREATE TABLE Country(
country_id			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
country_name		NVARCHAR(50) UNIQUE KEY NOT NULL
);

-- create table Location
DROP TABLE IF EXISTS Location;
CREATE TABLE Location(
location_id				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
street_address			NVARCHAR(50) NOT NULL,
postal_code				TINYINT UNSIGNED NOT NULL,
country_id				TINYINT UNSIGNED,
FOREIGN KEY(country_id)	REFERENCES 	Country(country_id)	
);

-- create table Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee(
Employee_id			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
full_name			NVARCHAR(50) NOT NULL,
email				VARCHAR(50) NOT NULL UNIQUE KEY,
location_id			TINYINT UNSIGNED,

FOREIGN KEY(location_id) REFERENCES Location(location_id) ON DELETE SET NULL
);



-- insert data Country

INSERT INTO Country		(country_name	)
VALUES					(N'Việt Nam'	),
						(N'Hàn Quốc'	),
                        (N'Nhật Bản'	);
                        
                        
-- insert data location
INSERT INTO Location	(street_address			,postal_code	,country_id)
VALUES					(N'296 Lĩnh Nam'		,'2'			,'1'		),
						(N'19 Lê Thanh Nghị'	,'1'			,'3'		),
                        (N'454 Hoàng Mai'		,'3'			,'2'		);


-- insert data employee
INSERT INTO employee(full_name				,email					,location_id)
VALUES				(N'Nguyễn PhươngCường'	,'cuongbn98@gmail.com'	,'1'		),
					(N'Hà Văn HAnh'			,'HanhHN@gmail.com'		,'3'		),
                    (N'Bùi Đình ĐẠt'		,'Dat09@gmail.com'		,'1'		);
                    
                    
                    
-- a) Lấy tất cả các nhân viên thuộc Việt nam
SELECT c.country_name,a.Full_name
FROM Country c
JOIN Location b ON c.country_id = b.country_id
JOIN employee a ON b.location_id = a.location_id
WHERE c.country_name = N'Việt Nam'
; 
-- b) Lấy ra tên quốc gia của employee có email là "cuongbn98@gmail.com"
SELECT c.country_name, a.email
FROM Country c
JOIN Location b ON c.country_id = b.country_id
JOIN employee a ON b.location_id = a.location_id
WHERE a.email = 'cuongbn98@gmail.com'

; 
-- c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang
-- làm việc.
WITH locationhasemployee AS (
			SELECT		l.country_id,e.full_name, l.street_address, COUNT(e.employee_id)
			FROM		location l
			JOIN employee e ON	l.location_id = e.location_id
			GROUP BY	l.location_id)
SELECT c.country_id, c.country_name, le.street_address, COUNT(c.country_name) AS SL_Employee
FROM Country c
JOIN locationhasemployee le ON c.country_id = le.country_id
GROUP BY c.country_name; 

-- 3 Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa
-- 10 employee

DELIMITER $$
CREATE TRIGGER country_insert_employee
AFTER INSERT
ON Country  FOR EACH ROW
BEGIN
	IF NEW.insert Then
		INSERT INTO employee(Employee_id,Full_name, email, location_id)
		VALUE(new.id,CONCAT(New.Full_name,'không để trống'));
    END IF;
END $$
DELIMITER ;


-- 4 Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
-- location đó sẽ có location_id = null
DELETE 
FROM Location
WHERE location_id ='1';
