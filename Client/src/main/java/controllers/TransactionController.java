package controllers;

import kong.unirest.*;


public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";

    public TransactionController() {
    }

    public String makeURLCall(String endpoint, String method, String jpayload) {
        HttpResponse<JsonNode> jsonResponse = Unirest.get(rootURL + endpoint)
                .header("accept", "application/json")
                .asJson();
        return jsonResponse.getBody().toString();
    }
//        HttpResponse<JsonNode> jsonResponse;
//        if (method.equalsIgnoreCase("post")) {
//            post(endpoint, method, jpayload);
//        }
//        if (method.equalsIgnoreCase("get")) {
//            get(endpoint, method);
//        }

    public String get(String address, String method) {
//        HttpURLConnection connection = null;
//
//        try {
//            //Create connection
//            URL url = new URL(rootURL + address);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod(method);
//
//            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
//            String line;
//            while ((line = rd.readLine()) != null) {
//                response.append(line);
//            }
//
//            rd.close();
//            return response.toString();
//        } catch (Exception e) {
//            System.out.println("Error 404 Not Found");
//            e.printStackTrace();
//            return "{}";
        }
    }

    public String post(String address, String method, String payload) {
//        HttpURLConnection connection = null;
//
//        try {
//            //Create connection
//            URL url = new URL(rootURL + address);
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("POST");
//
//        } catch (Exception e) {
//            System.out.println("Error 400");
//            e.printStackTrace();
//            return null;
//
//
//        }
//
        return null;
    }

    public String getRootURL() {
        return rootURL;
    }
}

