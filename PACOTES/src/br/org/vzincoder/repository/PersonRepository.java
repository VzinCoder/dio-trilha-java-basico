package br.org.vzincoder.repository;

import javax.naming.LimitExceededException;

import br.org.vzincoder.exception.NoPeopleRegisteredException;
import br.org.vzincoder.exception.PersonAlreadyRegisteredException;
import br.org.vzincoder.exception.PersonNotFoundException;
import br.org.vzincoder.model.Person;

public class PersonRepository {
    final int MAX_PEOPLE = 10;
    Person people[] = new Person[MAX_PEOPLE];
    int count = 0;

    public void addPerson(Person person) throws LimitExceededException, PersonAlreadyRegisteredException {

        if (count == MAX_PEOPLE) {
            throw new LimitExceededException();
        }

        try {
            findPerson(person.cod);
            throw new PersonAlreadyRegisteredException();
        } catch (PersonNotFoundException e) {
            people[count] = person;
            count++;
        }

    }

    public Person[] getPeople() throws NoPeopleRegisteredException {
        if (count == 0) {
            throw new NoPeopleRegisteredException();
        }

        Person peopleRegistered[] = new Person[count];
        for (int i = 0; i < count; i++) {
            peopleRegistered[i] = people[i];
        }

        return peopleRegistered;
    }

    public Person findPerson(String cod) throws PersonNotFoundException {
        for (int i=0;i<count;i++) {
            if (people[i].cod.equals(cod)) {
                return people[i];
            }
        }

        throw new PersonNotFoundException();
    }

    public void alterPerson(Person person) throws PersonNotFoundException, NoPeopleRegisteredException {
        boolean personFound = false;

        if (count == 0) {
            throw new NoPeopleRegisteredException();
        }

        for (int i = 0; i < count; i++) {
            if (people[i].cod.equals(person.cod)) {
                people[i] = person;
                personFound = true;
                break;
            }
        }

        if (!personFound) {
            throw new PersonNotFoundException();
        }
    }

    public void deletePerson(String cod) throws NoPeopleRegisteredException, PersonNotFoundException {

        if (count == 0) {
            throw new NoPeopleRegisteredException();
        }

        int indexPersonFound = -1;
        for (int i = 0; i < count; i++) {
            if (people[i].cod.equals(cod)) {
                indexPersonFound = i;
                break;
            }
        }

        if (indexPersonFound != -1) {
            for (int i = indexPersonFound; i < count - 1; i++) {
                people[i] = people[i + 1];
            }
            people[count] = null;
            count--;
        } else {
            throw new PersonNotFoundException();
        }

    }

}
