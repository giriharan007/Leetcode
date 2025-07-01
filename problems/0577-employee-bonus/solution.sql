SELECT e.name,b.bonus
FROM Employee e
NATURAL LEFT JOIN Bonus b
WHERE b.bonus IS NULL or b.bonus<1000;

