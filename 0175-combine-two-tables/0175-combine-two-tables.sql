# Write your MySQL query statement below
SELECT firstName , lastName , city , state
FROM Address Right JOIN Person 
ON Person.PersonId = Address.PersonId;