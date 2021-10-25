import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_LeapYear {

    @ParameterizedTest
    @MethodSource("numbers")
    public void check_If_It_Is_LeapYear(boolean expected, int year) {

        assertEquals(expected, LeapYear.isLeapYear(year));

    }

    public static Stream numbers() {
        return Stream.of(
                Arguments.of(true, 2024),
                Arguments.of(true, 2000),
                Arguments.of(false, 1800),
                Arguments.of(false, 1700),
                Arguments.of(false, 2021),
                Arguments.of(true, 1864),
                Arguments.of(false, 1705),
                Arguments.of(true, 1584),
                Arguments.of(true, 1684),
                Arguments.of(false, 1582),
                Arguments.of(false, -1600),
                Arguments.of(true, "2024")

        );

    }

    @Test
    public void Year_Divided_By_Four_Is_A_Leap_Year() {
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void Year_Divided_By_Four_Hundred_Is_A_Leap_Year() {
        assertTrue(LeapYear.isLeapYear(2000));
    }


    @Test
    public void Year_Divided_By_Hundred_Is_Not_A_Leap_Year() {
        assertEquals(false,LeapYear.isLeapYear(2001));
    }



    @Test
    public void Year_Not_Divided_By_Four_Is_Not_A_Leap_Year() {
        assertEquals(false, LeapYear.isLeapYear(1700));

    }

     @Test
    public void Year_Divided_By_Hundred_But_Not_Four_Hundred_Is_Not_A_LeapYear() {
        assertEquals(false, LeapYear.isLeapYear(1800));

     }



}
