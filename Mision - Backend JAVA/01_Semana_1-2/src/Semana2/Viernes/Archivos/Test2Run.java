package Semana2.Viernes.Archivos;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable(){
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream("D:\\AZ-900-Certificacion\\LaunchX-Program\\01_Apuntes_JAVA\\magia2.txt");
                    String s = "Magia 2 !!! ";
                    byte b[] = s.getBytes();
                    fos.write(b);
                    fos.close();
                    System.out.println("Magia2 !!!");
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
    }
}
