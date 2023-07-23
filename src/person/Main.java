package person;

import java.util.*;
import java.util.stream.Collectors;

import static person.Education.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    values()[new Random().nextInt(values().length)])
            );
            System.out.println(persons.stream()
                    .filter(x -> x.getAge() < 18)
                    .count());

            System.out.println(persons.stream()
                    .filter(x->x.getSex()==Sex.MAN && x.getSex()==Sex.WOMAN)
                    .filter(x-> x.getAge()>= 18)
                    .filter(x-> x.getAge()<= 65)
                    .map(Person::getFamily)
                    .collect(Collectors.toList()));

            System.out.println(persons.stream()
                    .filter(man->man.getSex()==Sex.MAN && man.getAge()<65 && man.getEducation()==Education.HIGHER ||
                    man.getSex()==Sex.WOMAN && man.getAge()>18 && man.getAge()<60 && man.getEducation()==Education.HIGHER)
                    .sorted(Comparator.comparing(Person::getFamily))
                    .collect(Collectors.toList()));
        }
    }
}
