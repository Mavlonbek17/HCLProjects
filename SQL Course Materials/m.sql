-- SELECT COUNT(emp_id) 
-- from employee
-- where sex = 'F' and birth_day > '1970-01-01';

-- SELECT COUNT(sex),sex
-- FROM employee
-- Group BY sex;

-- SELECT SUM(total_sales),client_id
-- FROM  works_with
-- GROUP BY  client_id;

-- SELECT * 
-- FROM client
-- WHERE client_name LIKE '%llc';

-- sELECT * 
-- FROM client 
-- where client_name LIKE '%school%';

-- UNIONS
-- SELECT first_name AS Copany_Name
-- From employee 
-- union
-- select branch_name
-- from branch;

Insert into branch Values(4,'Bufallo',Null,Null);