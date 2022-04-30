package solarsystemsizing.Model;

public class Cable {
    private String cableClass;
    private float resistivity;

    public Cable(String cableClass, float resistivity) {
        this.cableClass = cableClass;
        this.resistivity = resistivity;
    }

    /**
     * @return String return the cableClass
     */
    public String getCableClass() {
        return cableClass;
    }

    /**
     * @return float return the resistivity
     */
    public float getResistivity() {
        return resistivity;
    }

}
