use QuanLySinhVien;
select *
from Subject
where credit = (select max(credit) from Subject);

select * from subject
join mark 
on subject.SubId = Mark.SubId  
where mark.mark = (select max(mark) from mark);

select s.*, avg(m.mark) as diemTrungBinh
from Student s
join Mark m
on m.studentId = s.studentId
group by s.studentId
order by diemTrungBinh desc;

select * from mark;
