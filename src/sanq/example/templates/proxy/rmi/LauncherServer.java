package sanq.example.templates.proxy.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 26.03.14
 * Time: 11:01
 */
public class LauncherServer {
    public static void main(String[] args) {
        try{

            String serviceName  = "RemoteHello";
            MyRemote service  = new MyRemoteImpl();
            Naming.rebind(serviceName, service);
            System.out.println("RMI service '" + serviceName + "'  started successfully...");

        }catch (Exception ex){
            System.err.println("Error:: Registration in RMI registry failure: " + ex.getMessage());
        }
    }
}
