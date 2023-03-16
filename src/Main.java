import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Nodes.collect;

class Main {
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
                    Education.values()[new Random().nextInt(Education.values().length)])
            );
        }
        persons.stream()
                .filter(x -> x.getAge() < 18)
                .count();
        List<String> Army = Arrays.stream(persons)
                .filter(x -> x.sex == Sex.Sex.MAN)
                .filter(y -> 27 >= y.getAge() >= 18)
                .map(Person:getFamily())
      .collect(Collectors.toList());
        List<String> Work = Arrays.stream(persons)
                .filter(x -> x.education == HIGHER)
                .filter( for (y -> y.sex == Sex.Sex.MAN) z -> 65 >= z.getAge() >= 18 && for (a -> a.sex == Sex.Sex.WOMAN)
            b -> 60 >= b.getAge() >= 18
                    .sorted(Comparator.naturalOrder(Person:getFamily()))
      .collect(Collectors.toList());
    }
}