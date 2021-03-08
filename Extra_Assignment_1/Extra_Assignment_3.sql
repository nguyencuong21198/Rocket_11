USE adventureworks;

/*===Exercise 1====*/
-- Question 1:
SELECT p.name
FROM productsubcategory  ps
JOIN product p ON ps.ProductSubcategoryID = p.ProductSubcategoryID
WHERE ps.Name='Saddles'
;

-- Question 2:
SELECT p.name
FROM productsubcategory  ps
JOIN product p ON ps.ProductSubcategoryID = p.ProductSubcategoryID
WHERE ps.Name LIKE 'Bo%'
;



-- Question 3:

SELECT p.name
FROM productsubcategory  ps
JOIN product p ON ps.ProductSubcategoryID = p.ProductSubcategoryID
WHERE ps.Name=(SELECT MIN(ListPrice) 
				FROM product
                
                )
;

SELECT name
FROM product
WHERE ProductSubcategoryID = '3'
LIMIT 10;


/*====================================Exercise 2==================================================*/
/*dùng bảng stateprovince, countryregion */

SELECT b.Name,a.Name AS Province
FROM countryregion	b 
JOIN stateprovince a ON a.CountryRegionCode = b.CountryRegionCode
;

SELECT b.Name,a.Name AS Province
FROM countryregion	b 
JOIN stateprovince a ON a.CountryRegionCode = b.CountryRegionCode
WHERE a.Name = 'Germany'
GROUP BY a.Name
HAVING a.Name = 'Canada'
ORDER BY a.Name ASC
;




