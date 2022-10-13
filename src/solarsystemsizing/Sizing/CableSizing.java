package solarsystemsizing.Sizing;

import java.text.DecimalFormat;

import solarsystemsizing.Model.Cable;

/**
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 * @description
 * This class Battery.java describes the characteristics of a battery used in sizing 
 * solar systems... As we all know, a battery both has the Energy it stores in Ampere hour
 * (Ah) and the voltage at which it is either charged or discharged measured in volts (VDC).
 * This characteristics are used to describe an object of a battery so we could this class to 
 * describe different types of objects of batteries. This characteristics are {@link #voltage} 
 * and {@link #ampereHour}.
 */
public class CableSizing {
    private float batteryCableLength;
    private float panelCableleLength;
    private ChargeControllerSizing controllerSizing;
    private Cable cable;
    private static final double multiplier = 1000000;

    /**
     * @param batteryCableLength
     * @param panelCableleLength
     * @param controllerSizing
     */
    public CableSizing(float batteryCableLength, float panelCableleLength, ChargeControllerSizing controllerSizing, Cable cable) {
        this.batteryCableLength = batteryCableLength;
        this.panelCableleLength = panelCableleLength;
        this.controllerSizing = controllerSizing;
        this.cable = cable;
    }

    /**
     * 
     */
    public CableSizing() {
    }

    /**
     * @return the batteryCableLength
     */
    public float getBatteryCableLength() {
        return batteryCableLength;
    }
    
    /**
     * @return the panelCableleLength
     */
    public float getPanelCableleLength() {
        return panelCableleLength;
    }
    
    /**
     * @return the controllerSizing
     */
    public ChargeControllerSizing getControllerSizing() {
        return controllerSizing;
    }

    /**
     * @return the cable
     */
    public Cable getCable(){
        return cable;
    }

    /**
     * 
     * @return
     */
    public double getBatteryCrossArea(){
        return (multiplier * getCable().getResistivity() * controllerSizing.getBatteriesChargingCurrent() * getBatteryCableLength()) 
            / controllerSizing.getSystemDCVoltage();
    }

    /**
     * 
     * @return
     */
    public double getPanelCrossArea(){
        return (multiplier * getCable().getResistivity() * controllerSizing.getPanelSCCurrent() * getPanelCableleLength()) 
            / controllerSizing.getPanelOCVoltage();
    }

    /**
     * 
     * @return
     */
    public double getBatteryCableDiameter(){
        double val = ((4 * getBatteryCrossArea()) / 3.1416);
        return Math.pow(val, 0.5);
    }

    /**
     * 
     * @return
     */
    public double getPanelCableDiameter(){
        double val = ((4 * getPanelCrossArea()) / 3.1416);
        return Math.pow(val, 0.5);
    }

    /**
     * @return
     * The override {@link #toString()} return a string allowing you know everything you need to know about
     * the class CableSizing.java.
     */ 
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###");
        return "\nThe Cable Sizing parameters are calculated as follows {" +
            "\n The length of battery cable from ChargeController to Batteries and From Batteries to Inverter= '" + df.format(getBatteryCableLength()) + 
            "m',\n The diameter of battery cable= '" + df.format(getBatteryCableDiameter()) + 
            "mm',\n The cross sectional area of battery cable= '" + df.format(getBatteryCrossArea()) + 
            "mm2',\n The length of panels from panel array to chargeController= '" + df.format(getPanelCableleLength()) + 
            "m',\n The diameter of panel cable= '" + df.format(getPanelCableDiameter()) + 
            "mm',\n The cross sectional area of panel cables= '" + df.format(getPanelCrossArea()) + 
            "mm2'\n}";
    }
}
