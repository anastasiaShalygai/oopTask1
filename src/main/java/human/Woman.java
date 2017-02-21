package human;

import demo.Implementation;
import scanner.ScanManager;

/**
 * Created by Anastasiya on 19.02.2017.
 */
public class Woman extends Man {
    public Woman(boolean gender, String name, String surname, float height, float weight) {
        super(gender, name, surname, height, weight);
    }

    void humanBirth(Man man) {
        boolean gender;
        String name;
        String surname;
        float height;
        float heightWoman = this.getHeight();
        float weightWoman = this.getWeight();
        float weight;

        //Static method call via class object
        gender = man.getProbability(50);

        System.out.printf("Введите имя для ребёнка(пол = %b): ", gender);
        name = ScanManager.consoleReadString();

        surname = man.getSurname();

        if (gender) {
            height = (float) (man.getHeight() + (0.1 * (heightWoman - man.getHeight())));
            weight = (float) (man.getWeight() + (0.1 * (weightWoman - man.getWeight())));
            Man child = new Man(gender, name, surname, height, weight);
            Implementation.outputData(child);
        } else {
            height = (float) (heightWoman + (0.1 * (man.getHeight() - heightWoman)));
            weight = (float) (weightWoman + (0.1 * (man.getWeight() - weightWoman)));
            Man child = new Man(gender, name, surname, height, weight);
            //Why are you calling method from implementation class?
            Implementation.outputData(child);
        }
    }
}
