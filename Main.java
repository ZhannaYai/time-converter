import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long epochSeconds = 1620909642L;
        System.out.print("Enter time zone ID: ");
        String timeZoneId = scanner.nextLine();

        LocalDateTime dateTime = TimeConverter.epochSecondsToTimezone(epochSeconds, timeZoneId);
        System.out.println("Epoch seconds to LocalDateTime (in " + timeZoneId + "): " + dateTime);

        LocalDateTime localDateTime = LocalDateTime.of(2021, 5, 13, 12, 0, 0);
        System.out.print("Enter time zone ID: ");
        timeZoneId = scanner.nextLine();

        long convertedEpochSeconds = TimeConverter.timezoneToLocalDateTimeToEpochSeconds(localDateTime, timeZoneId);
        System.out.println("LocalDateTime to epoch seconds (in " + timeZoneId + "): " + convertedEpochSeconds);
    }
}
