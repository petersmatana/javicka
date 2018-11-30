package original_tutorial.lambda.criteria;

import original_tutorial.lambda.Person;

import java.time.LocalDate;

public class MaleOlderThan implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getBirthday().isAfter(LocalDate.of(2000, 1, 1)) &&
                person.getGender() == Person.Sex.MALE;
    }

}
