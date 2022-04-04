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
    private int minInputCurrent = 0;
    private int maxInputCurrent = 0;
    private int maxInputVoltage = 0;
    private int ratedChargeCurrent = 0;
    private int ratedChargeVoltage = 0;
    private int ratedChargePower = 0;

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
     * This is the output {@link #ratedChargeVoltage} released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     * @param ratedCurrent
     * This is the output {@link #ratedChargeCurrent} the charge controller will send to the batteries 
     * when charging the batteries. This current can be calculated from the panels total power 
     * devided by system DC voltage. When making choice of inverter, you optained output current 
     * be closest as possible to this value. the value intered is in current (ADC).
     */
    public ChargeController(int maxInputVoltage, int ratedVoltage, int ratedCurrent, int maxInputCurrent, int minInputCurrent) {
        this.maxInputVoltage = maxInputVoltage;
        this.ratedChargeVoltage = ratedVoltage;
        this.maxInputCurrent = maxInputCurrent;
        this.minInputCurrent = minInputCurrent;
        this.ratedChargeCurrent = ratedCurrent;
    }

    /**
     * 
     * @param maxInputVoltage
     * The {@link #maxInputVoltage} is the voltage solar panel supply should not exceed and 
     * must be below or the solar panel supply should not exceed. The value entered is in 
     * volts (VDC).
     * @param ratedChargePower
     * There is a {@link #ratedChargePower} that the charge controller can take from the array connections
     * of panels. Hence when selecting a charge controller, it should never be less than the total 
     * power of the panels. The value entered is in Watts (W).
     * @param ratedVoltage
     * This is the output {@link #ratedChargeVoltage} released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     * @param ratedCurrent
     * This is the output {@link #ratedChargeCurrent} the charge controller will send to the batteries 
     * when charging the batteries. This current can be calculated from the panels total power 
     * devided by system DC voltage. When making choice of inverter, you optained output current 
     * be closest as possible to this value. the value intered is in current (ADC).
     */
    public ChargeController(int ratedVoltage, int ratedCurrent, int maxInputVoltage, int ratedChargePower){
        this.maxInputVoltage = maxInputVoltage;
        this.ratedChargePower = ratedChargePower;
        this.ratedChargeVoltage = ratedVoltage;
        this.ratedChargeCurrent = ratedCurrent;
    }

    /**
     * 
     * @param maxInputVoltage
     * The {@link #maxInputVoltage} is the voltage solar panel supply should not exceed and 
     * must be below or the solar panel supply should not exceed. The value entered is in 
     * volts (VDC).
     * @param ratedVoltage
     * This is the output {@link #ratedChargeVoltage} released to the batteries in other to charge the 
     * battery. For certain cases, the controller can have somany different types of rated 
     * output voltage eiher due to differnt number of output ports or can varry automatically 
     * as it adapts to the receiving voltage of the battery. In this case, we use different 
     * contructors for describing the same obects with differnt rated output voltage. The 
     * value entered is in volts (VDC)
     * @param ratedCurrent
     * This is the output {@link #ratedChargeCurrent} the charge controller will send to the batteries 
     * when charging the batteries. This current can be calculated from the panels total power 
     * devided by system DC voltage. When making choice of inverter, you optained output current 
     * be closest as possible to this value 
     * 
     */
    public ChargeController(int ratedVoltage, int ratedCurrent, int maxInputVoltage){
        this.maxInputVoltage = maxInputVoltage;
        this.ratedChargeVoltage = ratedVoltage;
        this.ratedChargeCurrent = ratedCurrent;

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
     * This method returns the output {@link #ratedChargeVoltage} that the charge controller supplies to or 
     * rerceives from the batery.
     */
    public int getRatedChargeVoltage() {
        return ratedChargeVoltage;
    }

    /**
     * @return int return the ratedChargeCurrent
     */
    public int getRatedChargeCurrent() {
        return ratedChargeCurrent;
    }

    /**
     * @return int return the ratedChargePower
     */
    public int getRatedChargePower() {
        return ratedChargePower;
    }

}