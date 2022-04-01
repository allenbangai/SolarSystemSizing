package solarsystemsizing.Model;

/**
 * This class ChargeController describes the characteristics of a Solar Charge Controller.
 * This characteristics describes the behavior of a charge controller an the way they 
 * behave. This characteristics are the input voltage, min an max current with the output
 * rate voltage.
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class ChargeController{
    private int minInputCurrent;
    private int maxInputCurrent;
    private int maxInputVoltage;
    private int ratedCurrent;
    private int maxInputPower;
    private int ratedVoltage;

    /**
     * This constructor represents the charateristics that the objects of the class 
     * will have when instantiated 
     * @param minInputCurrent
     * The minimum possible current the charge controller can take in other to function
     * properly. This current is entered in Ampere (A).
     * @param maxInputCurrent
     * The maximum possible curent the charge controller can take in other to function 
     * properly. This current is entered in Ampere (A).
     * @param maxInputVoltage
     * The {@link #maxInputVoltage} is the voltage solar panel supply should not exceed and 
     * must be below or the solar panel supply should not exceed. The value entered is in 
     * volts (VDC).
     * @param ratedVoltage
     * This is the output {@link #ratedVoltage} released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     */
    public ChargeController(int maxInputVoltage, int ratedVoltage) {
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage = ratedVoltage;
    }

    /**
     * 
     * @param maxInputVoltage
     * The {@link #maxInputVoltage} is the voltage solar panel supply should not exceed and 
     * must be below or the solar panel supply should not exceed. The value entered is in 
     * volts (VDC).
     * @param maxInputPower
     * There is a {@link #maxInputPower} that the charge controller can take from the array connections
     * of panels. Hence when selecting a charge controller, it should never be less than the total 
     * power of the panels. The value entered is in Watts (W).
     * @param ratedVoltage
     * This is the output {@link #ratedVoltage} released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     * @param ratedCurrent
     * This is the output {@link #ratedCurrent} the charge controller will send to the batteries 
     * when charging the batteries. This current can be calculated from the panels total power 
     * devided by system DC voltage. When making choice of inverter, you optained output current 
     * be closest as possible to this value. the value intered is in current (ADC).
     */
    public ChargeController(int maxInputVoltage, int maxInputPower, int ratedVoltage, int ratedCurrent){
        this.maxInputVoltage = maxInputVoltage;
        this.maxInputPower = maxInputPower;
        this.ratedVoltage = ratedVoltage;
        this.ratedCurrent = ratedCurrent;
    }

    /**
     * 
     * @param maxInputVoltage
     * The {@link #maxInputVoltage} is the voltage solar panel supply should not exceed and 
     * must be below or the solar panel supply should not exceed. The value entered is in 
     * volts (VDC).
     * @param ratedVoltage
     * This is the output {@link #ratedVoltage} released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     * @param ratedCurrent
     * This is the output {@link #ratedCurrent} the charge controller will send to the batteries 
     * when charging the batteries. This current can be calculated from the panels total power 
     * devided by system DC voltage. When making choice of inverter, you optained output current 
     * be closest as possible to this value 
     * 
     */
    public ChargeController(int maxInputVoltage, int ratedVoltage, int ratedCurrent){
        this.maxInputVoltage = maxInputVoltage;
        this.ratedVoltage = ratedVoltage;
        this.ratedCurrent = ratedCurrent;

    }

    /**
     * @return
     * It returns the particullar solar charge controller {@link #minInputCurrent} in DC.
     */
    public int getMinInputCurrent() {
        return minInputCurrent;
    }

    /**
     * @return
     * It returns the particullar solar charge controller {@link #maxInputCurrent} in DC.
     */
    public int getMaxInputCurrent() {
        return maxInputCurrent;
    }

    /**
     * @return
     * It returns the particullar solar charge controller {@link #maxInputVoltage} in DC which the
     * total solar panel open circuit conection wll supply.
     */
    public int getMaxInputVoltage() {
        return maxInputVoltage;
    }

    /**
     * 
     * This is the output rated voltage released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. 
     * @return
     * This method returns the output {@link #ratedVoltage} that the charge controller supplies to or 
     * rerceives from the batery.
     */
    public int getRatedVoltage() {
        return ratedVoltage;
    }
}