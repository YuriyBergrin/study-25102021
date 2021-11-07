package animals;

public class Cat extends Animal {

    @Override
    public void setAge(int age) {
        super.setAge(age);
        if (age > 0 && age <= 20) {
            this.age = age;
        } else {
            System.out.println("Задан некорректный возраст\n");
            this.age = 0;
        }
    }
}

