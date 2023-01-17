/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.population;

import business.population.Person;
import java.util.ArrayList;

/**
 *
 * @author nishi
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addNewPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void removePerson(Person person){
        personList.remove(person);
    }
    
}
