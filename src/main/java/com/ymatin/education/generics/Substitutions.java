package com.ymatin.education.generics;

public class Substitutions {
    public static<T extends Employee> String getName(T employee){
        return employee.getName();
    }

    private static void getBiggestAndSmallestBonus(Manager[] managers, Pair<? super Manager> pair){
        Manager min = managers[0];
        Manager max = managers[0];
        for(Manager m : managers){
            if (m.getSalary() > max.getSalary()) { max = m; }
            if (m.getSalary() < min.getSalary()) { min = m; }
        }
        pair.setFirst(max);
        pair.setSecond(min);
//         Manager first = pair.getFirst(); // при использовании в маске оператора super значение можно привести только к Object
    }

    private static void get(Pair<Employee> pair){
        Employee first = pair.getFirst();
        System.out.println(first);
    }

    private static Manager method(Pair<? extends Manager> value){
//       value.setSecond(new ExperiencedManager("a",1, 12)); // при использовании в маске оператора extends вообще ничего нельзя положить =)
        return value.getFirst();
    }

    public static void main(String[] args) {
        Pair<Employee> employeePair = new Pair<>();
        Pair<Manager> managerPair = new Pair<>();
        employeePair.setFirst(new Manager("S", 2));
        managerPair.setFirst(new Manager("S", 2));

        Manager[] arr = new Manager[]{
                new Manager("A", 100),
                new Manager("B", 200),
                new Manager("C", 300)
        };
        getBiggestAndSmallestBonus(arr, employeePair);
//        System.out.println(employeePair);


        get(employeePair); // Можно
//        get(managerPair); // Нельзя
    }
}
