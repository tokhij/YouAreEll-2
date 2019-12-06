package models;

/* 
 * POJO for an Message object
 */
public class Message {
    String sequence;
    String timestamp;
    String fromId;
    String toId;
    String message;

    public Message (String message, String fromId, String toId) {
        this.message = message;
        this.fromId = fromId;
        this.toId = toId;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return sequence;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getToId() {
        return toId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}