package com.example.imgstreamproject.api.imgur.data.model;

import java.io.Serializable;
import java.util.List;

/**
 * Conversation
 * The base model for a conversation.
 * Example URL: https://api.imgur.com/3/conversations
 * <p>
 * More info: https://api.imgur.com/models/conversation
 */
public class Conversation extends ImgurDataModel {

    private Integer id;
    private String last_message_preview;
    private Integer datetime;
    private Integer with_account_id;
    private String with_account;
    private Integer message_count;
    //    TODO Check messages. Exact format is Array of Messages. See: https://api.imgur.com/models/conversation
    private List<Message> messages;
    private Boolean done;
    private Integer page;

    /**
     * @return id - Conversation ID.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id Conversation ID.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return last_message_preview - Preview of the last message.
     */
    public String getLast_message_preview() {
        return last_message_preview;
    }

    /**
     * @param last_message_preview Preview of the last message.
     */
    public void setLast_message_preview(String last_message_preview) {
        this.last_message_preview = last_message_preview;
    }

    /**
     * @return datetime - Time of last sent message, epoch time.
     */
    public Integer getDatetime() {
        return datetime;
    }

    /**
     * @param datetime Time of last sent message, epoch time.
     */
    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    /**
     * @return with_account_id - Account ID of the other user in conversation.
     */
    public Integer getWith_account_id() {
        return with_account_id;
    }

    /**
     * @param with_account_id Account ID of the other user in conversation.
     */
    public void setWith_account_id(Integer with_account_id) {
        this.with_account_id = with_account_id;
    }

    /**
     * @return with_account - Account username of the other user in conversation.
     */
    public String getWith_account() {
        return with_account;
    }

    /**
     * @param with_account Account username of the other user in conversation.
     */
    public void setWith_account(String with_account) {
        this.with_account = with_account;
    }

    /**
     * @return message_count - Total number of messages in the conversation.
     */
    public Integer getMessage_count() {
        return message_count;
    }

    /**
     * @param message_count Total number of messages in the conversation.
     */
    public void setMessage_count(Integer message_count) {
        this.message_count = message_count;
    }

    /**
     * @return messages - OPTIONAL: (only available when requesting a specific conversation) Reverse sorted such that most recent message is at the end of the array.
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * @param messages OPTIONAL: (only available when requesting a specific conversation) Reverse sorted such that most recent message is at the end of the array.
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    /**
     * @return done - OPTIONAL: (only available when requesting a specific conversation) Flag to indicate whether you've reached the beginning of the thread.
     */
    public Boolean getDone() {
        return done;
    }

    /**
     * @param done OPTIONAL: (only available when requesting a specific conversation) Flag to indicate whether you've reached the beginning of the thread.
     */
    public void setDone(Boolean done) {
        this.done = done;
    }

    /**
     * @return page - OPTIONAL: (only available when requesting a specific conversation) Number of the next page.
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page OPTIONAL: (only available when requesting a specific conversation) Number of the next page.
     */
    public void setPage(Integer page) {
        this.page = page;
    }
}
