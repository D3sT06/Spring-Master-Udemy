package com.sahin.spring_config.property_source;

public class Message {
    private String url;
    private int port;

    public Message(String url, int port) {
        this.url = url;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public String getUrl() {
        return url;
    }
}
