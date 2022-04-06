package solarsystemsizing.Sizing;

import java.util.ArrayList;

import solarsystemsizing.Model.Inverter;

/**
 * 
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class InverterSizing {
    private ArrayList<Inverter> inverters = new ArrayList<>();
    private int systemMaxPower;
    private int inverterVoltage = 0;
    private static final int inverterVoltage1 = 12;
    private static final int inverterVoltage2 = 24;
    private static final int inverterVoltage3 = 48;

    /**
     * 
     * @param inverters
     * @param systemMaxPower
     */
    public InverterSizing(ArrayList<Inverter> inverters, int systemMaxPower) {
        this.inverters = inverters;
        this.systemMaxPower = systemMaxPower;
    }    

    public InverterSizing() {
    }

    /**
     * @return int return the systemMaxPower
     */
    public int getSystemMaxPower() {
        return systemMaxPower;
    }

    /***
     * 
     * @param inverterVoltage
     */
    public void setInverterVoltage(int inverterVoltage){
        this.inverterVoltage = inverterVoltage;
    }

    /**
     * 
     * @return
     */
    private int getInverterVoltage(){
        if(systemMaxPower > 0 && systemMaxPower <= 1000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage1;
        }else if (systemMaxPower > 1000 && systemMaxPower <= 5000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage2;
        }else if(systemMaxPower > 5000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage3;
        }
        return inverterVoltage;
    }

    /**
     * 
     * @return
     */
    private Inverter findInverter(){
        Inverter actualInverter = new Inverter(0, 0);
        ArrayList<Inverter> inverList = new ArrayList<>();

        int j = 0;
        do {
            if(j != 0){
                if (getInverterVoltage() == inverterVoltage1) {
                    setInverterVoltage(inverterVoltage2);
                }else if(getInverterVoltage() == inverterVoltage2){
                    setInverterVoltage(inverterVoltage3);
                }else{
                    setInverterVoltage(inverterVoltage2);
                }
            }

            for (Inverter inverter : inverters) {
                if(getInverterVoltage() == inverter.getDCinput() && getSystemMaxPower() <= inverter.getRatedWatt()){
                    inverList.add(inverter);
                }
            }
            
            j++;
        } while (inverList.isEmpty() && j <= 2);

        if(!inverList.isEmpty()) {
            int init;
            int diff = 0;
            int i = 0;
            for (Inverter inverter : inverList) {
                init = inverter.getRatedWatt() - getSystemMaxPower();
                if(i == 0){
                    diff = init;
                }
                i++;
                if(diff >= init){
                    actualInverter = inverter;
                }
            }
        }
        return actualInverter;
    }

    /**
     * 
     * @return
     */
    public Inverter getInverter(){
        return findInverter();
    }

    @Override
    public String toString() {
        return "\nThe Inverter Sizing is as folows {" +
        "\n Inverter input DC Voltage= '" + getInverter().getDCinput() +
        "V',\n Inverter output rated power= '" + getInverter().getRatedWatt() + 
        "W',\n Inverter output rated voltage= '" + "220/240" +
        "'\n}";
    }
}
