package sanq.example.templates.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: Sanq
 * Date: 26.03.14
 * Time: 10:45
 */
public interface MyRemote extends Remote{
        public String sayHello() throws RemoteException;

}
