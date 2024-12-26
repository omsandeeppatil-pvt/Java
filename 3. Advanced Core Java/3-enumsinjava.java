// Enum representing days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumsInJava {
    public static void main(String[] args) {
        // Accessing enum values
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Using enum in switch case
        switch (today) {
            case MONDAY:
                System.out.println("Start of the workweek!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            default:
                System.out.println("It's a regular day.");
        }

        // Looping through enum values
        System.out.println("All Days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
