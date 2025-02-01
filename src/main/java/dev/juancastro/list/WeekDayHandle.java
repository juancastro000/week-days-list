package dev.juancastro.list;

import java.util.List;
import java.util.ArrayList;

public class WeekDayHandle {

    public List<String> weekDays;

    public WeekDayHandle() {
        this.weekDays = new ArrayList<>();
    }

    public void createList() {
        weekDays.addAll(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    public List<String> getDays() {
        return weekDays;
    }

    public int getSizeList() {

        return(weekDays.size());

    }

    public void deleteDay(String day) {
        weekDays.remove(day);
    }

}