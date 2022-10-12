package solarsystemsizing.Model;

/**
 * This class Cabel.java describes the characteristics of the different cables used in sizing 
 * PV systems... As we all know, cables can generally be characterise by their resistivity.
 * But using a cable in a pv system is the diameter of the cable and the type of material the cable 
 * is made of.
 * The characteristics used to discribe the object cable here are {@link #cableType} and {@link #resistivity}.
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Cable {
    private String cableType;
    private double resistivity;

    /**
     * The constructor of class Cable allows one to objects of type cable with the 
     * properties below
     * @param cableType
     * The {@link #cableType} entered here is of type String
     * 
     * @param resistivity
     */
    public Cable(String cableType, double resistivity) {
        this.cableType = cableType;
        this.resistivity = resistivity;
    }

    /**
     * @return String return the cableClass
     */
    public String getCableType() {
        return cableType;
    }

    /**
     * @return float return the resistivity
     */
    public double getResistivity() {
        return resistivity;
    }

}
