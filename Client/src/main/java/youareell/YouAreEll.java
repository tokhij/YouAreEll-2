package youareell;

import controllers.*;
import models.Id;

public class YouAreEll {

    private MessageController msgCtrl;
    private IdController idCtrl;

    public YouAreEll (MessageController m, IdController j) {
        // used j because i seems awkward
        this.msgCtrl = m;
        this.idCtrl = j;
    }

    public String get_ids() {
        return idCtrl.getIds().toString();
//        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return "Nada"; //MakeURLCall("/messages", "GET", "");
    }

    public Id post_ids(Id id) {
        return idCtrl.postId(id);
    }



}
