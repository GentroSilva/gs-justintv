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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Calendar;
import net.landora.justintv.GenericJacksonObject;
import net.landora.justintv.wrapper.JustinDateDeserializer;

/**
 *
 * @author bdickie
 */
public class JustinArchive extends GenericJacksonObject  {

    public JustinArchive() {
    }
    
    private String imageUrlMedium;
    private Calendar createdOn;
    private String title;
    private int videoRotation;
    private String filtered;
    private String streamName;
    private Calendar startTime;
    private double videoBitrate;
    private String broadcastId;
    private String broadcaster;
    private String filename;
    private long id;
    private Long parentArchiveId;
    private boolean saveForever;
    private Calendar updatedOn;
    private String audioCodec;
    private int broadcastPart;
    private boolean deletedByUser;
    private long fileSize;
    private String originName;
    private long userId;
    private String keyframes;
    private String tagList;
    private int length;
    private int servers;
    private String videoCodec;
    private String videoFileUrl;
    private boolean lastPart;
    private String description;
    private String kind;
    private String status;
    

    @JsonProperty("image_url_medium")
    public String getImageUrlMedium() {
        return imageUrlMedium;
    }

    public void setImageUrlMedium(String imageUrlMedium) {
        this.imageUrlMedium = imageUrlMedium;
    }

    @JsonProperty("created_on")
    @JsonDeserialize(using=JustinDateDeserializer.class)
    public Calendar getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Calendar createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("start_time")
    @JsonDeserialize(using=JustinDateDeserializer.class)
    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("video_rotation")
    public int getVideoRotation() {
        return videoRotation;
    }

    public void setVideoRotation(int videoRotation) {
        this.videoRotation = videoRotation;
    }

    public String getFiltered() {
        return filtered;
    }

    public void setFiltered(String filtered) {
        this.filtered = filtered;
    }

    @JsonProperty("stream_name")
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @JsonProperty("video_bitrate")
    public double getVideoBitrate() {
        return videoBitrate;
    }

    public void setVideoBitrate(double videoBitrate) {
        this.videoBitrate = videoBitrate;
    }

    @JsonProperty("broadcast_id")
    public String getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(String broadcastId) {
        this.broadcastId = broadcastId;
    }

    public String getBroadcaster() {
        return broadcaster;
    }

    public void setBroadcaster(String broadcaster) {
        this.broadcaster = broadcaster;
    }

    @JsonProperty("file_name")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("save_forever")
    public boolean isSaveForever() {
        return saveForever;
    }

    public void setSaveForever(boolean saveForever) {
        this.saveForever = saveForever;
    }

    @JsonProperty("updated_on")
    @JsonDeserialize(using=JustinDateDeserializer.class)
    public Calendar getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Calendar updatedOn) {
        this.updatedOn = updatedOn;
    }

    @JsonProperty("audio_codec")
    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    @JsonProperty("broadcast_part")
    public int getBroadcastPart() {
        return broadcastPart;
    }

    public void setBroadcastPart(int broadcastPart) {
        this.broadcastPart = broadcastPart;
    }

    @JsonProperty("deleted_by_user")
    public boolean isDeletedByUser() {
        return deletedByUser;
    }

    public void setDeletedByUser(boolean deletedByUser) {
        this.deletedByUser = deletedByUser;
    }

    @JsonProperty("file_size")
    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("origin_name")
    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    @JsonProperty("user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getKeyframes() {
        return keyframes;
    }

    public void setKeyframes(String keyframes) {
        this.keyframes = keyframes;
    }

    @JsonProperty("tag_list")
    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getServers() {
        return servers;
    }

    public void setServers(int servers) {
        this.servers = servers;
    }

    @JsonProperty("video_codec")
    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    @JsonProperty("video_file_url")
    public String getVideoFileUrl() {
        return videoFileUrl;
    }

    public void setVideoFileUrl(String videoFileUrl) {
        this.videoFileUrl = videoFileUrl;
    }

    @JsonProperty("last_part")
    public boolean isLastPart() {
        return lastPart;
    }

    public void setLastPart(boolean lastPart) {
        this.lastPart = lastPart;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("parent_archive_id")
    public Long getParentArchiveId() {
        return parentArchiveId;
    }

    public void setParentArchiveId(Long parentArchiveId) {
        this.parentArchiveId = parentArchiveId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
