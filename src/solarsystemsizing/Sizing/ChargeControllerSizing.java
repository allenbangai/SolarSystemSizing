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
    private int panelSCCurrent;
    private int panelTotalPower;
    private int batteriesChargingCurrent;
    private ArrayList<ChargeController> chargeControllers;

    public ChargeControllerSizing(){

    }

    public ChargeControllerSizing(InverterSizing inverterSizing, PanelSizing panelSizing, ArrayList<ChargeController> chargeControllers) {
        this.systemDCVoltage = inverterSizing.getInverter().getDCinput();
        this.panelOCVoltage = panelSizing.getPanelConnection().getSeriesConnection() * panelSizing.getPanel().getNominalVoltage();
        this.panelSCCurrent = panelSizing.getPanelConnection().getParallelConnection() * panelSizing.getPanel().getNominalCurent();
        this.panelTotalPower = panelSizing.getPanelNumber() * panelSizing.getPanel().getPower();
        this.batteriesChargingCurrent = (int) (0.85 * (this.panelTotalPower / this.systemDCVoltage));
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
     * 
     * @return int return the panelSCCurent
     */
    public int getPanelSCCurrent(){
        return panelSCCurrent;
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

        //part 1: filtering controllers from list of controllers by system voltage
        for (ChargeController chargeController : getChargeControllers()) {
            if(getSystemDCVoltage() == chargeController.getRatedChargeVoltage() && 
            getBatteriesChargingCurrent() <= chargeController.getRatedChargeCurrent() && 
            getPanelOCVoltage() <= chargeController.getMaxInputVoltage()){
                actualControllers.add(chargeController);
            }
        }

        //part 2: getting the actual charge controller
        if (!actualControllers.isEmpty()) {
            int i = 0;
            int diff = 0;
            int init;
            for (ChargeController chargeController : getChargeControllers()) {
                init = chargeController.getRatedChargeCurrent() - getBatteriesChargingCurrent();
                if(i == 0){
                    diff = init;
                }
                i++;
                if(diff >= init){
                    actualController = chargeController;
                }
            }
        }
        return actualController;
        //implementing code in ChargeController.java part 4: declaring and implementing getChargeControlloer() method part 1
    }

    @Override
    public String toString() {
        return "\nThe Charge Controller Sizing is as follows {" +
            "\n The charge controller battery voltage= '" + getChargeController().getRatedChargeVoltage() + 
            "V',\n The charge controller maximum panel voltage= '" + getChargeController().getMaxInputVoltage() + 
            "V',\n The charge controller maximum panel power= '" + getChargeController().getRatedChargePower() + 
            "W',\n The charge controller output charging current= '" + getChargeController().getRatedChargeCurrent() + 
            "A'\n}\n";
    }

    public String toStringResult() {
        return "\nThe Charge Controller parameters calculated are as follows {" +
            "\n The system DC voltage= '" + getSystemDCVoltage() + 
            "V',\n The panel open circuit voltage= '" + getPanelOCVoltage() + 
            "V',\n The panel short circuit current= '" + getPanelSCCurrent() + 
            "A',\n The panel total power= '" + getPanelTotalPower() + 
            "W',\n The batteries charging current= '" + getBatteriesChargingCurrent() + 
            "A'\n}";
    }


}
