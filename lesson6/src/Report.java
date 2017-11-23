public class Report {

    private String date;
    private String country;
    private String location;
    private String event;
    private String extra;

    @Override
    public String toString() {
        return "Report: " +
                "date='" + date + '\'' +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                ", event='" + event + '\'' +
                ", extra='" + extra + '\'' +
                '}' + "\n";
    }

    public Report(String date, String country, String location, String event, String extra) {
        this.date = date;
        this.country = country;
        this.location = location;
        this.event = event;
        this.extra = extra;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
