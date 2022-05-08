package solarsystemsizing.Sizing;

import java.text.DecimalFormat;

import solarsystemsizing.Model.Cable;

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
     * (non-Javadoc)
     * @see java.lang.Object#toString()
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
