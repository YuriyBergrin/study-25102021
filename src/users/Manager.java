package users;

import interfaces.Manage;
import interfaces.Work;

public class Manager extends User implements Work,Manage {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void sayProfession() {
        System.out.println("Я манагер " + name +
                "\n моя зп " + salary);
    }
    @Override
    public void doWork(String task) {
        System.out.println(task);
    }
    @Override
    public void rest() {
        System.out.println("А я пошел домой.");
    }

    public void controlEmployee() {
        System.out.println("Всем работать");
    }
}
