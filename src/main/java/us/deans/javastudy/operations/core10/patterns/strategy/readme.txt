
The data extracted from the HR database will populate a list object with a list of record objects. 
That list object will be passed (by value) to the processing object that will use the strategy pattern to decide how to mutate the list object. 
The mutated list object will then be returned to the calling object (controller) (by value?) where it will be assigned to a separate variable from the original list object.

I might add a queue object to simulate a request queue on a message bus, to run the test multiple times to exercise the strategy options. 




The HR database is the sample that comes with Oracle XE 18c 

create view top_ten_list as
    select e.FIRST_NAME, e.LAST_NAME, e.SALARY, d.DEPARTMENT_NAME, l.city
    from EMPLOYEES e, DEPARTMENTS d, LOCATIONS l
    where e.DEPARTMENT_ID = d.DEPARTMENT_ID and d.LOCATION_ID = l.LOCATION_ID
    order by e.SALARY desc
    fetch next 10 rows only;
    
I just run this from DataGrip but I could easily create a class for initializing the requireed Java objects AND SQL views.

 
    