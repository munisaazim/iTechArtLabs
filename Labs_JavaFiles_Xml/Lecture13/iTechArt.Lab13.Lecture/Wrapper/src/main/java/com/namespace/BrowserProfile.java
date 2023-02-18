package com.namespace;

public class BrowserProfile {
    public String BrowserName;
    public String DriverSettings;
    public String BrowserEnum(String name) {
        switch (name) {
            case "Chrome":
                return "Chrome";
            case "Opera":
                return "Opera";
        }
        return name;
    }
}
