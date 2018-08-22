package webSocket;

import com.google.gson.Gson;

public class Message {
    private String from;
    private String to;
    private String action;
    private String handlerID;

    private String lampStatus;

    private String userName;
    private String userToken;

    public Message() {
        this.handlerID = String.valueOf(System.currentTimeMillis());
    }

    public String encode() {
        return new Gson().toJson(this);
    }

    Message decode(String s) {
        return new Gson().fromJson(s, Message.class);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public String getHandlerID() {
        return handlerID;
    }

    public String getLampStatus() {
        return lampStatus;
    }

    public void setLampStatus(String lampStatus) {
        this.lampStatus = lampStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
