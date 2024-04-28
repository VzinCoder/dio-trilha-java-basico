package br.org.vzincoder.service;

import javax.naming.LimitExceededException;

import br.org.vzincoder.exception.NoPeopleRegisteredException;
import br.org.vzincoder.exception.PersonAlreadyRegisteredException;
import br.org.vzincoder.exception.PersonNotFoundException;
import br.org.vzincoder.model.Person;
import br.org.vzincoder.repository.PersonRepository;

public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void addPerson(Person person) throws LimitExceededException,PersonAlreadyRegisteredException {
        personRepository.addPerson(person);
    }

    public Person[] getPeople() throws NoPeopleRegisteredException {
        return personRepository.getPeople();
    }

    public Person findPerson(String cod) throws PersonNotFoundException {
        return personRepository.findPerson(cod);
    }

    public void alterPerson(Person person) throws PersonNotFoundException, NoPeopleRegisteredException {
        personRepository.alterPerson(person);
    }

    public void deletePerson(String cod) throws NoPeopleRegisteredException, PersonNotFoundException {
        personRepository.deletePerson(cod);
    }

    public boolean isPersonRegistered(String cod) {
        try {
            personRepository.findPerson(cod);
            return true;
        } catch (PersonNotFoundException e) {
            return false;
        }
    }
}
