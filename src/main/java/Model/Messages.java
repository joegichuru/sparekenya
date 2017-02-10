package Model;

import javax.ejb.Local;
import javax.ejb.Singleton;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joseph on 2/5/17.
 */
@Singleton
@Local
public class Messages {
    //get a collection o unread messages and store in a map
    private Map<Integer,MessageModel> allMessages=new HashMap<Integer, MessageModel>();

    public Map<Integer, MessageModel> getAllMessages() {
        return allMessages;
    }

    public void setAllMessages(Map<Integer, MessageModel> allMessages) {
        this.allMessages = allMessages;
    }
    public int messagesCount(){
//        return (allMessages.size());
        return 6;
    }
    public long messageTimeSendOfLast(){
        //usually should iterate the map to find the latest message
        return new Date(System.currentTimeMillis()).getTime()+10;
    }
}
