package com.example.imgstreamproject.api.imgur.data.model;

import java.util.List;

/**
 * GalleryProfile
 * The totals for a users gallery information.
 * Example URL: https://api.imgur.com/3/account/{username}/gallery_profile
 *
 * More info: https://api.imgur.com/models/gallery_profile
 */
public class GalleryProfile extends ImgurDataModel {

    private Integer total_gallery_comments;
    private Integer total_gallery_favorites;
    private Integer total_gallery_submissions;
    //    TODO Check trophies. Exact format is Array. See: https://api.imgur.com/models/gallery_profile
    private List<Trophy> trophies;

    /**
     * @return total_gallery_comments - Total number of comments the user has made in the gallery.
     */
    public Integer getTotal_gallery_comments() {
        return total_gallery_comments;
    }

    /**
     * @param total_gallery_comments Total number of comments the user has made in the gallery.
     */
    public void setTotal_gallery_comments(Integer total_gallery_comments) {
        this.total_gallery_comments = total_gallery_comments;
    }

    /**
     * @return total_gallery_favorites - Total number of items favorited by the user in the gallery.
     */
    public Integer getTotal_gallery_favorites() {
        return total_gallery_favorites;
    }

    /**
     * @param total_gallery_favorites Total number of items favorited by the user in the gallery.
     */
    public void setTotal_gallery_favorites(Integer total_gallery_favorites) {
        this.total_gallery_favorites = total_gallery_favorites;
    }

    /**
     * @return total_gallery_submissions - Total number of images submitted by the user.
     */
    public Integer getTotal_gallery_submissions() {
        return total_gallery_submissions;
    }

    /**
     * @param total_gallery_submissions Total number of images submitted by the user.
     */
    public void setTotal_gallery_submissions(Integer total_gallery_submissions) {
        this.total_gallery_submissions = total_gallery_submissions;
    }

    /**
     * @return trophies - An array of trophies that the user has.
     */
    public List<Trophy> getTrophies() {
        return trophies;
    }

    /**
     * @param trophies An array of trophies that the user has.
     */
    public void setTrophies(List<Trophy> trophies) {
        this.trophies = trophies;
    }

    /**
     * Trophy
     * Trophy Object Information.
     *
     * More info: https://api.imgur.com/models/gallery_profile
     */
    public class Trophy {

        private Integer id;
        private Integer name;
        private Integer name_clean;
        private Integer description;
        private Integer data;
        private Integer data_link;
        private Integer datetime;
        private Integer image;

        /**
         * @return id - The ID of the trophy, this is unique to each trophy.
         */
        public Integer getId() {
            return id;
        }

        /**
         * @param id The ID of the trophy, this is unique to each trophy.
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * @return name - The name of the trophy.
         */
        public Integer getName() {
            return name;
        }

        /**
         * @param name The name of the trophy.
         */
        public void setName(Integer name) {
            this.name = name;
        }

        /**
         * @return name_clean - Can be thought of as the ID of a trophy type.
         */
        public Integer getName_clean() {
            return name_clean;
        }

        /**
         * @param name_clean Can be thought of as the ID of a trophy type.
         */
        public void setName_clean(Integer name_clean) {
            this.name_clean = name_clean;
        }

        /**
         * @return description - A description of the trophy and how it was earned.
         */
        public Integer getDescription() {
            return description;
        }

        /**
         * @param description A description of the trophy and how it was earned.
         */
        public void setDescription(Integer description) {
            this.description = description;
        }

        /**
         * @return data - The ID of the image or the ID of the comment where the trophy was earned.
         */
        public Integer getData() {
            return data;
        }

        /**
         * @param data The ID of the image or the ID of the comment where the trophy was earned.
         */
        public void setData(Integer data) {
            this.data = data;
        }

        /**
         * @return data_link - A link to where the trophy was earned.
         */
        public Integer getData_link() {
            return data_link;
        }

        /**
         * @param data_link A link to where the trophy was earned.
         */
        public void setData_link(Integer data_link) {
            this.data_link = data_link;
        }

        /**
         * @return datetime - Date the trophy was earned, epoch time.
         */
        public Integer getDatetime() {
            return datetime;
        }

        /**
         * @param datetime Date the trophy was earned, epoch time.
         */
        public void setDatetime(Integer datetime) {
            this.datetime = datetime;
        }

        /**
         * @return image - URL of the image representing the trophy.
         */
        public Integer getImage() {
            return image;
        }

        /**
         * @param image URL of the image representing the trophy.
         */
        public void setImage(Integer image) {
            this.image = image;
        }
    }
}
