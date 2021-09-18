package ru.sdetteam.easygauge.enums;

public enum FilterEnum {

    ASSIGNED("assigned", "Ответственный"),
    REPORTED("reported", "Инициатор"),
    MONITORED("monitored", "Отслеживают"),
    UNASSIGNED("unassigned", "Неназначенный");

    private final String apiName;
    private final String webInterfaceName;


    FilterEnum(final String apiName, String webInterfaceName) {
        this.apiName = apiName;
        this.webInterfaceName = webInterfaceName;
    }

    public String getApiName() {
        return apiName;
    }

    public String getWebInterfaceName() {
        return webInterfaceName;
    }
}
