package demo;

import human.Man;
import human.Woman;
import scanner.ScanManager;

/**
 * Created by Anastasiya on 19.02.2017.
 */
public class Implementation {
    private static boolean gender;
    private static String name;
    private static String surname;
    private static float height;
    private static float weight;

    public static void implementation() {
        Man person1;
        Man person2;

        inputData();
        if (gender) person1 = new Man(gender, name, surname, height, weight);
        else person1 = new Woman(gender, name, surname, height, weight);

        inputData();
        if (gender) person2 = new Man(gender, name, surname, height, weight);
        else person2 = new Woman(gender, name, surname, height, weight);

        person1.haveRelationship(person2);
    }

    private static void inputData() {
        System.out.println("Введите признак пола (boolean, true - мужчина, false - женщина):");
        gender = ScanManager.consoleReadBoolean();

        System.out.println("Введите имя:");
        name = ScanManager.consoleReadString();

        System.out.println("Введите фамилию:");
        surname = ScanManager.consoleReadString();

        System.out.println("Введите рост:");
        height = ScanManager.consoleReadFloat();

        System.out.println("Введите вес:");
        weight = ScanManager.consoleReadFloat();
    }

    public static void outputData(Man child) {
        System.out.println("--------------Получился ребёнок-------------");
        System.out.println("Пол: " + child.isGender());
        System.out.println("Имя: " + child.getName());
        System.out.println("Фамилия: " + child.getSurname());
        System.out.println("Рост: " + child.getHeight());
        System.out.println("Вес: " + child.getWeight());
    }
}
