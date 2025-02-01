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
        if (weekDays.contains(day)) {
            
            weekDays.remove(day);
        }
    }

    public String getSpecificDay(String day) {
        if (weekDays.contains(day)) {
            return day;
        } return("el dia no existe");
    }

}