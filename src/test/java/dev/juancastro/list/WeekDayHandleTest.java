package dev.juancastro.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Collections;
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

        Boolean exists = weekDaysHandle.dayExists(day);

        assertThat(exists, is(true));


    }

    @Test
    @DisplayName("comprueba si la lista se ordena alfabeticamente")
    void testIfDayListSort_returnListSorted() {

        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        weekDaysHandle.createList();

        weekDaysHandle.dayListSort();


        List<String> sortedList = weekDaysHandle.getDays();
        List<String> manuallySortedList = new ArrayList<>(sortedList);
        Collections.sort(manuallySortedList);
        assertThat(sortedList, equalTo(manuallySortedList));
    }

    @Test
    @DisplayName("comprueba que la lista se vacie")
    void testIfEmptyList_returnAEmptyList() {

        WeekDayHandle weekDaysHandle = new WeekDayHandle();
        weekDaysHandle.createList();
        
        weekDaysHandle.emptyList();
        List<String> listEmpty = weekDaysHandle.getDays();

        assertThat(listEmpty, is(empty()));

    }

    

    

    

    

    

    


}