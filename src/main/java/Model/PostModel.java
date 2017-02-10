package Model;

/**
 * Created by joseph on 2/4/17.
 */

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import java.util.Date;

/**
 * defines tempalate for creating individual post to the page
 * **/
@Stateless
@Local
public class PostModel {
    private int postId;
    private Date timePosted;
    //references the id of the item posted
    private int itemId;
    //number of post detail clicks
    private int numberOfViews;
    //id of the user who posted
    private int userId;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Date getTimePosted() {
        return timePosted;
    }

    public void setTimePosted(Date timePosted) {
        this.timePosted = timePosted;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
}
