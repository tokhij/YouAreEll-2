package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Id;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class IdController {
    private TransactionController transactionController = new TransactionController();

    public String getIds() {
        return transactionController.makeURLCall("/ids", "GET", "");
    }

    public ArrayList<Id> parseIds(String payload){
        Type listType = new TypeToken<List<Id>>() {}.getType();
        return new Gson().fromJson(payload, listType);
    }
//        ObjectMapper mapper = new ObjectMapper();
//        ArrayList<Id> ids = new ArrayList<Id>();
//        String jsonInString = TransactionController.makeURLCall("/ids", "GET", "");
//
//        try {
//            // Convert JSON string to Object
//            TransactionController tC = new TransactionController();
//            Id idArray[] = mapper.readValue(jsonInString, Id[].class);
//            ids = new ArrayList(Arrays.asList(idArray));
//
//        }
//        catch (JsonGenerationException e) {
//            e.printStackTrace();
//        }
//        catch (JsonMappingException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        return ids;
//    }

    public Id postId(Id id) {
        ObjectMapper mapper = new ObjectMapper();
        TransactionController tC = new TransactionController();
        try {
            String payload = mapper.writeValueAsString(id);
            tC.makeURLCall("/ids", "POST", payload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return id;
    }

    public Id putId(Id id) {
        return null;
    }

}