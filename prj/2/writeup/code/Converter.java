/**
   * file: Converter.java
   * author: Zachary Ropes
   * course: CMPT 220
   * assignment: Project 2
   * April 28, 2017
   * version: 1.0
   * 
   * Runs a distance conversion program, race pace conversion program, and a pace calculator
   * as well as an information 
   */  

import java.util.Scanner;

public class Converter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int n = 1;
    while(n != 0){
      System.out.print("What would you like to calculate today? \n" +
        "Enter 1 for distance conversion, 2 for race pace conversion, 3 for a pace calculator," +
        " 4 for more info on calculators, or 5 if you're done using the program: ");
      int converter = input.nextInt();
      
      // distance conversion
      if(converter == 1) {
        System.out.print("Enter two distances, the first being the distance you want to convert " +
          "from and the second the distance you want to convert too\n" +
          "Enter 1 for meters, 2 for kilometers, and 3 for miles:" );
        int distance1 = input.nextInt();
        int distance2 = input.nextInt();
        String[] names = new String[3];
        names[0] = " meters";
        names[1] = " kilometers";
        names[2] = " miles";
      
        System.out.print("Now enter the actual distance you want to convert from: ");
        double firstdistance = input.nextDouble();
        double finaldistance = 0;
      
        // meters to kilometers
        if(distance1 == 1 && distance2 == 2) {
          finaldistance = firstdistance / 1000;
        }
        // meters to miles
        else if(distance1 == 1 && distance2 == 3) {
          finaldistance = firstdistance / 1609.34;
        }
        // kilometers to meters
        else if(distance1 == 2 && distance2 == 1) {
          finaldistance = firstdistance * 1000;
        }
        // kilometers to miles
        else if(distance1 == 2 && distance2 == 3) {
          finaldistance = firstdistance / 1.60934;
        }
        // miles to meters
        else if(distance1 == 3 && distance2 == 1) {
          finaldistance = firstdistance * 1609.34;
        }
        // miles to kilometers
        else if(distance1 == 3 && distance2 == 2) {
          finaldistance = firstdistance * 1.60934;
        }
      
        finaldistance = Math.round(finaldistance * 100.0) / 100.0;
      
        System.out.print(firstdistance + names[distance1 - 1] + " converted to" +
          names[distance2 - 1] + " is " + finaldistance + names[distance2 - 1]);
        
        System.out.print("\nIf you wish to make any other conversions enter any number other " +
          "than 0, else enter 0: ");
        n = input.nextInt();
      }
      
      // race pace conversion
      else if(converter == 2) {
        System.out.print("Enter a distance you have run(in meters): ");
        int distance = input.nextInt();
        System.out.print("Enter the fastest time you have run for that distance" +
          "(hrs mins secs, if no variable enter 0): ");
        int hours = input.nextInt();
        int minutes = input.nextInt();
        double seconds = input.nextDouble();
        double time = (hours * 3600) + (minutes * 60) + seconds;
      
        // popular distances run in races
        String[] names2= new String[17];
        names2[0] = "400m";
        names2[1] = "800m";
        names2[2] = "1000m(1km)";
        names2[3] = "1500m";
        names2[4] = "1600m";
        names2[5] = "1mile";
        names2[6] = "3000m(3km)";
        names2[7] = "3200m";
        names2[8] = "2mile";
        names2[9] = "3mile";
        names2[10] = "5km";
        names2[11] = "6km";
        names2[12] = "8km";
        names2[13] = "5mile";
        names2[14] = "10km";
        names2[15] = "half marathon(13.1miles)";
        names2[16] = "marathon(26.2miles)";
      
        // the distances in meters
        double[] actdistances = new double[17];
        actdistances[0] = 400;
        actdistances[1] = 800;
        actdistances[2] = 1000;
        actdistances[3] = 1500;
        actdistances[4] = 1600;
        actdistances[5] = 1609.34;
        actdistances[6] = 3000;
        actdistances[7] = 3200;
        actdistances[8] = 3218.69;
        actdistances[9] = 4828.03;
        actdistances[10] = 5000;
        actdistances[11] = 6000;
        actdistances[12] = 8000;
        actdistances[13] = 8046.72;
        actdistances[14] = 10000;
        actdistances[15] = 21082.41;
        actdistances[16] = 42164.81;
      
        for (int i = 0; i <= 16; i++) {
          double finaltime = time * Math.pow((actdistances[i]/distance), 1.06);
          String finaltime2 = (finaltime / 60) + "";
          int place = finaltime2.indexOf(".");
          String min = finaltime2.substring(0, place);
          String sec = finaltime2.substring(place);
          int min2 = Integer.parseInt(min);
          double sec2 = (Math.round((Double.parseDouble(sec) * 60) * 10.0) / 10.0 );
          if (sec2 >= 10){
            if (min2 < 60){
              System.out.println(names2[i] + "= " + min2 + ":" + sec2);
            }
            else if (min2 >= 60) {
              String minutes2 = (double)(min2 / 60) + "";
              int place2 = minutes2.indexOf(".");
              String hour = minutes2.substring(0, place2);
              String min3 = minutes2.substring(place2);
              int hour2 = Integer.parseInt(hour);
              int min4 = (int)Math.round((Double.parseDouble(min3) * 60));
              if (min4 >= 10){
                System.out.println(names2[i] + "= " + hour2 + ":" + min4 + ":" + sec2);
              }
              else if(min4 < 10){
                System.out.println(names2[i] + "= " + hour2 + ":0" + min4 + ":" + sec2);
              }
            }
          }
          else if (sec2 < 10){
            if (min2 < 60) {
              System.out.println(names2[i] + "= " + min2 + ":0" + sec2);
            }
            else if (min2 >= 60){
              String minutes2 = (double)(min2 / 60) + "";
              int place2 = minutes2.indexOf(".");
              String hour = minutes2.substring(0, place2);
              String min3 = minutes2.substring(place2);
              int hour2 = Integer.parseInt(hour);
              int min4 = (int)Math.round((Double.parseDouble(min3) * 60));
              if (min4 >= 10){
                System.out.println(names2[i] + "= " + hour2 + ":" + min4 + ":0" + sec2);
              }
              else if(min4 < 10){
                System.out.println(names2[i] + "= " + hour2 + ":0" + min4 + ":0" + sec2);
              }
            }
          }
        }
        System.out.print("\nIf you wish to make any other conversions enter any number other " +
          "than 0, else enter 0: ");
        n = input.nextInt();
      }
      
      // pace calculator
      else if (converter == 3) {
        System.out.print("Enter a distance you have run or want to run(in meters): ");
        int pacedistance = input.nextInt();
        System.out.print("Enter a time you have run for that distance or a time you want " +
          "to run(hrs mins secs): ");
        int pacehours = input.nextInt();
        int paceminutes = input.nextInt();
        int paceseconds = input.nextInt();
        int pacetime = (pacehours * 3600) + (paceminutes * 60) + paceseconds;
        
        String[] names3 = new String[3];
        names3[0] = "400m";
        names3[1] = "1km";
        names3[2] = "1mile";
        
        double[] actdistances2 = new double[3];
        actdistances2[0] = 400;
        actdistances2[1] = 1000;
        actdistances2[2] = 1609.34;
        
        for (int r = 0; r <= 2; r++) {
          double finalpacetime = pacetime * (actdistances2[r] / pacedistance);
          String finalpacetime2 = (finalpacetime / 60) + "";
          int place3 = finalpacetime2.indexOf(".");
          String pacemin = finalpacetime2.substring(0, place3);
          String pacesec = finalpacetime2.substring(place3);
          int pacemin2 = Integer.parseInt(pacemin);
          double pacesec2 = (Math.round((Double.parseDouble(pacesec) * 60) * 10.0) / 10.0 );
          if (pacesec2 >= 10){
            if (pacemin2 < 60){
              System.out.println(names3[r] + "= " + pacemin2 + ":" + pacesec2);
            }
            else if (pacemin2 >= 60) {
              String paceminutes2 = (double)(pacemin2 / 60) + "";
              int place4 = paceminutes2.indexOf(".");
              String pacehour = paceminutes2.substring(0, place4);
              String pacemin3 = paceminutes2.substring(place4);
              int pacehour2 = Integer.parseInt(pacehour);
              int pacemin4 = (int)Math.round((Double.parseDouble(pacemin3) * 60));
              if (pacemin4 >= 10){
                System.out.println(names3[r] + "= " + pacehour2 + ":" + pacemin4 + 
                  ":" + pacesec2);
              }
              else if(pacemin4 < 10){
                System.out.println(names3[r] + "= " + pacehour2 + ":0" + pacemin4 + 
                  ":" + pacesec2);
              }
            }
          }
          else if (pacesec2 < 10){
            if (pacemin2 < 60) {
              System.out.println(names3[r] + "= " + pacemin2 + ":0" + pacesec2);
            }
            else if (pacemin2 >= 60){
              String paceminutes2 = (double)(pacemin2 / 60) + "";
              int place4 = paceminutes2.indexOf(".");
              String pacehour = paceminutes2.substring(0, place4);
              String pacemin3 = paceminutes2.substring(place4);
              int pacehour2 = Integer.parseInt(pacehour);
              int pacemin4 = (int)Math.round((Double.parseDouble(pacemin3) * 60));
              if (pacemin4 >= 10){
                System.out.println(names3[r] + "= " + pacehour2 + ":" + pacemin4 + 
                  ":0" + pacesec2);
              }
              else if(pacemin4 < 10){
                System.out.println(names3[r] + "= " + pacehour2 + ":0" + pacemin4 + 
                  ":0" + pacesec2);
              }
            }
          }
        }
        System.out.print("\nIf you wish to make any other conversions enter any number other " +
          "than 0, else enter 0: ");
        n = input.nextInt();
      }
      else if (converter == 4){
        System.out.print("What conversion/calculator would you like to know more about?\n" +
          "Press 1 for distance conversion, 2 for race pace converion, " +
          "3 for pace calculator, or 4 if your not interested: ");
        int choice = input.nextInt();
        
        // distance conversion description
        if (choice == 1) {
          System.out.print("A distance conversion is used primarily to see what the " +
            "distance of one metric system is when converted to a different metric system. " +
            "For example say you ran a 5k, 5km is the distance but perhaps you're more familiar " +
            "with miles, this program gives you the ability " +
            "to find just how many miles is in 5km.");
        }
        // race pace conversion description
        else if (choice == 2) {
          System.out.print("A race pace conversion is mainly used to see how you would perform " +
            "over a variety of different distances using just one time over one distance. The " +
            "program creates a variety of estimates of how you should be able to perform in " +
            "these other distances. Remember these are just estimates to help you understand " +
            "what you are capable of and you should not limit yourself to these values!");
        }
        // pace calculator description
        else if (choice == 3) {
          System.out.print("A pace calculator simply gives you the splits you will need to " +
            "run a certain time over a certain distance. Say you want to run a 16 flat 5k. " +
            "For 16 flat you would need to run 1:16.8 for each 400m and 5:09 for each mile. " +
            "Running these paces for each 400m or each mile will get you to your 16 flat 5k. " +
            "Pace calvculators are useful as they give you what you need to do to " +
            "achieve your goals!");
        }
        else if (choice == 4) {
          System.out.print("Ok, nevermind then.");
        }
        System.out.print("\nIf you wish to make any other conversions enter any number other " +
          "than 0, else enter 0: ");
        n = input.nextInt();
      }
      else {
        break;
      }
    }
  }
}
