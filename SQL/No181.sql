select  e.Name as Employee
from Employee e 
join Employee m on e.ManagerId = m.id 
where e.Salary > m.Salary;