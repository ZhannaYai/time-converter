import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeConverter {
    // Convert epoch seconds to LocalDateTime
    public static LocalDateTime epochSecondsToLocalDateTime(long epochSeconds) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(epochSeconds), ZoneId.systemDefault());
    }

    // Convert LocalDateTime to epoch seconds
    public static long localDateTimeToEpochSeconds(LocalDateTime localDateTime) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return zonedDateTime.toEpochSecond();
    }

    // Convert epoch seconds to normal time in a specific time zone
    public static LocalDateTime epochSecondsToTimezone(long epochSeconds, String timeZoneId) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(epochSeconds), ZoneId.of(timeZoneId));
    }

    // Convert normal time in a specific time zone to epoch seconds
    public static long timezoneToLocalDateTimeToEpochSeconds(LocalDateTime localDateTime, String timeZoneId) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of(timeZoneId));
        return zonedDateTime.toEpochSecond();
    }
}
