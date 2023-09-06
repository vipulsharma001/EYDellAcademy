
CREATE TABLE dept_tab

    (deptno INT(5), dname VARCHAR(50), mgr_id INT(10), location_id   INT(10),

    CONSTRAINT pk_dept_tab  PRIMARY KEY (deptno) );

CREATE TABLE hplus.old_emp_tab(
	empno INT(10),
    name  varchar(50) not null,
    job varchar(50),
    manager int(10),
    hiredate DATE,
    salary decimal(10,2),
	commission decimal(10,2),
    deptno int(5)
    );
    
create table dept_copy_tab
(
deptno int,
dname varchar(30),
mgr_id int(10),
location_id int(10)
);


   insert into old_emp_tab select * from emp_tab ;
   select * from old_emp_tab;
   commit;
-- -------------------UPDATE COMMAND-----------------------------   
use hplus;

update hplus.old_emp_tab set salary=8000 where empno=7001;
   
   select * from old_emp_tab;
update emp_tab as e set e.manager = (select * from (select manager from emp_tab where empno=7001) as e3),
e.salary = (select * from (select salary from emp_tab  where empno =7001)as e4);
select * from emp_tab;

update emp_tab set salary = 6969 where empno=7003;
select * from emp_tab;
CREATE TABLE emp_tab_copy(
	empno INT(10),
    name  varchar(50) not null,
    job varchar(50),
    manager int(10),
    hiredate DATE,
    salary decimal(10,2),
	commission decimal(10,2),
    deptno int(5)
    );
select * from emp_tab_copy;
insert into emp_tab_copy select * from emp_tab;
update emp_tab set salary = 696967 where empno=7003;
select * from emp_tab;
update emp_tab_copy as e set e.salary = (select salary from emp_tab where salary);
select * from emp_tab_copy;
delete from emp_tab_copy where salary=696969;
delete from emp_tab_copy where salary=(select salary from emp_table where deptnp=23);
CREATE TABLE hplus.emp_tab_copy1(
	empno INT(10),
    name  varchar(50) not null,
    job varchar(50),
    manager int(10),
    hiredate DATE,
    salary decimal(10,2),
	commission decimal(10,2),
    deptno int(5)
    );
    CREATE TABLE hplus.emp_tab2(
	empno INT(10),
    name  varchar(50) not null,
    job varchar(50),
    manager int(10),
    hiredate DATE,
    salary decimal(10,2),
	commission decimal(10,2),
    deptno int(5),
    CONSTRAINT pk_emp_tab Primary Key(empno),
    Constraint fk_emp_tab2_depno FOREIGN KEY (depno) References dept_tab(depno)
    );
    insert into emp_tab2 select * from emp_tab;
    insert into emp_tab_copy1 select * from emp_tab;
    select * from dept_tab;
    delete  from emp_tab_copy1 where salary=(select salary from emp_tab where salary = 696969);
    describe emp_tab;
    delete  from dept_tab where deptno=33;
    ALTER TABLE emp_tab
ADD CONSTRAINT fk_emp_tab foreign KEY (depno) References dept_tab(depno);
ALTER TABLE emp_tab
rename column deptno to depno;
select * from emp_tab;
describe emp_tab;
ALTER TABLE emp_tab
rename column depno to deptno;
describe emp_tab;
 ALTER TABLE emp_tab ADD CONSTRAINT fk_emp_tab foreign KEY (deptno) References dept_tab(deptno);
  ALTER TABLE employee ADD CONSTRAINT fk_employee foreign KEY (empid) References department(empid);
select * from employee;
-- SELECT name
-- FROM emp_tab
-- WHERE name LIKE.{6};

create table employees_dept40 as (select empno ,name , job ,salary from emp_tab where deptno=40);
alter table employees_dept40 add column job varchar(10);
desc employees_dept40;
select*from employees_dept40;



CREATE TABLE states (state_id INT(10),state_name VARCHAR(20), state_region VARCHAR(20), country_id INT(10), 

total_customers INT(20), profit_state_level INT(20), 

CONSTRAINT pk_state_states_id PRIMARY KEY(state_id),

CONSTRAINT fk_states_country_id FOREIGN KEY(country_id) REFERENCES country_tab(c_id));

ALTER TABLE states
MODIFY total_customers int NOT NULL;

describe states;
Insert into states values(01,"Haryana","north",91,45,71);
Insert into states values(02,"Haryanaa","nortth",92,null,71);

ALTER TABLE states
ADD UNIQUE (ID);
create table person 
(
id int not null ,
lname varchar(20) not null ,
fname varchar(20) not null ,
age int
);
create table address
(
id int primary key not null ,
street varchar(20)
);
ALTER TABLE person
ADD CONSTRAINT pk_id PRIMARY KEY (id);

describe person;
alter table person 
add constraint fk_person_id FOREIGN KEY(id) REFERENCES address(id);

describe person;

alter table address 
add constraint fk_address_person_id FOREIGN KEY(id) REFERENCES person(id);
select * from person;

-- UNIQUE_____________________________________________________
ALTER TABLE states
ADD UNIQUE (state_region);

describe states;

Alter table states
rename to statesIndia;

alter table statesIndia rename column state_name to sname;

ALTER TABLE person
modify lname char(50);


ALTER TABLE address
drop COLUMN street ;


ALTER TABLE address
add COLUMN street int;


select * from employee25;


-- _________________________________________________________


DROP PROCEDURE hplus.insertEmployee;
DELIMITER // ;
CREATE PROCEDURE hplus.insertEmployee
(IN in_id INT,
IN in_name VARCHAR (20),
IN in_role VARCHAR (20),
IN in_city VARCHAR (25),
IN in_country VARCHAR (25),
OUT out_result VARCHAR (25))
BEGIN
INSERT INTO hplus.EMPLOYEE (EMPID, NAME, ROLE, CITY, COUNTRY) values (in_id,in_name,in_role,in_city,in_country);
commit;
SET out_result :='TRUE';
END;
select * from hplus.employee;
describe hplus.insertEmployee;

select * from emp_tab1;

CREATE TABLE emp_tab1(
	empno INT(10),
    empname  varchar(50) not null,
    job varchar(50),
    manager int(10),
    hiredate DATE,
    salary decimal(10,2),
	commission decimal(10,2),
    deptno int(5)
    );
    
    [11:12] Shashank Tiwari

CREATE TABLE hplus.employee(EMPID INT,

NAME VARCHAR(25),

            ROLE VARCHAR(25),

            CITY VARCHAR(25),

            COUNTRY VARCHAR(25));


commit;            
    
    
    
    
    select * from hplus.employee
    
    drop table hplus.employee;
    
    CREATE TABLE hplus.employee(EMPID INT,
			NAME VARCHAR(25),
            ROLE VARCHAR(25),
            CITY VARCHAR(25),
            COUNTRY VARCHAR(25));
            
            commit;
	DROP PROCEDURE hplus.insertEmployee;
DELIMITER // ;
CREATE PROCEDURE hplus.insertEmployee
(IN in_id INT,
IN in_name VARCHAR (20),
IN in_role VARCHAR (20),
IN in_city VARCHAR (25),
IN in_country VARCHAR (25),
OUT out_result VARCHAR (25))
BEGIN
INSERT INTO hplus.EMPLOYEE (EMPID, NAME, ROLE, CITY, COUNTRY) values (in_id,in_name,in_role,in_city,in_country);
commit;
SET out_result :='TRUE';
END;

drop table department;
CREATE TABLE hplus.department(EMPID INT,
			DNAME VARCHAR(25) Primary Key,
            
            COUNTRY VARCHAR(25));
            insert 