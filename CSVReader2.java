import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVReader2 {
    public static void main (String[] args)  {
        String path = "C:\\Users\\Platorg\\IdeaProjects\\MFP\\FL_insurance_sample.csv";
        try {
            Reader br = new FileReader(path);
            Iterable<CSVRecord> records = CSVFormat
                    .newFormat(',')
                    .withFirstRecordAsHeader()
                    .parse(br);
            for (CSVRecord record : records) {
                String policyId = record.get("policyID");
                String statecode = record.get("statecode");
                System.out.println(" policyID " + policyId  + " statecode " + statecode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
