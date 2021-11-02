package ru.sdetteam.easygauge.variables.enums;

public enum AccessUserLevelEnum {

    WATCHER(10, "наблюдатель"),
    AUTHOR(25, "автор"),
    EDITOR(40, "редактор"),
    DEV(55, "разработчик"),
    MANAGER(70, "руководитель"),
    ADMIN(90, "администратор");

    private final int code;
    private final String description;

    AccessUserLevelEnum(final int code, final String description){
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
