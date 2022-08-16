package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represent a package that read csv file
 */
public class readCSV {
    /**
     * This method will read data from a cvs file and return as a list
     */
    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Could not read file");
            throw new RuntimeException(e);
        }
        return data;
    }
}