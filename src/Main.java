public class Main {
    public static void main(String[] args) throws CantMyException {

//метод возвечения часла в квадрат

        int a = 5;
        int d = 2;
        System.out.println("Число 5 в квадрате равно " + Math.pow(a, d));

        Cat barsik = new Cat("Барсик", 2);
        Cat murzic = new Cat("Мурзик", 4);
        barsik.isPlay();


        murzic.play();
        try {
            murzic.talk();
            barsik.talk();
        } catch (CantMyException e) {
            System.out.println(e.getMessage());
        }

    }
}