
Select * from Customers

Select * from Orders

Select * from Customers A INNER JOIN Orders B ON A.CustomerID = B.CustomerID


Select A.CustFirstName,A.CustLastName,B.EmployeeID from Customers A INNER JOIN Orders B ON A.CustomerID = B.CustomerID



Select * from Customers A INNER JOIN Orders B ON A.CustomerID = B.CustomerID


Select * from Customers A left JOIN Orders B ON A.CustomerID = B.CustomerID


Select * from Customers A Full outer JOIN Orders B ON A.CustomerID = B.CustomerID


select * from Customers CROSS JOIN Orders



select  GETDATE() 

select DATEPART(dd, GETDATE()) as YEARNUMBER

Select DATEDIFF(day, OrderDate , ShipDate) from Orders








