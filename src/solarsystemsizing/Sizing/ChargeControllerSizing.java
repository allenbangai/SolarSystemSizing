package solarsystemsizing.Sizing;

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

    public ChargeControllerSizing(){

    }

    public ChargeControllerSizing(InverterSizing inverterSizing, PanelSizing panelSizing) {
        this.systemDCVoltage = inverterSizing.getInverter().getDCinput();
        this.panelOCVoltage = panelSizing.getPanelConnection().getSeriesConnection() * panelSizing.getPanel().getNominalVoltage();
        this.panelTotalPower = panelSizing.getPanelNumber() * panelSizing.getPanel().getPower();
        this.batteriesChargingCurrent = this.panelTotalPower / this.systemDCVoltage;
    }

}
