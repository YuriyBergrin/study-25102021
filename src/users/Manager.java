package users;

import interfaces.Manage;
import interfaces.Work;

public class Manager extends User implements Work, Manage {
    public Manager (String name) {
        super(name);
    }
    @Override
    public void sayProfession() {
        System.out.println("Я менеджер " + name + " моя зп " + salary + " рублей.");

    }

    @Override
    public void doWork(String task) {
        System.out.println("Мне нужно " + task + ".");
    }

    @Override
    public void rest() {
        System.out.println("Отпуск провожу на Бали.");
    }

    @Override
    public void controlEmployee() {
        System.out.println("Сотрудники меня ценят.");
    }
}
