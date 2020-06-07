# EmployeeServ

 Steps needed to run the Spring boot application
 git@github.com:saaske/EmployeeServ.git
 cd EmployeeServ
 mvn spring-boot:run
 
 insert sample data into db
 
insert into emp (employee_id, first_name,last_name) values ("E1024","John","D’Costa"), ("E1158", "Rohit", "Sharma"), ("E1011", "Rajesh", "Varma"), ("E1019", "Anil", "Yadav")

insert into fnp.project (id, name) values(1,"BTPX"),(2,"OSR"),(3,"OTIS"),(4,"ASF"),(5,"CBS"),(6,"CBSX"),(7,"MWC-2")

insert into fnp.emp_projects (employee_employee_id, projects_id) values 
("E1024", 1),("E1024", 2),("E1024", 3), 
("E1158", 2), ("E1158", 4), ("E1158", 1), 
("E1011", 5), ("E1011", 6), ("E1011", 7), ("E1011", 4), 
("E1019", 1), ("E1019", 4)

insert into fnp.emp_hr (employee_employee_id, age,date_of_Joining,salary, department) values
("E1024",34,"2003-04-11","Rs.10,00,000",0), 
("E1158", 25, "2006-07-14", "Rs.4,00,000",0), 
("E1011", 43, "1998-08-19", "Rs.8,00,000",0),
("E1019",  36, "2003-04-12",  "Rs.12,00,000",0)


After inserting data into db
u can access the data by using this endpoint http://localhost:8080/v1/account/employees?size=1 (assuming you are running in local machine)
