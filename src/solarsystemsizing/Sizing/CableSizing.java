package solarsystemsizing.Sizing;

import solarsystemsizing.Model.Cable;

public class CableSizing {
    private float batteryCableLength;
    private float panelCableleLength;
    private ChargeControllerSizing controllerSizing;
    private Cable cable;

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
    public float batteryCrossArea(){
        return (getCable().getResistivity() * controllerSizing.getBatteriesChargingCurrent() * getBatteryCableLength()) 
            / controllerSizing.getSystemDCVoltage();
    }

    /** 
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */    
    @Override
    public String toString() {
        return "CableSizing [batteryCableLength=" + batteryCableLength + ", controllerSizing=" + controllerSizing
                + ", panelCableleLength=" + panelCableleLength + "]";
    }
    
}
