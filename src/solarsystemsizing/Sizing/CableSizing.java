package solarsystemsizing.Sizing;

public class CableSizing {
    private int batteryCableLength;
    private int panelCableleLength;
    private ChargeControllerSizing controllerSizing;

    /**
     * @param batteryCableLength
     * @param panelCableleLength
     * @param controllerSizing
     */
    public CableSizing(int batteryCableLength, int panelCableleLength, ChargeControllerSizing controllerSizing) {
        this.batteryCableLength = batteryCableLength;
        this.panelCableleLength = panelCableleLength;
        this.controllerSizing = controllerSizing;
    }

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
