package Model;

/**
 * Created by joseph on 2/4/17.
 */

import javax.ejb.Local;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

/**
 * An item is a single object posted by user
 * **/
@Singleton
@Local
public class ItemModel {
    private int itemId;
    private String itemName;
    private String itemDescription;
    private String itemCategory;
    private int numBedrooms;
    private int numBathrooms;
    private boolean availabilityStatus;
    private boolean isPackingAvailable;
    private List<String> descriptiveImages=new ArrayList<String>();

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public boolean isPackingAvailable() {
        return isPackingAvailable;
    }

    public void setPackingAvailable(boolean packingAvailable) {
        isPackingAvailable = packingAvailable;
    }

    public List<String> getDescriptiveImages() {
        return descriptiveImages;
    }

    public void setDescriptiveImages(List<String> descriptiveImages) {
        this.descriptiveImages = descriptiveImages;
    }
}
