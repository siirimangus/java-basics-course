package fileoperations;

import java.util.List;

public class BusTime {
    private Integer hour;
    private List<Integer> minutes;

    public BusTime(Integer hour, List<Integer> minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Hour: " + hour + ", minutes: " + minutes.toString();
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public List<Integer> getMinutes() {
        return minutes;
    }

    public void setMinutes(List<Integer> minutes) {
        this.minutes = minutes;
    }
}
