package Adapter;

import Model.Locations;
import Model.Messages;
import Model.UserModel;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sound.midi.SysexMessage;
import java.io.Serializable;
import java.util.*;

/**
 * Created by joseph on 2/5/17.
 */
@Named
@SessionScoped
public class TemplateBean implements Serializable{
    @EJB
    private Messages messages;
    private int notificationsCount=10;
    @EJB
    private UserModel userModel;
    @EJB
    private Locations locations;
    private String username;
    private String userOccupation;
    private Date dateJoined;
    private Map<String,String> data=new HashMap<String, String>();
    @PostConstruct
    public void init(){
        userModel.setFname("Joseph");
        userModel.setRegistrationDate(new Date(Date.parse("06/05/2016")));
        userModel.setOccupation("Programmer");
        userModel.setEmail("developergitch@outlook.com");
        userModel.setLname("Kabogo");
        userModel.setUserId(1119204);
        data=locations.getCities();


    }
    private int noOfMessages;
    private long timeSendOfLastMsg;
    //show notifications if number of notifications >0
    private boolean isShowNotifButton;
    //show message badge i number of messages >0
    private boolean isMessages;
    private String showMessages;
    //generate a map of items near a certain user that might be interesting <ads>
    private int interestingPropCount=7;

    public int getNoOfMessages() {
        noOfMessages=messages.messagesCount();
        return noOfMessages;
    }

    public long getTimeSendOfLastMsg() {
        timeSendOfLastMsg=messages.messageTimeSendOfLast();
        return timeSendOfLastMsg;
    }

    public int getNotificationsCount() {
        return notificationsCount;
    }

    public boolean isShowNotifButton() {
        //check if there is notification
        //holder
      return true;
    }

    public void setShowNotifButton(boolean showNotifButton) {
        isShowNotifButton = showNotifButton;
    }

    public boolean isMessages() {
        if(noOfMessages>0){
            return true;
        }else {
            return false;
        }
    }

    public void setMessages(boolean messages) {
        isMessages = messages;
    }

    public String getShowMessages() {
        if(noOfMessages>0){
            showMessages="true";
            return showMessages;
        }else {
            showMessages="false";
            return showMessages;
        }
    }

    public void setShowMessages(String showMessages) {
        this.showMessages = showMessages;
    }

    public int getInterestingPropCount() {
        return interestingPropCount;
    }

    public void setInterestingPropCount(int interestingPropCount) {
        this.interestingPropCount = interestingPropCount;
    }

    public String getUsername() {
        username=userModel.getFname()+" "+userModel.getLname();
        return username;
    }

    public String getUserOccupation() {
        userOccupation=userModel.getOccupation();
        return userOccupation;
    }

    public Date getDateJoined() {
        dateJoined=userModel.getRegistrationDate();
        return dateJoined;
    }

    public Map<String, String> getData() {
        return data;
    }
    private List<Nature> natures;

    public List<Nature> getNatures() {
        natures=new ArrayList<>();
        for (int i=1;i<=12;i++){
            Nature nature=new Nature();
            nature.setImg("nature"+i);
            nature.setName("nature"+i);
            nature.setDesc("Description for nature"+i+" More Desc");
            nature.setPrice(((i%2*i/2)+1)*1000);
            nature.setBed(2);
            natures.add(nature);
        }
        return natures;
    }

    public void setNatures(List<Nature> natures) {

      this.natures = natures;
    }
    private List<String> list=new ArrayList<>();

    public List<String> getList() {
       for(int i=1;i<=12;i++){
           list.add("nature"+i);
       }
        return list;
    }

    public void setList(List<String> list) {

        this.list = list;
    }
}
