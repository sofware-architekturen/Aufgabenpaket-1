package com.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Locale;

public interface ServerConf extends Remote {
    String getDateAndTime(Locale locale) throws RemoteException;
    String getOperatingSystem() throws RemoteException;
    String getJavaVersion() throws RemoteException;
}
