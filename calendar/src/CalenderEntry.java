public class CalenderEntry {
    String text;
    int month;
    int day;

    CalenderEntry(String text, int month, int day) {
        this.text = text;
        this.month = month;
        this.day = day;
    }

    boolean isValid() {
        if (this.month > 0 && this.month <= 12 && this.day > 0 && this.day <= 7) {
            return true;
        } else {
            return false;
        }
    }

    boolean inSameMonth(CalenderEntry entry) {
        if (this.month == entry.month) {
            return true;
        } else {
            return false;
        }
    }
    boolean onSameDay(CalenderEntry entry) {
        if (this.day == entry.day) {
            return true;
        } else {
            return false;
        }
    }

    boolean isBefore(CalenderEntry entry) {
        if (this.inSameMonth(entry)) {
            if (this.onSameDay(entry)){
                return false;
            } else if (this.day > entry.day) {
                return false;
            } else {
                return true;
            }
        } else if (this.month > entry.month) {
            return false;
        } else {
            return true;
        }
    }

    int daysLeft(int month, int day) {
        if (this.isBefore(new CalenderEntry("", 10, 1))) {
            return 0;
        } else {
            int monthDiff = (this.month - month) * 28;
            int dayDiff = this.day - day;
            return monthDiff + dayDiff;
        }
    }
}
