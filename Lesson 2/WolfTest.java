public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "man";
        wolfOne.nickname = "Gocha";
        wolfOne.weight = 59;
        wolfOne.age = 3;
        wolfOne.color = "Grey";

        System.out.println("Мы создали волка по имени " + wolfOne.nickname + ", его цвет: " + wolfOne.color + ", а весит он: " + wolfOne.weight + " кг." );

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();

    }
}