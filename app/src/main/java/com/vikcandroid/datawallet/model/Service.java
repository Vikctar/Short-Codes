package com.vikcandroid.datawallet.model;

/**
 * Created by android-dev on 4/24/17.
 */

public class Service {

    private String serviceName;
    private int thumbnailColor;

    public Service(String serviceName) {
        this.serviceName = serviceName;
    }

    public Service(String serviceName, int thumbnailColor) {
        this.serviceName = serviceName;
        this.thumbnailColor = thumbnailColor;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getThumbnailColor() {
        return thumbnailColor;
    }
}
