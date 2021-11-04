public class LeapYear {

    final static int gregorianCalendar = 1582;


    public static boolean isLeapYear(int year) {
        String isLeapYear = String.format("%d is a leap year!", year);
        String isNotLeapYear = String.format("%d is not a leap year!", year);


        if (year > gregorianCalendar) {

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        System.out.println(isLeapYear);
                        return true;
                    } else {
                        System.out.println(isNotLeapYear);
                        return false;
                    }
                } else {
                    System.out.println(isLeapYear);
                    return true;
                }
            }
            System.out.println(isNotLeapYear);
        }
        else {
            System.out.println("Year must be greater then 1582 - the first year of Gregorian calendar");
            return false;
        }

        return false;
    }


}

