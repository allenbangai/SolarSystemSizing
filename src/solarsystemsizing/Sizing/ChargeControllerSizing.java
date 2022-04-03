package solarsystemsizing.Sizing;

import java.util.ArrayList;

import solarsystemsizing.Model.ChargeController;

/**
 * 
 * @since 1.0
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class ChargeControllerSizing {
    private int systemDCVoltage;
    private int panelOCVoltage;
    private int panelTotalPower;
    private int batteriesChargingCurrent;
    private ArrayList<ChargeController> chargeControllers;

    public ChargeControllerSizing(){

    }

    public ChargeControllerSizing(InverterSizing inverterSizing, PanelSizing panelSizing, ArrayList<ChargeController> chargeControllers) {
        this.systemDCVoltage = inverterSizing.getInverter().getDCinput();
        this.panelOCVoltage = panelSizing.getPanelConnection().getSeriesConnection() * panelSizing.getPanel().getNominalVoltage();
        this.panelTotalPower = panelSizing.getPanelNumber() * panelSizing.getPanel().getPower();
        this.batteriesChargingCurrent = this.panelTotalPower / this.systemDCVoltage;
        this.chargeControllers = chargeControllers;
    }
    
    /**
     * @return int return the systemDCVoltage
     */
    public int getSystemDCVoltage() {
        return systemDCVoltage;
    }

    /**
     * @return int return the panelOCVoltage
     */
    public int getPanelOCVoltage() {
        return panelOCVoltage;
    }

    /**
     * @return int return the panelTotalPower
     */
    public int getPanelTotalPower() {
        return panelTotalPower;
    }

    /**
     * @return int return the batteriesChargingCurrent
     */
    public int getBatteriesChargingCurrent() {
        return batteriesChargingCurrent;
    }

    /**
     * @return the chargeControllers
     */
    public ArrayList<ChargeController> getChargeControllers() {
        return chargeControllers;
    }

}
