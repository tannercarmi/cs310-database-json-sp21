/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

import static databasetest.DatabaseTest.getJSONData;
import org.json.simple.JSONArray;

/**
 *
 * @author Tanner Carmichael
 */
public class Main {
    
    public static void main(String[] args) {
        // Database to JSON conversion
        
        System.out.println("CONVERSION RESULTS (DataBase to JSON)");
        System.out.println("================================");

        //String json = Converter.csvToJson(csvFileString);
        JSONArray json = getJSONData();
        System.out.println(json);
    }
    
}
