package basic.files;

import java.io.File;
import java.io.FileFilter;

public class RWFilesExamp {


    public static void main(String[] args) {



        File files = new File("D:\\personal\\songs");

        FileFilter fileFilter = new FileFilter() {

            @Override
            public boolean accept(File file) {
                if(file !=null){
                    return true;
                }
                return false;
            }
        };

        File [] allFiles = files.listFiles(fileFilter);

        for(File file : allFiles){
            String fileName[] =  file.getName().split(".");
            System.out.println('\"'+ "-l "+file.getName()+'\"'+",");
            fileName=null;
        }
    }
}
