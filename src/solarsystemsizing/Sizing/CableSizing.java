package solarsystemsizing.Sizing;

import solarsystemsizing.Model.Cable;

public class CableSizing {
    private int batteryCableLength;
    private int panelCableleLength;
    private ChargeControllerSizing controllerSizing;
    private Cable cable;

    /**
     * @param batteryCableLength
     * @param panelCableleLength
     * @param controllerSizing
     */
    public CableSizing(int batteryCableLength, int panelCableleLength, ChargeControllerSizing controllerSizing, Cable cable) {
        this.batteryCableLength = batteryCableLength;
        this.panelCableleLength = panelCableleLength;
        this.controllerSizing = controllerSizing;
        this.cable = cable;
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

    /**
     * @return the cable
     */
    public Cable getCable(){
        return cable;
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
