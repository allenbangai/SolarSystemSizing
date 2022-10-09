package solarsystemsizing.Util;

import solarsystemsizing.Model.*;
import java.util.ArrayList;
/**
 * This class store samples of each object use in the sizing of our system
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Store {
    
    public Store(){

    }

    /**
     * This method returns a storage of the available list of panels object in store in the app
     * @return
     */
    public static ArrayList<Panel> getPanels(){
        ArrayList<Panel> panels = new ArrayList<>();
        panels.add(new Panel(100, 12, 18));
        panels.add(new Panel(110, 12, 18));
        panels.add(new Panel(150, 12, 18));
        panels.add(new Panel(200, 24, 36));
        panels.add(new Panel(220, 24, 36));
        panels.add(new Panel(250, 24, 36));
        panels.add(new Panel(275, 24, 36));
        panels.add(new Panel(300, 24, 36));
        panels.add(new Panel(330, 24, 36));
        panels.add(new Panel(350, 24, 36));
        return panels;
    }

    /**
     * This method returns a storage of the available list of inverters object in store in the app
     * @return
     */
    public static ArrayList<Inverter> getInverters(){
        ArrayList<Inverter> inverters = new ArrayList<>();
        inverters.add(new Inverter(300, 12));
        inverters.add(new Inverter(200, 12));
        inverters.add(new Inverter(400, 12));
        inverters.add(new Inverter(500, 12));
        inverters.add(new Inverter(600, 12));
        inverters.add(new Inverter(1000, 24));
        inverters.add(new Inverter(1000, 12));
        inverters.add(new Inverter(1000, 24));
        inverters.add(new Inverter(1200, 12));
        inverters.add(new Inverter(1500, 12));
        inverters.add(new Inverter(1500, 24));
        inverters.add(new Inverter(2000, 12));
        inverters.add(new Inverter(2000, 24));
        inverters.add(new Inverter(2500, 12));
        inverters.add(new Inverter(2500, 24));
        inverters.add(new Inverter(3000, 12));
        inverters.add(new Inverter(3000, 24));
        inverters.add(new Inverter(3500, 12));
        inverters.add(new Inverter(3500, 24));
        inverters.add(new Inverter(4000, 12));
        inverters.add(new Inverter(4000, 24));
        inverters.add(new Inverter(4000, 48));
        inverters.add(new Inverter(4500, 12));
        inverters.add(new Inverter(4500, 24));
        inverters.add(new Inverter(4500, 48));
        inverters.add(new Inverter(5000, 12));
        inverters.add(new Inverter(5000, 24));
        inverters.add(new Inverter(5000, 48));
        inverters.add(new Inverter(5500, 48));
        inverters.add(new Inverter(6000, 48));
        inverters.add(new Inverter(10000, 48));
        inverters.add(new Inverter(15000, 48));
        return inverters;
    }

    /**
     * This method returns a storage of the available list of batteries object in store in the app
     * @return
     */
    public static ArrayList<Battery> getBatteries() {
        ArrayList<Battery> batteries = new ArrayList<>();
        batteries.add(new Battery(12, 110));
        batteries.add(new Battery(12, 100));
        batteries.add(new Battery(12, 140));
        batteries.add(new Battery(12, 145));
        batteries.add(new Battery(12, 200));
        batteries.add(new Battery(12, 210));
        batteries.add(new Battery(12, 225));
        batteries.add(new Battery(12, 240));
        batteries.add(new Battery(12, 250));
        batteries.add(new Battery(12, 300));
        batteries.add(new Battery(12, 175));
        batteries.add(new Battery(12, 150));
        batteries.add(new Battery(12, 180));
        batteries.add(new Battery(12, 120));
        batteries.add(new Battery(12, 130));
        batteries.add(new Battery(12, 160));
        batteries.add(new Battery(12, 70));
        batteries.add(new Battery(12, 75));
        batteries.add(new Battery(12, 80));
        batteries.add(new Battery(12, 85));
        batteries.add(new Battery(12, 90));
        //batteries.add(new Battery(12, 225));
        batteries.add(new Battery(24, 40));
        batteries.add(new Battery(24, 55));
        batteries.add(new Battery(24, 50));
        batteries.add(new Battery(24, 200));
        batteries.add(new Battery(24, 150));
        batteries.add(new Battery(24, 60));
        batteries.add(new Battery(24, 70));
        batteries.add(new Battery(24, 75));
        //batteries.add(new Battery(24, 70));
        batteries.add(new Battery(2, 200));
        batteries.add(new Battery(2, 300));
        batteries.add(new Battery(2, 400));
        batteries.add(new Battery(2, 500));
        batteries.add(new Battery(2, 600));
        batteries.add(new Battery(2, 700));
        batteries.add(new Battery(2, 800));
        batteries.add(new Battery(2, 1000));
        batteries.add(new Battery(2, 1200));
        batteries.add(new Battery(2, 1500));
        batteries.add(new Battery(2, 2000));
        batteries.add(new Battery(2, 2500));
        batteries.add(new Battery(2, 3000));
        return batteries;
    }

    public static ArrayList<ChargeController> getChargeControllers() {
        ArrayList<ChargeController> chargeControllers = new ArrayList<>();
        chargeControllers.add(new ChargeController(12, 20, 150, 280));
        chargeControllers.add(new ChargeController(24, 20, 150, 550));
        chargeControllers.add(new ChargeController(48, 20, 150, 1100));
        chargeControllers.add(new ChargeController(12, 30, 150, 420));
        chargeControllers.add(new ChargeController(24, 30, 150, 840));
        chargeControllers.add(new ChargeController(48, 30, 150, 1650));
        chargeControllers.add(new ChargeController(12, 40, 150, 570));
        chargeControllers.add(new ChargeController(24, 40, 150, 1130));
        chargeControllers.add(new ChargeController(48, 40, 150, 2270));
        chargeControllers.add(new ChargeController(12, 50, 150, 700));
        chargeControllers.add(new ChargeController(24, 50, 150, 1400));
        chargeControllers.add(new ChargeController(48, 50, 150, 2800));
        chargeControllers.add(new ChargeController(12, 60, 150, 900));
        chargeControllers.add(new ChargeController(24, 60, 150, 1700));
        chargeControllers.add(new ChargeController(48, 60, 150, 3400));
        chargeControllers.add(new ChargeController(12, 10, 75));
        chargeControllers.add(new ChargeController(24, 10, 75));
        chargeControllers.add(new ChargeController(48, 10, 75));
        chargeControllers.add(new ChargeController(12, 15, 75));
        chargeControllers.add(new ChargeController(24, 15, 75));
        chargeControllers.add(new ChargeController(48, 15, 75));
        chargeControllers.add(new ChargeController(12, 20, 100));
        chargeControllers.add(new ChargeController(24, 20, 100));
        chargeControllers.add(new ChargeController(48, 20, 100));
        chargeControllers.add(new ChargeController(12, 15, 100));
        chargeControllers.add(new ChargeController(24, 15, 100));
        chargeControllers.add(new ChargeController(48, 15, 100));
        chargeControllers.add(new ChargeController(12, 30, 100));
        chargeControllers.add(new ChargeController(24, 30, 100));
        chargeControllers.add(new ChargeController(48, 30, 100));
        chargeControllers.add(new ChargeController(12, 50, 100));
        chargeControllers.add(new ChargeController(24, 50, 100));
        chargeControllers.add(new ChargeController(48, 50, 100));
        chargeControllers.add(new ChargeController(12, 35, 150));
        chargeControllers.add(new ChargeController(24, 35, 150));
        chargeControllers.add(new ChargeController(48, 35, 150));
        chargeControllers.add(new ChargeController(12, 45, 150));
        chargeControllers.add(new ChargeController(24, 45, 150));
        chargeControllers.add(new ChargeController(48, 45, 150));
        chargeControllers.add(new ChargeController(12, 70, 150));
        chargeControllers.add(new ChargeController(24, 70, 150));
        chargeControllers.add(new ChargeController(48, 70, 150));
        chargeControllers.add(new ChargeController(12, 85, 150));
        chargeControllers.add(new ChargeController(24, 85, 150));
        chargeControllers.add(new ChargeController(48, 85, 150));
        chargeControllers.add(new ChargeController(12, 100, 150));
        chargeControllers.add(new ChargeController(24, 100, 150));
        chargeControllers.add(new ChargeController(48, 100, 150));
        chargeControllers.add(new ChargeController(12, 70, 250));
        chargeControllers.add(new ChargeController(24, 70, 250));
        chargeControllers.add(new ChargeController(48, 70, 250));
        chargeControllers.add(new ChargeController(12, 85, 250));
        chargeControllers.add(new ChargeController(24, 85, 250));
        chargeControllers.add(new ChargeController(48, 85, 250));
        chargeControllers.add(new ChargeController(12, 100, 250));
        chargeControllers.add(new ChargeController(24, 100, 250));
        chargeControllers.add(new ChargeController(48, 100, 250));
        chargeControllers.add(new ChargeController(12, 60, 170));
        chargeControllers.add(new ChargeController(24, 60, 170));
        chargeControllers.add(new ChargeController(48, 60, 170));
        chargeControllers.add(new ChargeController(12, 95, 150));
        chargeControllers.add(new ChargeController(24, 95, 150));
        chargeControllers.add(new ChargeController(48, 95, 150));
        chargeControllers.add(new ChargeController(12, 80, 75, 1250));
        chargeControllers.add(new ChargeController(24, 80, 150, 2500));
        chargeControllers.add(new ChargeController(48, 80, 150, 5000));
        chargeControllers.add(new ChargeController(12, 100, 300, 3000));
        chargeControllers.add(new ChargeController(24, 100, 300, 6000));
        return chargeControllers;
    }

    public static ArrayList<Cable> getCables(){
        ArrayList<Cable> cables = new ArrayList<>();
        cables.add(new Cable("Copper", 0.0000000172));
        cables.add(new Cable("Alluminium", 0.0000000265));
        return cables;
    }
}