select Person.firstName,Person.lastName,Address.city,Address.state
FROM Person NATURAL LEFT JOIN Address;

