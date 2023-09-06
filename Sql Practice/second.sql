create Database if not exists `hplus`;
use `hplus`;

CREATE table hplus.dept_table
(
depno int(5),
dname varchar(50),
mgr_id int(5),
constraint pk_dep primary key(depno)
);
insert into hplus.dept_tab values(30,"vipul",123);
insert into hplus.dept_tab values(31,"vipul 1",123);
insert into hplus.dept_tab values(32,"vipul 2",123);
insert into hplus.dept_tab values(33,"vipul 3",123);
insert into hplus.dept_tab values(34,"vipul 4",123);
insert into hplus.dept_tab values(null,"vipul 5",123);
insert into hplus.dept_tab values(36,"vipul 6",123);
select depno*5 as LOL from hplus.dept_tab;

commit;

CREATE TABLE hplus.emp_tab(
	empno INT(10),
    name  varchar(50) not null,
    job varchar(50),
    manager int(10),
    hiredate DATE,
    salary decimal(10,2),
	commission decimal(10,2),
    deptno int(5),
    CONSTRAINT pk_emp_tab Primary Key(empno),
    Constraint fk_emp_tab_depno FOREIGN KEY (depno) References dept_tab(depno)
    );
    
    describe hplus.emp_tab;
insert into hplus.emp_tab values(
	7001,
    "King ",
    "President",
    null,
    STR_TO_DATE('May 18,1981','%M %d,%Y'),
	23450.00,
    1200.00,
    30);
insert into hplus.emp_tab values(7002,
"Clark",
"Manager",
7001,
STR_TO_DATE('May 18,1982','%M %d,%Y'),
	23450.00,
    1200.00,
    31);
insert into hplus.emp_tab values(7003,
	"Sones",
    "Analyst",
    7001,
STR_TO_DATE('May 18,1983','%M %d,%Y'),
	23450.00,
    200.00,
    22);
insert into hplus.emp_tab values(7004,
	"Scott",
    "Manager",
    7002,
  STR_TO_DATE('May 18,1984','%M %d,%Y'),
	23450.00,
    1100.00,
    23);
    
    insert into hplus.emp_tab values(7005,
	"Acott",
    "Manager",
    7005,
  STR_TO_DATE('May 18,1987','%M %d,%Y'),
	23450.00,
    1100.00,
    32);
    insert into hplus.emp_tab values(7006,
	"Dcott",
    "Manager",
    7005,
  STR_TO_DATE('May 18,1987','%M %d,%Y'),
	23470.00,
    1100.00,
    32);


select * from hplus.emp_tab;
SELECT * FROM emp_tab
WHERE hiredate =  STR_TO_DATE('May 18,1984','%M %d,%Y');

SELECT * FROM emp_tab
order by deptno, salary desc;

SELECT deptno as dp FROM emp_tab
order by dp, salary desc;
-- --One Line Function 
select round(74782.234,2) from dual;

select trunc(74782.516,2) from dual;

select mod(74782.514,2) from dual;

select upper(name) from emp_tab ;

select lower(name) from emp_tab ;



select concat(name," belongs to department number : ",deptno) as new  from emp_tab;

select instr("hello",'o') from dual;
select lpad(5000,8,'*') from dual;
select lpad(500000,8,'*') from dual;

select rpad(7000,8,'*') from dual;

select trim('d'from 'helloworld')from dual;

select replace('helloworld','hello','bye') from dual;

select sysdate() + interval '10' day  from dual;
select date_add(sysdate(),interval 45 day) from dual;
select TIMESTAMPDIFF(Year, '2017-05-05', '2027-06-04')from dual;
select TIMEDIFF("12:25", "5:45") from dual;

SELECT truncate(SYSDATE()) FROM dual;

select name ,str_to_date(hiredate,'yyyy')"LOL" from emp_tab;




SELECT name,YEAR(hiredate) FROM emp_tab;
SELECT NAME, EXTRACT(YEAR FROM hiredate) FROM emp_tab;


select name,job,salary ,
case job when 'Manager' then truncate(1.30*salary,2)
	when 'analyst' then 1.15*salary
    when 'clerk' then 1.10*salary
    else salary 
	end "revised salary"
    from emp_tab;
    
select name , job,salary ,
	decode(job,'manager',1.20*salary,
			'analyst',1.30*salary,
            'clerk',1.75*salary,salary)"Rew" from emp_tab;
            
select round(45.6749) from dual;

select sum(salary) from emp_tab;
select avg(salary) from emp_tab;

select min(salary),Max(salary) from emp_tab where deptno>30;

select count(*) from emp_tab;

select count(name) from emp_tab where manager=7002;

select count(distinct(empno)) from emp_tab;


select min(hiredate) ,max(hiredate) from emp_tab;


select * from emp_tab;
select * from emp_tab group by(select manager from emp_tab where manager>7002);

select manager ,max(salary) from emp_tab group by manager order by max(salary) ;

select name ,max(salary) from emp_tab group by name having max(salary)>=4000;




create table country_tab
(
c_id int(10),
c_name varchar(30),
constraint pk_country_tab primary key(c_id)
);

create table states_tab
(
s_id int(10),
s_name varchar(30),
c_id int(10),
constraint pk_states_tab primary key(s_id),
constraint fk_states_tab foreign key(c_id)
references country_tab(c_id)
);
Insert into states_tab values(01,"Haryana",91);
Insert into states_tab values(02,"UP",91);
Insert into states_tab values(03,"Bihar",91);

Insert into states_tab values(101,"Balochistan",92);
Insert into states_tab values(102,"Punjab Pak",92);
Insert into states_tab values(103,"Sindh",92);

Insert into states_tab values(201,"Georgia",1);
Insert into states_tab values(202,"NY",1);
Insert into states_tab values(203,"texas",1);



Insert into country_tab values(91,"india");
Insert into country_tab values(92,"Pakistan");
Insert into country_tab values(93,"Bangladesh");
Insert into country_tab values(1,"USA");

describe country_tab;
select * from country_tab c inner join states_tab s on c.c_id=s.C_id;

select * from country_tab c left join states_tab s on c.c_id=s.C_id;

select * from country_tab c right join states_tab s on c.c_id=s.C_id;

select * from country_tab c cross join states_tab s where c.c_id=s.C_id;

select empno,name ,deptno ,salary from emp_tab where deptno = (select deptno from emp_tab where empno=7001);

select empno,name ,deptno ,salary from emp_tab where deptno = (select deptno from emp_tab where empno=7001);
select empno,name ,deptno ,salary from emp_tab where deptno = (select deptno from emp_tab where max(salary));
select max(salary) from emp_tab;

select * from states_tab where c_id= (select c_id from states_tab where s_name = 'UP');

select empno,name,salary from emp_tab where salary=(select max(salary) from emp_tab);
select salary from emp_tab where deptno=32;
select empno,name,salary , deptno from emp_tab where salary in (select max(salary) from emp_tab where deptno=32);
select instr("Hello world",'e');
insert into country_tab values(c_id,'&c_name');
select * from country_tab;
