package ie.atu.week8validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    //Placeholder method to save a person(add to database in the next 2 weeks)
    public void savePerson(Person person){
        System.out.println("person saved" + person);
    }
    //placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId){
        //fetch data from a database in future lab
        //for simplicity we return a dummy person here
        return new Person();
    }
}
