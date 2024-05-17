package com.bcs.todolist.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable("id") Integer id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public void savePerson(@RequestBody Person person) {
        personService.savePerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") Integer id) {
        personService.deletePerson(id);
    }
}
