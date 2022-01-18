package service.mapper;

import business.domain.PersonEntity;
import service.dto.Person;

public class PersonMapper {

    public Person toDTO(PersonEntity entity){
        if(entity == null){
            return null;
        }
        Person dto = new Person();
        dto.setId(Long.toString(entity.getId()));
        dto.setAge(Integer.toString(entity.getAge()));
//        dto.setAge(""+entity.getAge());
        dto.setName(entity.getName());
        return dto;
    }

    public PersonEntity toEntity(Person dto){
        if(dto == null){
            return null;
        }
        PersonEntity entity = new PersonEntity();
        entity.setAge(Integer.parseInt(dto.getAge()));
        //entity.setId(Long.parseLong(dto.getId()));
        entity.setName(dto.getName());
        return entity;
    }
}
