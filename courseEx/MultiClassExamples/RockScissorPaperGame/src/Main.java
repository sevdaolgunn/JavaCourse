public class Main {
    public static void main(String[] args) {

        Gamer gamer1 = new Gamer("Ali");
        Gamer gamer2 = new Gamer("Ayşe");

        Arena arena = new Arena(gamer1, gamer2);
    }
}