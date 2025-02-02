package dev.juancastro.list;

public class App {
    public static void main(String[] args) {
        WeekDayHandle weekDaysHandle = new WeekDayHandle();

        // Crear la lista
        weekDaysHandle.createList();
        System.out.println("Lista de días: " + weekDaysHandle.getDays());

        // Eliminar un día
        weekDaysHandle.deleteDay("Tuesday");
        System.out.println("Después de eliminar Tuesday: " + weekDaysHandle.getDays());

        // Verificar si un día existe
        boolean exists = weekDaysHandle.dayExists("Monday");
        System.out.println("¿Existe Monday? " + exists);

        // Ordenar la lista alfabéticamente
        weekDaysHandle.dayListSort();
        System.out.println("Lista ordenada: " + weekDaysHandle.getDays());

        // Vaciar la lista
        weekDaysHandle.emptyList();
        System.out.println("Lista vacía: " + weekDaysHandle.getDays());
    }
}