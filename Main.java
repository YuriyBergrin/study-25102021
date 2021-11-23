import users.Cleaner;
import users.Manager;
import users.Tester;

public class Main {
    public static void main(String[] args)  {
        Cleaner cleaner = new Cleaner("Гузелька");
        cleaner.setSalary(500);
        cleaner.hello();
        cleaner.sayProfession();
        cleaner.doWork("Пофиксить баги");
        cleaner.rest();
        System.out.println("\n");

        Tester tester = new Tester("Иванушка");
        tester.setSalary(1000);
        tester.hello();
        tester.sayProfession();
        tester.doWork("Да, целый день.");
        tester.rest();
        System.out.println("\n");

        Manager manager = new Manager("Паша");
        manager.setSalary(1500);
        manager.hello();
        manager.sayProfession();
        manager.doWork("Нужно уже к вчера.");
        manager.controlEmployee();
        manager.rest();
    }
}
