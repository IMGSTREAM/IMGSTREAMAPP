package com.example.imgstreamproject.api.imgur.data.model;

/**
 * Topic
 * The base model for a topic.
 * Example URL: https://api.imgur.com/3/topics/defaults
 * <p>
 * More info: https://api.imgur.com/models/topic
 */
public class Topic extends ImgurDataModel {

    private Integer id;
    private String name;
    private String description;
    private String css;
    private Boolean ephemeral;
    //    TODO Check items. Exact format is Gallery Image OR Gallery Album. See: https://api.imgur.com/models/topic
    private GalleryItem topPost;
    //    TODO Check items. Exact format is Images. See: https://api.imgur.com/models/topic
    private Image heroImage;
    private Boolean isHero;

    /**
     * @return id - ID of the topic.
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id ID of the topic.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name - Topic name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Topic name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return description - Description of the topic.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Description of the topic.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return css - CSS class used on website to style the ephemeral topic.
     */
    public String getCss() {
        return css;
    }

    /**
     * @param css CSS class used on website to style the ephemeral topic.
     */
    public void setCss(String css) {
        this.css = css;
    }

    /**
     * @return ephemeral - Whether it is an ephemeral (e.g. current events) topic.
     */
    public Boolean getEphemeral() {
        return ephemeral;
    }

    /**
     * @param ephemeral Whether it is an ephemeral (e.g. current events) topic.
     */
    public void setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * @return topPost - The top image in this topic.
     */
    public GalleryItem getTopPost() {
        return topPost;
    }

    /**
     * @param topPost The top image in this topic.
     */
    public void setTopPost(GalleryItem topPost) {
        this.topPost = topPost;
    }

    /**
     * @return heroImage - The current 'hero' image chosen by the Imgur community staff
     */
    public Image getHeroImage() {
        return heroImage;
    }

    /**
     * @param heroImage The current 'hero' image chosen by the Imgur community staff.
     */
    public void setHeroImage(Image heroImage) {
        this.heroImage = heroImage;
    }

    /**
     * @return isHero - Whether the topic's heroImage should be used as the overall hero image.
     */
    public Boolean getHero() {
        return isHero;
    }

    /**
     * @param isHero Whether the topic's heroImage should be used as the overall hero image.
     */
    public void setHero(Boolean hero) {
        isHero = hero;
    }
}
