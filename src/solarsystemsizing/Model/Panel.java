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
     * This method returns the power of the panel with type int
     * @return {@link #power}
     */
    public int getPower() {
        return power;
    }

    /**
     * This method returns the voltage of the panel with type int
     * @return {@link #voltage}
     */
    public int getVoltage() {
        return voltage;
    }

    /**
     * This method returns the nominal voltage different of the voltage of 
     * the panel and of type type int
     * @return {@link #voltage}
     */
    public int getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * This method returns the nominal current of the panel with type int
     * @return {@link #getPower()} / {@link #getNominalVoltage()}
     */
    public int getNominalCurent(){
        return getPower() / getNominalVoltage();
    }
}