package ru.sdetteam.easygauge.model;

import lombok.Data;

@Data
public class Tag {

    private Integer id;
    private User userId;
    private String name;
    private String description;
}
