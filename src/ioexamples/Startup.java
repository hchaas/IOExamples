
package ioexamples;

import ioexamples.FileService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Startup {
       public static void main(String[] args) throws IOException {
        File file = new File("src" + File.separatorChar + "contactList.txt");
        FileService fileService = new FileService();
        List<String> lineList = fileService.readFileWithLines(file);
        
           System.out.println(lineList.get(0));
        
//        for (int i=0; i<lineList.size(); i++){
//            //parsedResult holds each line of a contact in a string array
//            String [] parsedResult = lineList.get(i).split("\n");
//            //get name line
//            String name = parsedResult[0];
//            String[] parsedName = parsedResult[0].split(" ");
//            System.out.println(parsedName[(parsedName.length)-1] + ", ");
//            
//            String address = parsedResult[0];
//            String [] parsedAddress = parsedResult[0].split(" ");
//            System.out.println(parsedAddress[(parsedAddress.length)-1]);
//
//        }
//        String[] parsedResult = lineList.get(2).split("\n");
//           System.out.println(parsedResult[0]);
//           
//        String[] parsedLine = parsedResult[0].split(" ");
//           System.out.println(parsedLine[2]);
           
        
        
    }
}
