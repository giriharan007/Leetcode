# Write your MySQL query statement below
select project_id, round(avg(experience_years),2) as average_years
FROM Project p  JOIN Employee e
ON p.employee_id =e.employee_id
GROUP BY  p.project_id  

