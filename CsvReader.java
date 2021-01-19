import java.io.BufferedReader;
import java.io.FileReader;


public class CsvReader {
    public static void main(String[] args) throws Exception {

        String csvFile = "C:\\Users\\Platorg\\IdeaProjects\\MFP\\something.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";


        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null)
        {

            //use comma as separator
            String[] food = line.split(cvsSplitBy);

            System.out.println("shit " + food[0].replace("\"","") + " , name " + food[1].replace("\"","") );

        }
    }
}