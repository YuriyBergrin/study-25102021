package animals;

public class Cow extends Animal {
    @Override
    public boolean isVegan() {
        return true;
    }

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
