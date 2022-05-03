package Semana2.Viernes.Archivos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream ("D:\\AZ-900-Certificacion\\LaunchX-Program\\01_Apuntes_JAVA\\magia.txt");
        BufferedInputStream bin = new BufferedInputStream(fis);

        int i;
        while ((i=bin.read())!=-1){
            System.out.println((char)i);
        }
        bin.close();
        fis.close();
    }
}
