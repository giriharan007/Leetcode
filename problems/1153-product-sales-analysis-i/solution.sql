# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales s  INNER JOIN Product p
WHERE s.product_id=p.product_id ;
