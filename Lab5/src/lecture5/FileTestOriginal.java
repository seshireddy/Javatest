package lecture5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 *
 * @author sdn
 */
public class FileTestOriginal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("src/people.txt");
        BufferedReader reader = Files.newBufferedReader(file);
        String line = reader.readLine();
        while (  line != null  ) {
            String [] lineSplit = line.split("\t");
            String name = lineSplit[0];
            boolean isMale = lineSplit[1].equals("Mr");            
            String [] dateArray = lineSplit[2].split("-");
            
            int day = Integer.valueOf(dateArray[0]);
            int year = Integer.valueOf(dateArray[2].trim());
            int month=0;
            switch (dateArray[1]) {
                case "Jan" : month = 1; break;
                case "Feb" : month = 2; break;
                case "Mar" : month = 3; break;
                case "Apr" : month = 4; break;
                case "May" : month = 5; break;
                case "Jun" : month = 6; break;
                case "Jul" : month = 7; break;
                case "Aug" : month = 8; break;
                case "Sep" : month = 9; break;
                case "Oct" : month = 10; break;
                case "Nov" : month = 11; break;
                case "Dec" : month = 12; break;
            }
            
            //turning a date of birth into an age
            int currentYear = LocalDate.now().getYear();
            int age = currentYear-year;
            if  (LocalDate.now().isBefore(LocalDate.of(currentYear, month, day))) 
                age--;

            System.out.println(new Person(name, age, isMale));
            line = reader.readLine();
        }
        reader.close();

    }

}
