import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OpenCSVReader {
    public static final String SAMPLE_CSV_FILE_PATH = "users-with-header.csv";

    public static void main(String[] args) {
        try{
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);

            List<String[]> records = csvReader.readAll();
            for (String[] record : records){
                System.out.println("Name: " + record[0]);
                System.out.println("Email: "+ record[1]);
                System.out.println("Phone: "+ record[2]);
                System.out.println("Country: "+ record[3]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
