package solarsystemsizing.Model;

public class Cable {
    private String cableName;
    private double resistivity;

    public Cable(String cableName, double resistivity) {
        this.cableName = cableName;
        this.resistivity = resistivity;
    }

    /**
     * @return String return the cableClass
     */
    public String getCableName() {
        return cableName;
    }

    /**
     * @return float return the resistivity
     */
    public double getResistivity() {
        return resistivity;
    }

}
