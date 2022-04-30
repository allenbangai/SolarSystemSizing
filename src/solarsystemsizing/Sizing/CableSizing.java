package solarsystemsizing.Sizing;

public class CableSizing {
    private int batteryCableLength;
    private int panelCableleLength;
    private ChargeControllerSizing controllerSizing;

    /**
     * @return the batteryCableLength
     */
    public int getBatteryCableLength() {
        return batteryCableLength;
    }
    
    /**
     * @return the panelCableleLength
     */
    public int getPanelCableleLength() {
        return panelCableleLength;
    }
    
    /**
     * @return the controllerSizing
     */
    public ChargeControllerSizing getControllerSizing() {
        return controllerSizing;
    }
    
}
