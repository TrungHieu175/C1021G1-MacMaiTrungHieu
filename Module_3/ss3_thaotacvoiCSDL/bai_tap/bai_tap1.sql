use QuanLySinhVien;
/* 1. */
SELECT * FROM Student
WHERE StudentName like 'h%';
/* 2. */
select * from Class
where Month(StartDate) = 12;
/* 3. */
select * from Subject
where Credit >=3 And Credit <=5;
/* 4. */
SET SQL_SAFE_UPDATES = 0;
Update Student
Set ClassId = 2
Where StudentName = 'Hung';
SET SQL_SAFE_UPDATES = 1;
/* 5. */
Select S.StudentName, SJ.SubName, M.Mark
From Student S
JOIN Mark M 
On S.StudentId = M.StudentId
JOIN Subject SJ
ON SJ.SubId = M.SubId
ORDER BY M.Mark DESC, S.StudentName ASC;
