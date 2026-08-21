# Write your MySQL query statement below
delete a from Person as a
join person as b
on a.email = b.email
and a.id > b.id;