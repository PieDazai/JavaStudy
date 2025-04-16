package HomeWork.HomeWork26;

import java.util.*;
import java.util.stream.Collectors;

public class MainHw26 {
    public static void main(String[] args) {
        // todo Task1
        Set<Set<String>> sets = new HashSet<>();
        Set<String> strings = new HashSet<>();
        strings.add("раз");
        strings.add("два");
        strings.add("три");
        Set<String> strings2 = new HashSet<>();
        strings2.add("Первое");
        strings2.add("Второе");
        strings2.add("Семьдесят шестое");
        Set<String> strings3 = new HashSet<>();
        strings3.add("12");
        strings3.add("783");
        strings3.add("37288736");
        Set<String> strings4 = new HashSet<>();
        strings4.add("Проверка");
        strings4.add("Струн");
        strings4.add("Раз-Два");

        sets.add(strings);
        sets.add(strings2);
        sets.add(strings3);
        sets.add(strings4);

        int allCountLaters = sets.stream().flatMap(f -> f.stream()).mapToInt(f -> f.length()).sum();
        System.out.println(allCountLaters);

        OptionalInt maxWord = sets.stream().flatMap(f -> f.stream()).mapToInt(f -> f.length()).max();
        System.out.println(maxWord.getAsInt());


        //Task2
        List<Employee> employees = EmployeeFactory.createEmployee();
        //todo решения дз 2 тут
        Employee maxKPI = employees.stream().max(Comparator.comparing(Employee::getKpi)).get();
        System.out.println(maxKPI);

        Employee maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(maxSalary);

        Employee noRus = employees.stream().filter(f -> f.getName().matches("\\w+")).findFirst().get();
        System.out.println(noRus);

        Employee oldest = employees.stream().filter(f -> f.getAge() > 65).findFirst().get();
        System.out.println(oldest);

        System.out.println("Average");
        double averageKPI = employees.stream().mapToInt(f -> f.getKpi()).average().getAsDouble();
        employees.stream().filter(f -> f.getKpi() > averageKPI).forEach(System.out::println);

        double averageKPIRus = employees.stream().filter(f -> f.getName().matches("[А-я]+")).
                filter(f -> f.getAge() < 45).
                filter(f -> f.getSalary() > 20000).
                mapToInt(Employee::getKpi).average().orElse(0);
        System.out.println(averageKPIRus);

        // todo task 3

        Map<String, Employee> employeeMap  = employees.stream().
                filter(f -> f.getAge() < 35 && f.getSalary() > 10000).
                collect(Collectors.toMap(e -> e.getName() + " " + e.getSurname(), e -> e));


        System.out.println("MAP");
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}