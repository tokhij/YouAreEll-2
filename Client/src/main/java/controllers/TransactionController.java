package controllers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";

    public TransactionController() {
    }

    public void makeURLCall(String address, String method, String payload) {
        if(method.equalsIgnoreCase("post")){
            post(address, method, payload);
        }
        if(method.equalsIgnoreCase("get")){
            get(address, method);
        }
    }

    public String get(String address, String method){
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(rootURL + address);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);

            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }

            rd.close();
            return response.toString();
        } catch (Exception e) {
            System.out.println("Error 404 Not Found");
            e.printStackTrace();
            return "{}";
        }
    }

    public String post(String address, String method, String payload){
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(rootURL + address);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");

        } catch (Exception e) {
            System.out.println("Error 400");
            e.printStackTrace();
            return null;



    }


}

