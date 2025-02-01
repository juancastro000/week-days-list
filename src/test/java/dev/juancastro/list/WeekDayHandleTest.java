package dev.juancastro.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class WeekDayHandleTest {

    @Test
    @DisplayName ("comprueba si se crea una lista con los 7 dias de la semana")
    void testIfcreateDaysList_ReturnTrue() {
        //given
        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        //when
        weekDaysHandle.createList();
        List<String> weekDays = weekDaysHandle.getDays();
        //then

        assertThat(weekDaysHandle,instanceOf(WeekDayHandle.class));
        assertThat(weekDays, contains("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        assertThat(weekDays, hasSize(7));
    }

    @Test
    @DisplayName("comprueba si se retorna el largo de la lista")
    void testIfGetSizeList_ReturnListSize() {

        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        List<String> weekDays = weekDaysHandle.getDays();
        weekDaysHandle.createList();


 
        int sizeList = weekDaysHandle.getSizeList();

        assertThat(sizeList, is(weekDays.size()));

    }

    @Test
    @DisplayName("comprueba si se elimina el dia introducido de la lista")
    void testIfDeleteDay_ReturnTrue() {

        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        String day = "Tuesday";
        weekDaysHandle.createList();

        weekDaysHandle.deleteDay(day);
        List<String> weekDays = weekDaysHandle.getDays();
    

        assertThat(weekDays,not(hasItem(day)) );



    }

    @Test
    @DisplayName("comprueba si se retorna el dia solicitado")
    void testIfGetSpecificDay_ReturnASpecificDay() {

        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        String day = "Tuesday";
        weekDaysHandle.createList();


        String specificDay = weekDaysHandle.getSpecificDay(day);
        
        assertThat(specificDay, is(day));
        
    }

    @Test
    @DisplayName("Comprueba si el dia ingresado existe en la lista")
    void testIfDayExists_ReturnTrue() {
        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        String day = "Tuesday";
        weekDaysHandle.createList();

        Boolean exists = weekDaysHandle.dayExists();

        assertThat(exists, is(false));


    }

    

    

    

    


}