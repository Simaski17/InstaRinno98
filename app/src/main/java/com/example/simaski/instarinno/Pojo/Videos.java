
package com.example.simaski.instarinno.Pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Videos {

    @SerializedName("low_resolution")
    @Expose
    private LowResolution_ lowResolution;
    @SerializedName("standard_resolution")
    @Expose
    private StandardResolution_ standardResolution;
    @SerializedName("users_in_photo")
    @Expose
    private Object usersInPhoto;
    @SerializedName("filter")
    @Expose
    private String filter;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("comments")
    @Expose
    private Comments_ comments;
    @SerializedName("caption")
    @Expose
    private Caption_ caption;
    @SerializedName("likes")
    @Expose
    private Likes_ likes;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("user")
    @Expose
    private User_ user;
    @SerializedName("created_time")
    @Expose
    private String createdTime;
    @SerializedName("images")
    @Expose
    private Images_ images;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("location")
    @Expose
    private Object location;

    /**
     * 
     * @return
     *     The lowResolution
     */
    public LowResolution_ getLowResolution() {
        return lowResolution;
    }

    /**
     * 
     * @param lowResolution
     *     The low_resolution
     */
    public void setLowResolution(LowResolution_ lowResolution) {
        this.lowResolution = lowResolution;
    }

    /**
     * 
     * @return
     *     The standardResolution
     */
    public StandardResolution_ getStandardResolution() {
        return standardResolution;
    }

    /**
     * 
     * @param standardResolution
     *     The standard_resolution
     */
    public void setStandardResolution(StandardResolution_ standardResolution) {
        this.standardResolution = standardResolution;
    }

    /**
     * 
     * @return
     *     The usersInPhoto
     */
    public Object getUsersInPhoto() {
        return usersInPhoto;
    }

    /**
     * 
     * @param usersInPhoto
     *     The users_in_photo
     */
    public void setUsersInPhoto(Object usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }

    /**
     * 
     * @return
     *     The filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * 
     * @param filter
     *     The filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The comments
     */
    public Comments_ getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    public void setComments(Comments_ comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public Caption_ getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(Caption_ caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The likes
     */
    public Likes_ getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    public void setLikes(Likes_ likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The user
     */
    public User_ getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User_ user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 
     * @param createdTime
     *     The created_time
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Images_ getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Images_ images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Object getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Object location) {
        this.location = location;
    }

}
