package Semana2.Viernes.Archivos;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream( "D:\\AZ-900-Certificacion\\LaunchX-Program\\01_Apuntes_JAVA\\hola.txt");
                    fos.write(65);
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

    }
}
