package service.manager;

import business.domain.PersonEntity;
import business.repository.PersonRepository;
import service.dto.Person;
import service.mapper.PersonMapper;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    private PersonMapper mapper;
    private PersonRepository repository;

    public PersonManager() {
        this.mapper = new PersonMapper();
        this.repository = new PersonRepository();
    }

    public Person createPerson(Person dto){
        // 1. convert to entity
        // 2. apply Business logic
        // 3. return converted entity to dto
        PersonEntity entity = mapper.toEntity(dto);
        PersonEntity savedEntity = repository.create(entity);
        System.out.println("savedentity : " + savedEntity);
        Person savedDTO = mapper.toDTO(savedEntity);
        return savedDTO;
    }

    public List<Person> getAllPerson(){
        List<PersonEntity> entities = repository.getAll();
        List<Person> persons = new ArrayList<>();
        for(PersonEntity entity : entities){
            persons.add(mapper.toDTO(entity));
        }
        return persons;
    }

    public void deletePerson(Long id){
        repository.delete(id);
    }
}
