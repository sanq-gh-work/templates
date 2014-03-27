package sanq.example.templates.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

    /**
     * Created with IntelliJ IDEA.
     * User: Sanq
     * Date: 26.03.14
     * Time: 10:50
     */
    public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
        protected MyRemoteImpl() throws RemoteException {
        }

        @Override
        public String sayHello() throws RemoteException {
            System.out.println( "Method call:: sayHello()");
            return "Server::  Hey!";
        }
    }
