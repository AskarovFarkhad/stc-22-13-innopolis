package oldVersion.after;

public class Engine {

    private int powerEngine;
    private double vEngine;
    private String brandEngine;

    public Engine(int powerEngine, double vEngine, String brandEngine) {
        this.powerEngine = powerEngine;
        this.vEngine = vEngine;
        this.brandEngine = brandEngine;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public double getvEngine() {
        return vEngine;
    }

    public void setvEngine(double vEngine) {
        this.vEngine = vEngine;
    }

    public String getBrandEngine() {
        return brandEngine;
    }

    public void setBrandEngine(String brandEngine) {
        this.brandEngine = brandEngine;
    }
}
