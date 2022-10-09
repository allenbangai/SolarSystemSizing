package solarsystemsizing.Model;

/**
 * 
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 * 
 * @Description
 * This class the properties of a solar panel and can be use to implement a a multitude of
 * solar panels.
 */
public class Panel {
    private int power;
    private int voltage;
    private int nominalVoltage;

    /**
     * @Description
     * This constructor for the panel class helps u intantiates a panel object
     * with the following properties
     * @param power {@link #power}
     * @param voltage {@link #voltage}
     * @param nominalVoltage {@link #nominalVoltage}
     */
    public Panel(int power, int voltage, int nominalVoltage) {
        this.power = power;
        this.voltage = voltage;
        this.nominalVoltage = nominalVoltage;
    }

    /**
     * 
     * @return
     */
    public int getPower() {
        return power;
    }

    public int getVoltage() {
        return voltage;
    }

    public int getNominalVoltage() {
        return nominalVoltage;
    }

    public int getNominalCurent(){
        return getPower() / getNominalVoltage();
    }

    //TODO 4: Document code in this class Panel.java
}