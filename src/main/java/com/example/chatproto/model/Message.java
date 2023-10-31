package com.example.chatproto.model;

public class Message {

    private int id;
    private String guid;
    private String user;
    private String room;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(String content, String user, String room){
        this.content = content;
        this.user = user;
        this.room = room;
    }

    public Message(String content){
        this.content = content;
    }

    public Message(){

    }


//    @Override
//    public String toString() {
//        String output = "hola que tal como va todo ...";
//        //return "Message [content=" + content + "]";
//
//        return output;
//
//    }

}
