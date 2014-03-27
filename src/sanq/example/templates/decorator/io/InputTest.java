package sanq.example.templates.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 12.03.14
 * Time: 13:00
 */
public class InputTest {
    public static void main(String[] args) {
     int c;
        try{
             InputStream in = new LowerCaseInputStream(
                                new BufferedInputStream(
                                    new FileInputStream("D:\\ConStrIfx.dat")
                                )
                              );
          while ((c = in.read())>=0){
              System.out.print((char)(c));
          }
         in.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
