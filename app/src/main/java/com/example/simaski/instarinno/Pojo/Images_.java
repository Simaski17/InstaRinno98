
package com.example.simaski.instarinno.Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Images_ {

    @SerializedName("low_resolution")
    @Expose
    private LowResolution__ lowResolution;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail_ thumbnail;
    @SerializedName("standard_resolution")
    @Expose
    private StandardResolution__ standardResolution;

    /**
     * 
     * @return
     *     The lowResolution
     */
    public LowResolution__ getLowResolution() {
        return lowResolution;
    }

    /**
     * 
     * @param lowResolution
     *     The low_resolution
     */
    public void setLowResolution(LowResolution__ lowResolution) {
        this.lowResolution = lowResolution;
    }

    /**
     * 
     * @return
     *     The thumbnail
     */
    public Thumbnail_ getThumbnail() {
        return thumbnail;
    }

    /**
     * 
     * @param thumbnail
     *     The thumbnail
     */
    public void setThumbnail(Thumbnail_ thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 
     * @return
     *     The standardResolution
     */
    public StandardResolution__ getStandardResolution() {
        return standardResolution;
    }

    /**
     * 
     * @param standardResolution
     *     The standard_resolution
     */
    public void setStandardResolution(StandardResolution__ standardResolution) {
        this.standardResolution = standardResolution;
    }

}
