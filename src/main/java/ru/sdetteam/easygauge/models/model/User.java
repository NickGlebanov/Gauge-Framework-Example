package ru.sdetteam.easygauge.models.model;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String username;
    private String realname;
    private String email;
    private String password;
    private Boolean isEnabled;
    private Boolean isProtected;
    private Integer accessLevel;
    private Integer loginCount;
    private Integer lostPasswordRequestCount;
    private Integer failedLoginCount;
    private String cookieString;
    private Integer lastVisit;
    private Integer dateCreated;


}
