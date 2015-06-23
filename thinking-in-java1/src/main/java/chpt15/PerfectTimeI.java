package chpt15;

//: PerfectTimeI.java
//The PerfectTime remote interface
import java.rmi.*;

interface PerfectTimeI extends Remote {
	long getPerfectTime() throws RemoteException;
} // /:~