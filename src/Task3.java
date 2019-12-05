import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.*;

public class Task3 {


    public static void main(String... args) throws IOException {
        System.out.println("Let's log something");
        CrazyLogger logger = new CrazyLogger();
        try {
            logger.WriteMessage();
        } catch (IOException e) {
            System.out.println("unable to write a message");
            e.printStackTrace();
        }
        try {
            logger.WriteMessage();
        } catch (IOException e) {
            System.out.println("unable to write a message");
            e.printStackTrace();
        }
        try {
            logger.WriteMessage();
        } catch (IOException e) {
            System.out.println("unable to write a message");
            e.printStackTrace();
        }

        System.out.println(" Print here the message you want to find:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        logger.findMessage(message);
    }


    {
        System.out.println(" choose your language, enter RU or EN, выберите язык RU или EN");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String loc = "";


        try {
            loc = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Locale currentLocale;

        {
            if (loc.equals("EN")) {
                currentLocale = new Locale("en", "UK");
            } else {
                currentLocale = new Locale("ru", "RU");
            }


            ResourceBundle stats =
                    ResourceBundle.getBundle("StatsBundle", currentLocale);


            for (int i = 0; i < 3; i++) {
                System.out.println(stats.getObject(i + 1 + ""));
            }

            while (true) {
                System.out.println("which question do you want answered? На какой вопрос вы хотите получить ответ?");
                System.out.println("To exit enter Q. Для выхода введите Q");
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                String answer = "";


                try {
                    answer = read.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (answer.equals("Q")) {
                    break;
                } else {
                    System.out.println("");
                    System.out.println(stats.getObject((answer)) + " ");
                    System.out.print(stats.getObject(Integer.parseInt(answer) + 3 + ""));
                    System.out.println("");
                }


            }


        }
        htmlParser parser = new htmlParser();

        //parser.getReference(parser.getString());
    }
}