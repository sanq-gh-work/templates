package sanq.example.templates.proxy.rmi;

import java.rmi.Naming;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 26.03.14
 * Time: 12:43
 */
public class LauncherClient {
    public static void main(String[] args) {
        LauncherClient.go();
    }

    private static void go() {
        try{

            MyRemote service  = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String res = service.sayHello();

            System.out.println("Client: Server response:  '" + res + "'");

        }
        catch (Exception ex){
            System.err.println("Error:: Client: get sayHello() - failure: " + ex.getMessage());

        }
    }
}
