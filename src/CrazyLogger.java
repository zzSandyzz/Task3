import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {
    StringBuilder journal = new StringBuilder();

    public void WriteMessage() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm");

        String localDateTime = LocalDateTime.now().format(f);

        journal.append(localDateTime);

        journal.append(" - ");

        journal.append(message);

        journal.append("\n");

    }

    public void findMessage(String message) {
        String journalStr = journal.toString();
        if (journalStr.indexOf(message) == -1) {
            System.out.println("No message found!");
            return;
        } else {
            String[] arr = journalStr.split("\n");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].indexOf(message) != -1) System.out.println(arr[i]);
            }
        }
    }
}
