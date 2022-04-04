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

    public ChargeController getChargeController(){
        ArrayList<ChargeController> actualControllers = new ArrayList<>();
        ChargeController actualController = new ChargeController(0, 0, 0, 0);

        //filtering controllers from list of controllers by system voltage
        for (ChargeController chargeController : getChargeControllers()) {
            if(getSystemDCVoltage() == chargeController.getRatedChargeVoltage() && 
            getBatteriesChargingCurrent() < chargeController.getRatedChargeCurrent() && 
            getPanelOCVoltage() < chargeController.getMaxInputVoltage() && getPanelTotalPower() < chargeController.getRatedChargePower() ){
                actualControllers.add(chargeController);
            }
        }

        if (actualControllers.size() > 1) {
            int i = 0;
            int diff = 0;
            int init;
            for (ChargeController chargeController : getChargeControllers()) {
                init = chargeController.getRatedChargePower() - getPanelTotalPower();
                if(i == 0){
                    diff = init;
                }
                i++;
                if(diff >= init){
                    actualController = chargeController;
                }
            }
        } else {
            actualController = actualControllers.get(0);
        }
        return actualController;
        //implementing code in ChargeController.java part 4: declaring and implementing getChargeControlloer() method part 1
    }

}
