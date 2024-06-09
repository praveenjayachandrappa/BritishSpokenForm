package org.example;

import java.time.LocalTime;

public class BritishSpokenTime {

        /**
         * Converts a given LocalTime to its British spoken form.
         *
         * @param time the LocalTime to convert
         * @return the British spoken form of the time
         */
        public static String getBritishSpokenTime(LocalTime time) {
            int hour = time.getHour();
            int minute = time.getMinute();

            // Special cases for midnight and noon
            if (hour == 0 && minute == 0) {
                return "midnight";
            }
            if (hour == 12 && minute == 0) {
                return "noon";
            }

            // Array of spoken hour names
            String[] hourNames = {
                    "twelve", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "ten", "eleven", "twelve"
            };

            // Determine the spoken hour and the next hour
            String spokenHour = hourNames[hour % 12 == 0 ? 12 : hour % 12];
            String nextHour = hourNames[(hour + 1) % 12 == 0 ? 12 : (hour + 1) % 12];

            // Generate spoken form based on the minute value
            if (minute == 0) {
                return spokenHour + " o'clock";
            }
            if (minute == 15) {
                return "quarter past " + spokenHour;
            }
            if (minute == 30) {
                return "half past " + spokenHour;
            }
            if (minute == 45) {
                return "quarter to " + nextHour;
            }
            if (minute < 30) {
                return minute + " past " + spokenHour;
            }
            return (60 - minute) + " to " + nextHour;
        }
    }
