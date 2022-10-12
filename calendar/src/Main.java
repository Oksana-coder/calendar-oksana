public class Main {
    public static void main(String[] args) {
        CalenderEntry birthday = new CalenderEntry("Yaman's b-day", 10, 1);
        boolean validDate = birthday.isValid();
        System.out.println(validDate);

        System.out.println(birthday.month);

        CalenderEntry myBday = new CalenderEntry("Oksana's b-day", 7, 4);

        System.out.println(birthday.inSameMonth(myBday));

        System.out.println(birthday.isBefore(myBday));

        System.out.println(myBday.daysLeft(10, 1));

    }
}
