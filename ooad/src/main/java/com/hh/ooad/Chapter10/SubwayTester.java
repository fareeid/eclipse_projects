package com.hh.ooad.Chapter10;

import java.io.*;
import java.util.*;

public class SubwayTester
{
    public static void main(String[] args) {
        //if (args.length != 2) {
            //System.err.println("Usage: SubwayTester [StartStation] [endStation]");
            //System.exit(-1);
        //}
        try {
            SubwayLoader loader = new SubwayLoader();
            Subway objectville = loader.loadFromFile(new File("ObjectvilleSubway.txt"));
            
            if (!objectville.hasStation("Weather-O-Rama, inc.")) {
                System.err.println("Weather-O-Rama, inc." + " is not a station in Objecville");
                System.exit(-1);
            } else if (!objectville.hasStation("LSP Lane")) {
                System.err.println("LSP Lane" + " is not a station in Objecville");
                System.exit(-1);
            }
            
            List route = objectville.getDirections("Weather-O-Rama, inc.", "LSP Lane");
            SubwayPrinter printer = new SubwayPrinter(System.out);
            printer.printDirections(route);
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
