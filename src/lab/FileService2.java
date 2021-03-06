package lab;

import ioexamples.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileService2 {

    private File file;
    private BufferedReader reader;
    private PrintWriter writer;

    public void writeFile(File file, List<String> data, boolean append) throws IOException {

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));

            for (String s : data) {
                writer.println(s);
            }
        } catch (FileNotFoundException fnfe) {
            throw fnfe;
        } catch (IOException ioe){
            throw ioe;
        } catch(NullPointerException npo){
            throw npo;
        } finally {
            if(writer != null) writer.close();
        }
        
    }

    public List<String> readFile(File file) throws FileNotFoundException, IOException {
        reader = new BufferedReader(new FileReader(file));

        List<String> lineList = new ArrayList();
        String line = reader.readLine();
        
        
        //inner loop
        /*
        looop over four lines and store it all as a string
        //outer loop
        loop over all lines
        */
        
        int lineCount = 0;
        while(line != null){
            while (lineCount<3){
            line += reader.readLine() + " ";
            lineCount++;
        }
            lineList.add(line);
        }
        
        

//        try {
//            while (line != null) {
//                lineList.add(line);
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (FileNotFoundException fnfe) {
//            throw fnfe;
//        } catch (IOException ioe) {
//            throw ioe;
//        } finally {
//            {
//                if (reader != null) {
//                    reader.close();
//                }
//            }
//
//        }

        return lineList;
    }

}
            
        

