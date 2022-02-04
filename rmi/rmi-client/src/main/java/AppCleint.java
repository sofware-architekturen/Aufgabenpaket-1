import com.rmi.ServerConf;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;

public class AppCleint {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry();
        ServerConf conf = (ServerConf) registry.lookup("rmi://methods");

        System.out.println("Datum: " + conf.getDateAndTime(Locale.GERMAN));
        System.out.println("Betriebssystem:" + conf.getOperatingSystem());
        System.out.println("Java version: " + conf.getJavaVersion());
    }
}
