package cz.pkg.fnc_style;

import cz.pkg.streams.Person;

import java.util.Optional;

public class UseControlFlow {

    public UseControlFlow() {
        ControlFlow.tryInvoke(() -> getPerson())
                .map(person -> incrementYear(person))
                .map(person -> {
                    System.out.println(person);
                    return person;
                })
                .orElseGet(() -> {
                    System.out.println("nic");
                    return new Person();
                });
    }

    public Person incrementYear(Person person) {
        Person p = person;
        p.setAge(p.getAge() + 1);

        return p;
    }

    public Person getPerson() {
        return new Person("smonty", 100);
    }

    public Person getNullPerson() {
        return null;
    }

}
