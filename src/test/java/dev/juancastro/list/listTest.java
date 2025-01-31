package dev.juancastro.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.ArrayList;

public class listTest {

    @Test
    @DisplayName ("comprueba si se crea una lista con los 7 dias de la semana")
    void testIfcreateDaysList_ReturnTrue() {
        //given
        list emptyList = new list();
        //when
        List<String> weekDays = emptyList.createList();
        //then
        assertThat(emptyList,instanceOf(list.class));
        assertThat(weekDays, contains("monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        assertThat(weekDays, hasSize(7));
    }

    


}
