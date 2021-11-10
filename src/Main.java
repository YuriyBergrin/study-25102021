import users.Cleaner;
import users.Doctor;
import users.Manager;
import users.Tester;

public class Main {
    public static void main(String[] args)  {
        Cleaner cleaner = new Cleaner("Гузелька");
        cleaner.setSalary(500);
        cleaner.hello();
        cleaner.doWork("Пофиксить баги");
        cleaner.rest();

        Tester tester = new Tester("Василий");
        System.out.println();
        tester.setSalary(300);
        tester.sayProfession();
        tester.doWork("искать баги");
        tester.rest();

        Manager manager = new Manager("Анатолий");
        System.out.println();
        manager.setSalary(3000);
        manager.sayProfession();
        manager.doWork("управлять сотрудниками");
        manager.rest();
        manager.controlEmployee();

        Doctor doctor = new Doctor("Петр");
        System.out.println();
        doctor.setSalary(500);
        doctor.sayProfession();
        doctor.doWork("лечить людей");
        doctor.rest();
        doctor.doCharityWork("приюты для животных");
        doctor.benefits();


    }

}
