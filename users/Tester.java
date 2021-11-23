package users;

import interfaces.Work;

public class Tester extends User implements Work{

    public Tester(String name) {
        super(name);
    }

    @Override
    public void sayProfession() {
        System.out.println("и я тестировщик. Получаю " + salary + ".");
    }

    @Override
    public void doWork(String task) {
        System.out.println("Я подбирал тестовые данные. " + task);
    }

    @Override
    public void rest() {
        System.out.println("В свободное время я сплю.");
    }
}
