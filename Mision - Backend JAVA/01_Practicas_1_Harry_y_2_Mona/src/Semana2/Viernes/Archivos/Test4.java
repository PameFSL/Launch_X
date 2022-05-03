package Semana2.Viernes.Archivos;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis =
                    new FileInputStream("D:\\AZ-900-Certificacion\\LaunchX-Program\\01_Apuntes_JAVA\\magia.txt");
            int i = 0;
            while ((i= fis.read())!=-1) {
                System.out.println((char) i);
            }
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
