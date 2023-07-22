package ru.babushkina.week9.task1._main;

import ru.babushkina.week9.task1.model.Animal;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow", 1));
        animals.add(new Animal("pig", 2));
        animals.add(new Animal("cat", 3));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("duck", 5));
        animals.add(new Animal("tiger", 6));
        animals.add(new Animal("zebra", 7));
        animals.add(new Animal("elephant", 8));
        animals.add(new Animal("hippo", 9));
        animals.add(new Animal("horse", 10));

//        Optional<Animal> lion = animals.stream()
//                .filter(animal -> animal.getName().equalsIgnoreCase("lion"))
//                .findFirst();
//        if (lion.isPresent()) {
//            System.out.println("Возраст льва : " + lion.get().getAge());;
//        } else {
//            throw new IllegalArgumentException("Лев не найден");
//        }

//        animals.stream()
//                .sorted(Comparator.comparing(Animal::getAge))
//                .forEach(animal -> System.out.println("Имя: " + animal.getName() + ", возраст: " + animal.getAge()));
//    }

//        long count = animals.stream()
//                .filter(animal -> animal.getAge() > 4)
//                .count();
//        System.out.println("Животные, у которых возраст больше 4 лет: " + count);
//    }

        Map<String, Animal> animalMap = animals.stream()
                .collect(Collectors.toMap(Animal::getName, animal -> animal));
        animalMap.forEach((name, animal) -> System.out.println("Ключ: " + name + ", значение: " + animal.getAge()));
    }
















    //        String animalNames = animals.stream()
//                .map(Animal::getName)
//                .reduce((acc, name) -> acc + ", " + name)
//                .orElse("");
//        System.out.println("Названия животных: " + animalNames);
//
//    }
}