import ar.com.ada.opp.StarFighter.XWingStarfighter;

public class App {
    public static void main(String[] args) {
        //sobrecarga de constructores
        XWingStarfighter ship1 = new XWingStarfighter();
        ship1.model = "T-65";
        ship1.maxAcceleration = 16;

       XWingStarfighter ship2 = new XWingStarfighter("T-65B");

        XWingStarfighter ship3 = new XWingStarfighter("T-65C",24);

        //sobrecarga de metodos
        ship1.openFire();
        ship1.openFire(false);
        ship1.openFire(true);
        ship2.openFire(true);
        ship2.openFire(true);
        ship3.openFire();
        System.out.println("ship3 :: " +ship3.getMaxAcceleration());
    }
}
