package com.bcs.todolist.person;

import com.bcs.todolist.common.FileProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PersonService {
    private final static String DATA_FILE_NAME = "person.json";
    private FileProcessor fileProcessor;

    @Autowired
    public PersonService(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public List<Person> getAllPersons() {
        return fileProcessor.readAsList(PersonService.DATA_FILE_NAME, Person[].class);
    }

    public Person getPersonById(Integer id) {
        List<Person> persons = getAllPersons();

        for (Person person : persons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void savePerson(Person person) {
        List<Person> persons = getAllPersons();

        persons.add(person);

        fileProcessor.update(PersonService.DATA_FILE_NAME, persons);
    }

    public void deletePerson(Integer id) {
        List<Person> persons = getAllPersons();

        for (Person person : persons) {
            if (person.getId().equals(id)) {
                persons.remove(person);
                break;
            }
        }

        fileProcessor.update(PersonService.DATA_FILE_NAME, persons);
    }
}
