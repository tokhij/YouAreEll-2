package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;

public class IdController {
    Id myId;

    public ArrayList<Id> getIds() {

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Id> ids = new ArrayList<Id>();

        try {
            // Convert JSON string to Object
            TransactionController tC = new TransactionController();
            String jsonInString = tC.makeURLCall("/ids", "GET", "");
            Id idArray[] = mapper.readValue(jsonInString, Id[].class);
            ids = new ArrayList(Arrays.asList(idArray));

        }
        catch (JsonGenerationException e) {
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return ids;
    }

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