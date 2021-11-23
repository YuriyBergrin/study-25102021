package users;

import interfaces.Manage;
import interfaces.Work;

public class Manager extends User implements Manage, Work {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void sayProfession() {
        System.out.println("и я менеджер. Получаю " + salary + ".");
    }

    @Override
    public void doWork(String task) {
        System.out.println("Когда будет готово? " + task);
    }

    @Override
    public void rest() {
        System.out.println("Отдыхаю на чиле, на расслабоне");
    }

    @Override
    public void controlEmployee() {
        System.out.println("Делай быстрее.");

    }
}
