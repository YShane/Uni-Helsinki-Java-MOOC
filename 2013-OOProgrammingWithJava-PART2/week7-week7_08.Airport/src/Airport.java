/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Shane Yankam Shaneyankam.com Samyyankam@gmail.com
 */
public class Airport {

    public Scanner reader;
    public DataManager manage;
    public int count;

    public Airport(Scanner reader) {

        this.manage = new DataManager();
        this.reader = reader;
        this.count = 0;

    }

    public void start() {
     
        while(this.count==0){
        startAirportPanel();
        this.count++;
        }
        
    }

    public void startAirportPanel() {

        System.out.println("Airport panel\n"
                + "--------------------\n"
        );
        this.Menu(1);

        String in1 = reader.nextLine().trim().toLowerCase();
        if (in1.equals("1")) {

            this.manage.addPlane(reader);
            start();

        } else if (in1.equals("2")) {

            this.manage.addFlight(reader);
            startAirportPanel();

        } else if (in1.equals("x")) {

            this.startFlightService();

        } else {
            start();

        }


    }

    public void startFlightService() {

        System.out.println("Flight service\n"
                + "------------");
        this.Menu(2);

        String in2 = reader.nextLine();

        if (in2.equals("1")) {
            this.manage.printPlanes();
            startFlightService();

        } else if (in2.equals("2")) {
            this.manage.printFlights();
            startFlightService();
        } else if (in2.equals("3")) {

            this.manage.printPlaneInfo(reader);
            startFlightService();
        } else if (in2.equals("x")) {
            
           

        } else {

        }

    }

    public void Menu(int menutype) {

        if (menutype == 1) {

            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");

        }

        if (menutype == 2) {

            System.out.println(
                    "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
        }

    }

}
