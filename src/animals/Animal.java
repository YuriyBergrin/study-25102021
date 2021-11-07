package animals;

//родительский класс для всех животных
public class Animal {

    //поля скрытые от прямого изменения модификатором private
    private String name;//имя животного
    protected int age;//возраст животного
    public int pawQuantity = 4;//кол-во лап (тут нужно кое-что изменить)

    //далее идут типичные методы, которые позволяют инкапсулировать (защитить, скрыть некоторые поля)

    //получить имя
    public String getName() {
        return name;
    }

    //задать имя
    public void setName(String name) {
        this.name = name;//ключевое слово this здесь используется чтобы вы понимали, что this.name это поле name в классе животное,
        //т.е. имя нашего животного, а name без this это имя параметра
        //т.о. имя нашего животного становится равным значению параметра name
    }

    //получить возраст
    public int getAge() {
        return age;
    }

    //задать возраст и проверить не является ли он отрицательным, т.е. если пользователь попытается задать отрицательный возраст,
    //у него не получится это сделать и возраст будет равен нулю
    public void setAge(int age) {
        if (age > 0 && age < 21) {
            this.age = age;
        } else {
            System.out.println("Задан некорректный возраст\n");
            this.age = 0;
        }
    }

    //является ли животное травоядным? (true - является, false - не является)
    public boolean isVegan() {
        return false;
    }
    //можно было бы сделать метод абстрактным, но об этом на другом занятии поговорим


}


