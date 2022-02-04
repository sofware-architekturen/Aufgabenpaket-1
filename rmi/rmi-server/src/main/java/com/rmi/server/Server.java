package com.rmi.server;

import com.rmi.ServerConf;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Server implements ServerConf {
    @Override
    public String getDateAndTime(Locale locale) throws RemoteException {
        return DateFormat.getDateTimeInstance(
                DateFormat.LONG,
                DateFormat.LONG,locale).format( new Date() );

    }

    @Override
    public String getOperatingSystem() throws RemoteException {
        return System.getProperty("os.name");
    }

    @Override
    public String getJavaVersion() throws RemoteException {
        return System.getProperty("java.version");
    }
}
