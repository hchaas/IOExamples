/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.io.File;
import java.util.List;
import junit.framework.TestCase;

public class FileServiceTest extends TestCase {
    
    public FileServiceTest(String testName) {
        super(testName);
    }


    /**
     * Test of readFile method, of class FileService.
     */
    public void testReadFile() throws Exception {
        File file = new File("src" + File.separatorChar + "test.txt");
        
        FileService fileService = new FileService();
        List<String> lineList = fileService.readFile(file);
        int linesExpected = 3;
        int linesActual = lineList.size();
        
        assertEquals(linesExpected, linesActual);
    }
    
}
