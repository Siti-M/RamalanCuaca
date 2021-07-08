package com.example.ramalancuaca;

public class Weather {

    private Long date;
    private String timeZone, desc, main;
    private  Double temp;
    private  String icon;

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Weather(Double temp, String icon) {
        this.temp = temp;
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public Weather(Long date, String timeZone, Double temp, String desc, String icon) {
        this.date = date;
        this.timeZone = timeZone;
        this.temp = temp;
        this.desc = desc;
        this.icon = icon;
    }
}
