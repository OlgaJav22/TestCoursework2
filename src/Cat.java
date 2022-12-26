import java.awt.*;

public class Cat {

    private String name;
    private int age;
    boolean iSPlay;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void play() {
        System.out.println("Хочу играть!");
        this.iSPlay = true;
    }
    public void talk() throws CantMyException {
        System.out.println("Мяу");
        if (iSPlay) {
            System.out.println("Котик " + name + " хочет поиграть");
        } else {
            throw new CantMyException(name + "- не готов играть");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPlay() {
        return true;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                                '}';
    }
}
