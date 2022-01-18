package runner;

import service.dto.Person;
import service.manager.PersonManager;


public class PersonRunner {

    public static void main(String[] args) {

        PersonManager mgr = new PersonManager();

        System.out.println("init: " + mgr.getAllPerson());

        Person dto = new Person();
        dto.setName("Hans");
        dto.setAge("36");
        mgr.createPerson(dto);

        System.out.println("add 1: " + mgr.getAllPerson());

        dto = new Person();
        dto.setName("Hans");
        dto.setAge("36");
        mgr.createPerson(dto);

        System.out.println("add 2: " + mgr.getAllPerson());


    }
}
