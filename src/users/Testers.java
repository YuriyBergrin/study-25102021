package users;

import interfaces.Work;

public class Testers extends User implements Work {
    public Testers(String name) {
        super(name);
    }

    @Override
    public void sayProfession() {
        System.out.println("Я тостер " + name +
                "\n моя зп " + salary);
    }
    @Override
    public void doWork(String task) {
        System.out.println("Женщина, у нас срочная задача! Не могли бы вы " + task);
    }
    @Override
    public void rest() {
        System.out.println("Ай, не хочу работать");
    }
}
