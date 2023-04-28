package com.example.day22project2;

public class User {

   private String name;
    private String lastMsg;
    private String lastMsgTime;
    private String phoneNumber;
    private int picId;


    public User(String name, String lastMsg, String lastMsgTime, String phoneNumber, int picId) {
        this.name = name;
        this.lastMsg = lastMsg;
        this.lastMsgTime = lastMsgTime;
        this.phoneNumber = phoneNumber;
        this.picId = picId;
    }




    public String getName() {
        return name;
    }

    public String getLastMsg() {
        return lastMsg;
    }

    public String getLastMsgTime() {
        return lastMsgTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPicId() {
        return picId;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastMsg='" + lastMsg + '\'' +
                ", lastMsgTime='" + lastMsgTime + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", picId=" + picId +
                '}';
    }

}
