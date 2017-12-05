package ioexamples;

import ioexamples.FileService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Startup {

    public static void main(String[] args) throws IOException {
        File file = new File("src" + File.separatorChar + "contactList.txt");
        FileService fileService = new FileService();
        List<String> lineList = fileService.readFile(file);
        List<Map> mapList = new ArrayList() ;
        String secondNameState = "";

        try {
            for (int i = 0; i < lineList.size(); i++) {

                int factor = 3 * i;
                String name = lineList.get(factor);
                String address1 = lineList.get(factor + 1);
                String address2 = lineList.get(factor + 2);

                Map<String, String> contactMap = new LinkedHashMap<>();
                contactMap.put("Name", lineList.get(factor));
                contactMap.put("Address1", lineList.get(factor + 1));
                contactMap.put("Address2", lineList.get(factor + 2));

//                System.out.println(contactMap.toString());
                String nameVar = contactMap.get("Name");
                String[] parsedName = nameVar.split(" ");
                String lastName = parsedName[parsedName.length-1];
                System.out.println(lastName);
                
                String zipVar = contactMap.get("Address2");
                String[] address2Var = zipVar.split(" ");
                String stateVar = address2Var[1];
                String zipCodeVar = address2Var[address2Var.length-1];
                System.out.println(zipCodeVar + "\n");
                
                mapList.add(contactMap);

                if(i==1){
                    secondNameState = nameVar + ", State: " + stateVar;
                }
            }
        } catch (IndexOutOfBoundsException iob) {
            System.out.println(iob.getMessage());
        }
        
        System.out.println(secondNameState);
        
    }

}
