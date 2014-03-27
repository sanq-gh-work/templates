import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pospelov
 * Date: 19.04.13
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */
    public class StaticInitializationTime {
    int i;
    public StaticInitializationTime() {
        i= C.value();
    }

    public static class C {
            static int i = value();
            static int value() {
                System.out.println("C.i initialized");
                return 1;
            }
        }
    }
