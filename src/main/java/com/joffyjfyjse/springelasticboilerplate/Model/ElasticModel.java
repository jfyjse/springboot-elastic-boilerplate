package com.joffyjfyjse.springelasticboilerplate.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "mqtt-data-test-09")
public class ElasticModel {
    @Id
    public String id;
    @Field(type = FieldType.Integer)
    public int major;

    @Field(type = FieldType.Integer)
    public int minor;

    @Field(type = FieldType.Integer)
    public int rssi;

    @Field(type = FieldType.Text)
    public String uuid;

    @Field(type = FieldType.Text)
    public String topic;
    @JsonIgnore
    @Field(type = FieldType.Text)
    public String DateTime;

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
