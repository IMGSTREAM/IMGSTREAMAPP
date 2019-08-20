package com.example.imgstreamproject.Dto;

/**
 * Message
 * The base model for a message.
 *
 * More info: https://api.imgur.com/models/message
 */
class Message extends ImgurDataModel {

    private Integer id;
    private String from;
    private Integer account_id;
    private Integer sender_id;
    private String body;
    private Integer conversation_id;
    private Integer datetime;

    /**
     * @return id - The ID for the message.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The ID for the message.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return from - Account username of person sending the message.
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from Account username of person sending the message.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return account_id - The account ID of the person receiving the message.
     */
    public Integer getAccount_id() {
        return account_id;
    }

    /**
     * @param account_id The account ID of the person receiving the message.
     */
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    /**
     * @return sender_id - The account ID of the person who sent the message.
     */
    public Integer getSender_id() {
        return sender_id;
    }

    /**
     * @param sender_id The account ID of the person who sent the message.
     */
    public void setSender_id(Integer sender_id) {
        this.sender_id = sender_id;
    }

    /**
     * @return body - Text of the message.
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body Text of the message.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return conversation_id - ID for the overall conversation.
     */
    public Integer getConversation_id() {
        return conversation_id;
    }

    /**
     * @param conversation_id ID for the overall conversation.
     */
    public void setConversation_id(Integer conversation_id) {
        this.conversation_id = conversation_id;
    }

    /**
     * @return datetime - Time message was sent, epoch time
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Time message was sent, epoch time.
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }
}
