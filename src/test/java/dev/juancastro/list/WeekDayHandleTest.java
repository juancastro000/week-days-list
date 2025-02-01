package dev.juancastro.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.ArrayList;

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
        assertThat(weekDays, contains("monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        assertThat(weekDays, hasSize(7));
    }

    


}