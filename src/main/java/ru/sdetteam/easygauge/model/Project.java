package ru.sdetteam.easygauge.model;

import lombok.Data;

@Data
public class Project {

    private Integer id;
    private String name;
    private String status;
    private Boolean isEnabled;
    private String viewState;
    private String accessMin;
    private String description;
    private Integer categoryId;
    private String inheritGlobal;
}
