
--drop table TASK

create table TASK(id int auto_increment primary key, name varchar(255) , status int);
insert into TASK(ID,NAME,STATUS) values(default,'Dev',1);
insert into TASK(ID,NAME,STATUS) values(default,'Test',1);
insert into TASK(ID,NAME,STATUS) values(default,'PlayGame',1);
select * from TASK;

--insert into TASK(ID,NAME,STATUS) values(1,'Barcelona',1);