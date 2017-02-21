package human;

import java.util.Random;

/**
 * Created by Anastasiya on 19.02.2017.
 */
public class Man {
    private boolean gender;
    private String name;
    private String surname;
    private float height;
    private float weight;

    public Man(boolean gender, String name, String surname, float height, float weight) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    private boolean speak(boolean gender2) {
        if ((gender) && (gender2))
            return getProbability(50);
        else
            return true;
    }

    static boolean getProbability(double percent) {
        Random r = new Random();

        double total = percent + (100 - percent);
        double random = r.nextDouble() * total;
        return random < percent;
    }

    private boolean tolerateSociety(boolean gender2) {
        if ((!gender) && (!gender2))
            return getProbability(5);
        else if (((gender) && (!gender2)) || ((!gender) && (gender2)))
            return getProbability(70);
        else if ((gender) && (gender2))
            return getProbability(5.6);
        else return false;
    }

    private boolean spendTimeTogether(float height2) {
        float percentHeight;
        //with braces it would be more readable
        if (height > height2) percentHeight = (height2 * 100) / height;
        else percentHeight = (height * 100) / height2;

        if (percentHeight > 90) return getProbability(95);
        else return getProbability(85);
    }

    public void haveRelationship(Man person2) {
        if (speak(person2.gender)) {
            System.out.println("тест Говорить пройден успешно!");
            if (tolerateSociety(person2.gender)) {
                System.out.println("тест Терпеть/выдерживать общество пройден успешно!");
                if (spendTimeTogether(person2.height)) {
                    System.out.println("тест Проводить время вместе пройден успешно!");
                    if (person2.gender != gender) {
                        Woman woman;
                        if (!person2.gender) {
                            woman = (Woman) person2;
                            woman.humanBirth(this);
                        } else {
                            woman = (Woman) this;
                            woman.humanBirth(person2);
                        }
                    } else
                        System.out.println("ничего не вышло... разбежались");
                } else
                    System.out.println("тест Проводить время вместе не пройден! \n ничего не вышло... разбежались");

            } else
                System.out.println("тест Терпеть/выдерживать общество не пройден! \n ничего не вышло... разбежались");
        } else
            System.out.println("тест Говорить не пройден \n ничего не вышло... разбежались");
    }

    public void haveRelationship1(Man person2) {
        if (speak(person2.gender) && tolerateSociety(person2.gender) && spendTimeTogether(person2.height)) {
            System.out.println("тесты Терпеть/выдерживать общество, Проводить время вместе и Говорить пройдены успешно!");
            if (person2.gender != gender) {
                Woman woman;
                if (!person2.gender) {
                    woman = (Woman) person2;
                    woman.humanBirth(this);
                } else {
                    woman = (Woman) this;
                    woman.humanBirth(person2);
                }
            } else
                System.out.println("ничего не вышло... разбежались");
        } else
            System.out.println("тесты Терпеть/выдерживать общество, Проводить время вместе, Говорить не пройдены\n ничего не вышло... разбежались");
    }
}
