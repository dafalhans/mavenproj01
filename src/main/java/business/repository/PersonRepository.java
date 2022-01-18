package business.repository;

import business.domain.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private List<PersonEntity> persons;

    public PersonRepository() {
        persons = new ArrayList<>();
    }

    public List<PersonEntity> getAll(){
        return persons;
    }
    
    public PersonEntity getById(Long id){
        for(PersonEntity entity: persons){
            if(entity.getId().equals(id)){
                return entity;
            }
        }
        return null;
    }
    
    public PersonEntity create(PersonEntity entity){
        Long id = (long)(Math.random()*1000);
        entity.setId(id);
        persons.add(entity);
        return getById(id); /// what is this?
    }
    
    
    public PersonEntity update(PersonEntity entity){
        PersonEntity stored = getById(entity.getId());
        stored.setAge(entity.getAge());
        return stored;
    }
    
    public void delete(Long id){
        persons.remove(getById(id));
    }

}
