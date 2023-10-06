package com.ByteStorm.ByteStormService.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "scores")
public class Scores {
    @Id
    @JsonProperty("_id")
    private String id;

    private String name;
    private Map<String, String> details;
    private Map<String, Byte> skills;
    private Map<String, Weapons> weapons;
}
