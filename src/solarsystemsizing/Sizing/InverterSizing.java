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
 * 
 * @descrition
 * This class incharge of sizing an inverter for our solar system
 * It takes in all the required properties needed to size our inverter using 
 * it class constructors. Hence, using it methods, it provides some specific information 
 * on which type if inverter should be used for the system in question, what of their specifific 
 * characteristics, and how they should be used.
 */
public class InverterSizing {
    private ArrayList<Inverter> inverters = new ArrayList<>();
    private int systemMaxPower;
    private int inverterVoltage = 0;
    private static final int inverterVoltage1 = 12;
    private static final int inverterVoltage2 = 24;
    private static final int inverterVoltage3 = 48;

    /**
     * This constructor takes a list of inverters and the maximum power required by the appliance.
     * @param inverters {@link #inverters} of type ArraList<Inverter>
     * @param systemMaxPower {@link #systemMaxPower} of type int
     */
    public InverterSizing(ArrayList<Inverter> inverters, int systemMaxPower) {
        this.inverters = inverters;
        this.systemMaxPower = systemMaxPower;
    }    

    /**
     * Empty constructor of class inverter to have an instance of sizing an object with no properties
     * for default instantiation of the class object
     */
    public InverterSizing() {
    }

    /**
     * @return  return {@link #systemMaxPower} of type int 
     */
    public int getSystemMaxPower() {
        return systemMaxPower;
    }

    /***
     * Instatiate the inverter DC input voltage for the InverterSizing Object
     * @param takes {@link #inverterVoltage} of type int
     */
    public void setInverterVoltage(int inverterVoltage){
        this.inverterVoltage = inverterVoltage;
    }

    /**
     * Determing an appriopate inverter voltage according to the system {@link #getSystemMaxPower()}
     * @return return {@link #inverterVoltage} of type int
     */
    private int getInverterVoltage(){
        if(getSystemMaxPower() > 0 && getSystemMaxPower() <= 1000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage1;
        }else if (getSystemMaxPower() > 1000 && getSystemMaxPower() <= 5000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage2;
        }else if(getSystemMaxPower() > 5000 && inverterVoltage == 0){
            inverterVoltage = inverterVoltage3;
        }
        return inverterVoltage;
    }

    /**
     * Return the actual inverter required by the system.
     * It is a pivate method and called in the method {@link #getInverter()}.
     * When an empty contructor of the class {@link #InverterSizing()} is called to instantiate the object, 
     * this method returns an Inverter with ratedWatt = 0 and DCinput = 0.
     * @return Returns an oject of type Inverter.
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
                if(getInverterVoltage() == inverter.getDCinput() && getSystemMaxPower() < inverter.getRatedWatt()){
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
                if(init <= diff){
                    actualInverter = inverter;
                }
            }
        }
        return actualInverter;
    }

    /**
     * Return the actual inverter required by the system from method {@link #findInverter()}.
     * @return
     * The an object of type Inverter
     */
    public Inverter getInverter(){
        return findInverter();
    }

    /**
     * This method returns all the data required of the chosen inverter of the system.
     * @return
     * Return string of sized inverter properties.
     */
    @Override
    public String toString() {
        return "\nThe Inverter Sizing is as folows {" +
        "\n Inverter input DC Voltage= '" + getInverter().getDCinput() +
        "V',\n Inverter output rated power= '" + getInverter().getRatedWatt() + 
        "W',\n Inverter output rated voltage= '" + "220/240" +
        "'\n}";
    }
}
