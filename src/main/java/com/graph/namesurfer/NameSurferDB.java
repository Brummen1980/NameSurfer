package com.graph.namesurfer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class NameSurferDB {
    private static NameSurferDB Data;

    static {
        try { Data = new NameSurferDB(null); }
        catch (IOException e) { throw new RuntimeException(e); }
    }

    public static NameSurferDB getData() { return  Data; }

    private String FileName = "";
    private Hashtable<String, NameDataEntre> NSEList = new Hashtable<>();
    public NameDataEntre getNDE(String Name){ return NSEList.get(Name); }
    private NameSurferDB (String fileName) throws IOException {
        if (fileName == null || fileName.isEmpty()) fileName = "assets/names-data.txt";
        FileName = fileName;
        ReadSourseFile();
    }


    private void ReadSourseFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FileName));
        try {
            String str;
            while ((str = br.readLine()) != null){
                NameDataEntre nde = new NameDataEntre(str);
                NSEList.put(nde.getName(), nde);
            }
        }
        finally {
            br.close();
        }




    }
}
