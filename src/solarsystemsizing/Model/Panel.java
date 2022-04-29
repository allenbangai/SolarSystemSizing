package solarsystemsizing.Model;

/**
 *
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Panel {
    private int power;
    private int voltage;
    private int nominalVoltage;

    public Panel(int power, int voltage, int nominalVoltage) {
        this.power = power;
        this.voltage = voltage;
        this.nominalVoltage = nominalVoltage;
    }

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