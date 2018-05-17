package cz.pkg.optional;

import cz.pkg.streams.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
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

    public List<Person> findPersonsByAge(int age) {
        return this.allPersons
                .stream()
                .filter(person -> person.getAge() == age)
                .collect(Collectors.toList());
    }

    public String findPersonNameByAge(int age) {
        Optional<Person> person = this.allPersons
                .stream()
                .filter(it -> it.getAge() == age)
                .findFirst();

        // ne moc dobre
        // return person.isPresent() ? person.get().getName() : null;

        // lepsi, idealni je uz jen findPersonNameByAge2
        return person.map(Person::getName).orElse("");
    }

    public String findPersonNameByAge2(int age) {
        return this.allPersons
                .stream()
                .filter(it -> it.getAge() == age)
                .findFirst()
                .map(Person::getName)
                .orElse("");
    }

}
