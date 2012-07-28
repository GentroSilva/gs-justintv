/**
 * Copyright 2012 Blake Dickie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.landora.justintv.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.landora.justintv.GenericJacksonObject;

/**
 *
 * @author bdickie
 */
@JsonIgnoreProperties({"channel_text_color", "channel_link_color", "channel_column_color", "channel_background_color"})
public class JustinChannel extends GenericJacksonObject {
    private String subcategory;
    private String category;
    private long id;
    private String login;
    private String title;
    private String status;
    private boolean producer;
    private String categoryTitle;
    private String subcategoryTitle;
    private String about;
    private String channelBackgroundImageUrl;
    private boolean anonymousChattersAllowed;
    private String tags;
    private String language;
    private String description;
    private long viewsCount;
    private String channelUrl;
    private String embedCode;
    
    private String timezone;
    private boolean embedEnabled;
    private String channelHeaderImageUrl;
    
    
    private String screenCapUrlSmall;
    private String screenCapUrlMedium;
    private String screenCapUrlLarge;
    private String screenCapUrlHuge;
    
    private String imageUrlTiny;
    private String imageUrlSmall;
    private String imageUrlMedium;
    private String imageUrlLarge;
    private String imageUrlHuge;
    
    private String mature;

    public JustinChannel() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isProducer() {
        return producer;
    }

    public void setProducer(boolean producer) {
        this.producer = producer;
    }

    @JsonProperty("category_title")
    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    @JsonProperty("subcategory_title")
    public String getSubcategoryTitle() {
        return subcategoryTitle;
    }

    public void setSubcategoryTitle(String subcategoryTitle) {
        this.subcategoryTitle = subcategoryTitle;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @JsonProperty("screen_cap_url_small")
    public String getScreenCapUrlSmall() {
        return screenCapUrlSmall;
    }

    public void setScreenCapUrlSmall(String screenCapUrlSmall) {
        this.screenCapUrlSmall = screenCapUrlSmall;
    }

    @JsonProperty("screen_cap_url_medium")
    public String getScreenCapUrlMedium() {
        return screenCapUrlMedium;
    }

    public void setScreenCapUrlMedium(String screenCapUrlMedium) {
        this.screenCapUrlMedium = screenCapUrlMedium;
    }

    @JsonProperty("screen_cap_url_large")
    public String getScreenCapUrlLarge() {
        return screenCapUrlLarge;
    }

    public void setScreenCapUrlLarge(String screenCapUrlLarge) {
        this.screenCapUrlLarge = screenCapUrlLarge;
    }

    @JsonProperty("screen_cap_url_huge")
    public String getScreenCapUrlHuge() {
        return screenCapUrlHuge;
    }

    public void setScreenCapUrlHuge(String screenCapUrlHuge) {
        this.screenCapUrlHuge = screenCapUrlHuge;
    }

    @JsonProperty("image_url_tiny")
    public String getImageUrlTiny() {
        return imageUrlTiny;
    }

    public void setImageUrlTiny(String imageUrlTiny) {
        this.imageUrlTiny = imageUrlTiny;
    }

    @JsonProperty("image_url_small")
    public String getImageUrlSmall() {
        return imageUrlSmall;
    }

    public void setImageUrlSmall(String imageUrlSmall) {
        this.imageUrlSmall = imageUrlSmall;
    }

    @JsonProperty("image_url_medium")
    public String getImageUrlMedium() {
        return imageUrlMedium;
    }

    public void setImageUrlMedium(String imageUrlMedium) {
        this.imageUrlMedium = imageUrlMedium;
    }

    @JsonProperty("image_url_large")
    public String getImageUrlLarge() {
        return imageUrlLarge;
    }

    public void setImageUrlLarge(String imageUrlLarge) {
        this.imageUrlLarge = imageUrlLarge;
    }

    @JsonProperty("image_url_huge")
    public String getImageUrlHuge() {
        return imageUrlHuge;
    }

    public void setImageUrlHuge(String imageUrlHuge) {
        this.imageUrlHuge = imageUrlHuge;
    }

    @JsonProperty("channel_background_image_url")
    public String getChannelBackgroundImageUrl() {
        return channelBackgroundImageUrl;
    }

    public void setChannelBackgroundImageUrl(String channelBackgroundImageUrl) {
        this.channelBackgroundImageUrl = channelBackgroundImageUrl;
    }

    @JsonProperty("anonymous_chatters_allowed")
    public boolean isAnonymousChattersAllowed() {
        return anonymousChattersAllowed;
    }

    public void setAnonymousChattersAllowed(boolean anonymousChattersAllowed) {
        this.anonymousChattersAllowed = anonymousChattersAllowed;
    }

    public String getMature() {
        return mature;
    }

    public void setMature(String mature) {
        this.mature = mature;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("embed_enabled")
    public boolean isEmbedEnabled() {
        return embedEnabled;
    }

    public void setEmbedEnabled(boolean embedEnabled) {
        this.embedEnabled = embedEnabled;
    }

    @JsonProperty("channel_header_image_url")
    public String getChannelHeaderImageUrl() {
        return channelHeaderImageUrl;
    }

    public void setChannelHeaderImageUrl(String channelHeaderImageUrl) {
        this.channelHeaderImageUrl = channelHeaderImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("views_count")
    public long getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(long viewsCount) {
        this.viewsCount = viewsCount;
    }

    @JsonProperty("channel_url")
    public String getChannelUrl() {
        return channelUrl;
    }

    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl;
    }

    @JsonProperty("embed_code")
    public String getEmbedCode() {
        return embedCode;
    }

    public void setEmbedCode(String embedCode) {
        this.embedCode = embedCode;
    }
    
    
}
