package cz.pkg.optional;

import cz.pkg.streams.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticalOptional {

    private List<Person> allPersons;

    public PracticalOptional() {
        this.allPersons = new LinkedList<>();
    }

    private void initAllPersons() {
        this.allPersons.add(new Person("tom", 123));
        this.allPersons.add(new Person("smonty", -13));
        this.allPersons.add(new Person("bob", 33));
    }

    public List<Person> findPersonsByAge(List<Person> persons, int age) {
        return persons
                .stream()
                .filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
    }

}
