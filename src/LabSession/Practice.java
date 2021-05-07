package LabSession;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        Set<Double> interestRates = new HashSet<>();
        interestRates.add(1.1);
        interestRates.add(2.2);
        interestRates.add(12.2);
        interestRates.add(1.11);
        interestRates.add(2.0);
        interestRates.add(13.1);
        interestRates.add(22.0);
        interestRates.add(1.2);

        /**
         * find the max mortgage rate?
         */
        Double maxRate = -1.0;
        for (Double rate : interestRates) {
            if (rate > maxRate) {
                maxRate = rate;
            }
        }
        System.out.println(maxRate);


        Map<String, Integer> colorCount = new HashMap<>();
        colorCount.put("green", 10);
        colorCount.put("red", 21);
        colorCount.put("blue", 43);
        colorCount.put("orange", 12);
        colorCount.put("violet", 10);
        colorCount.put("pink", 65);
        colorCount.put("white", 7);
        colorCount.put("black", 10);

        /**
         * Print the color name with max count.
         *
         * pink
         */


        Collection<Integer> colorValues = colorCount.values();
        int maxValue = 0;
        for (int value : colorValues) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println(maxValue);
        Set<String> allKeys = colorCount.keySet();

        for (String key : allKeys) {
            if (colorCount.get(key) == maxValue) {
                System.out.println("Max color count is " + key + colorCount.get(key));
                break;

            }
        }

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(101, "happy");
        myMap.put(10, "job");
        myMap.put(908, "learn");
        myMap.put(1111, "grow");
        myMap.put(76, "HappY");

        Integer checkKey = 22;
        Set<String> keysOfMap = colorCount.keySet();


        }


        // write code here
        // if value with given key is of length greater than 4 -->
        //      print the value
        //
        // else -->
        //      print 'value not greater than 4'
        //
        // if the given key is not found -->
        //      print 'key not available'


    }






