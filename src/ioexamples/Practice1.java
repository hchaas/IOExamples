
package ioexamples;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src" + File.separatorChar + "test.txt");
        FileService fileService = new FileService();
        List<String> lineList = fileService.readFile(file);
        
        for (String s : lineList){
            System.out.println(s);
        }
        
        lineList = Arrays.asList(
                "my pony has a first name", 
                "it's john jakob jingleheimerschmidt", 
                "lalalalalalalala"
        );
        
        fileService.writeFile(file, lineList, false);
    }
        
}
