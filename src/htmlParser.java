import java.io.*;


public class htmlParser {

    public StringBuilder getString() throws IOException {

        InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\Users\\Java.SE.03.Information handling_task_attachment.html"), "windows-1251");
        int i;
        StringBuilder parseResult = new StringBuilder();

        while ((i = reader.read()) != -1) {
            parseResult.append((char) i);
        }


        return parseResult;
    }

    public void getReference(StringBuilder sb) {
        String text = sb.toString();

        String regex = "(?<=[a-z])\\.\\s+";
        String[] arr = text.split(regex);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].indexOf("(Рис. ") != -1) {
                System.out.println(arr[i]);
            }
        }


    }
}
