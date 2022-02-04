import com.rmi.ServerConf;
import com.rmi.server.Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class AppServer {
    public static void main(String[] args) throws RemoteException {
        ServerConf conf = new Server();
        UnicastRemoteObject.exportObject(conf,0);
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.rebind("rmi://methods",conf);
        System.out.printf("Server is ready and waiting");
    }
}
