import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Week {

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] schedule = {"1. Prepare to eat; \n2. Go to a friend; \n3. Do homework",
                "1. Go to university; \n2. Going for a friend's birthday", "1. Go to work; \n2. Go for a walk in the city",
                "1. Go to workout; \n2. Start cleaning in the room",
                "1. Get ready for the weekend", "1. Rest all day long; \n2. Prepare to eat",
                "1. Meet your friends and go for a walk; 2. \nGet ready for the start of the new week"};

        System.out.println("\nEnter 'close' for exit");

        while (true) {

            System.out.print("\nEnter a name for the day of the week to display the schedule:  ");

            Scanner scanData = new Scanner(System.in);
            String data = scanData.next();

            if (data.equalsIgnoreCase("close")) {
                exit(0);
            }

            int index;

            for (int i = 0; i < days.length; i++) {

                if (data.equalsIgnoreCase(days[i])) {

                    index = i;

                    System.out.println("Schedule for " + days[index]);
                    System.out.println(schedule[index]);
                    break;
                }

            }

        }

    }

}
