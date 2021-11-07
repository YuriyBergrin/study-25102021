package animals;

public class Human extends Animal {
    private boolean vegan;

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    @Override
    public boolean isVegan() {
        return vegan;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
        if (age > 0 && age <= 99) {
            this.age = age;
        } else {
            System.out.println("Задан некорректный возраст\n");
            this.age = 0;
        }
    }

}



