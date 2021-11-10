package users;

import interfaces.Work;

public class Tester extends User implements Work {
    public Tester(String name) {
        super(name);
    }

    @Override
    public void sayProfession() {
        System.out.println("Я тестировщик " + name + ", моя зп " + salary + " рублей.");

    }

    @Override
    public void doWork(String task) {
        System.out.println("Моя задача - " + task + ".");
    }

    @Override
    public void rest() {
        System.out.println("В свободное я читаю книги.");
    }
}
