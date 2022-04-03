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
    private InverterSizing inverterSizing;
    private PanelSizing panelSizing;
    
    public ChargeControllerSizing(){

    }

    public ChargeControllerSizing(InverterSizing inverterSizing, PanelSizing panelSizing) {
        this.inverterSizing = inverterSizing;
        this.panelSizing = panelSizing;
    }

}
