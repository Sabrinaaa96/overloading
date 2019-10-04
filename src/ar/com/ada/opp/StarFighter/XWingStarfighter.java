package ar.com.ada.opp.StarFighter;

public class XWingStarfighter {
    public String model;
    public Integer maxAcceleration;

    public XWingStarfighter() {
    }
    public XWingStarfighter( String model) {
        this.model = model;
    }
    public XWingStarfighter( String model, Integer maxAcceleration) {
        this.model = model;
        this.maxAcceleration = maxAcceleration;
    }

    public void openFire () {
        System.out.println("X-Wing Starfighter [" + model +" ] :: PEW!!");
    }
    public void openFire (Boolean isMissile) {
        // isMissile == true => false
        // isMissile == false => true
        if (!isMissile) {
        return;
    }
        System.out.println("X-Wing Starfighter [" + model + " ] :: Wooosh_ Ka-Pow!!");
    }
    public Integer getMaxAcceleration () {
        return this.maxAcceleration;
    }
}
