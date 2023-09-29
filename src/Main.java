// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new Medic();

        Hero[] heroes ={ magic,medic,warrior };
        String[] superAbility = {" Stone hail", " Healing by area", " Shock Amplification"};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(superAbility[i]);
        }

    }
}