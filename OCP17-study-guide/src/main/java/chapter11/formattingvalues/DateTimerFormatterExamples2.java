package chapter11.formattingvalues;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimerFormatterExamples2 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);

        date.format(DateTimeFormatter.ISO_LOCAL_TIME); // RuntimeException

    }
}
