package solarsystemsizing.Sizing;

import solarsystemsizing.Total;
import solarsystemsizing.Model.Power;
import java.util.ArrayList;

/**
 * This class Battery.java describes the characteristics of a battery used in sizing 
 * solar systems... As we all know, a battery both has the Energy it stores in Ampere hour
 * (Ah) and the voltage at which it is either charged or discharged measured in volts (VDC).
 * This characteristics are used to describe an object of a battery so we could this class to 
 * describe different types of objects of batteries. This characteristics are {@link #voltage} 
 * and {@link #ampereHour}.
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class TPower extends Total{
    private ArrayList<Power> powers = new ArrayList<>();
    private int tPower;
    private int hours; //total harmonized hours of autonomy or utility of all loads

    /**
     * 
     * @param powers
     * @param hours
     */
    public TPower(ArrayList<Power> powers, int hours) {
        this.powers = powers;
        this.hours = hours;
    }

    /**
     * 
     * @param tPower
     * @param hours
     */
    public TPower(int tPower, int hours) {
        this.tPower = tPower;
        this.hours = hours;
    }

    /**
     * 
     * @return
     */
    public int gettPower() {
        return tPower;
    }

    /**
     * return a total same number of hours of autonomy for all loads in the local
     * meaning all the loads will have the same number of autonomy
     * @return
     */
    public int getHours() {
        return hours;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Power> getPowers() {
        return powers;
    }

    private int val1 = 0;
    /**
     * 
     */
    private void toHelp(){
        for(Power power : getPowers()){
            val1 = val1 + power.getPower();
        }
    }
    
    /**
     * 
     * @return
     */
    private int returnTEnergy(){
        if (getPowers().isEmpty()) {
            return gettPower() * getHours();
        } else {
            toHelp();
            return val1 * getHours();
        }
    }
    
    /**
     * 
     */
    @Override
    public double totalE() {
        return (double) (super.getVal() * returnTEnergy());
    }

    /**
     * 
     */
    @Override
    public double totalP() {
        if(getPowers().isEmpty()){
            return (double) gettPower();
        }else{
            toHelp();
            return (double) (val1);
        }
    }
}
