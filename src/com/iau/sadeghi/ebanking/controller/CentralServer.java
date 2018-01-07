package com.iau.sadeghi.ebanking.controller;

import com.iau.sadeghi.ebanking.model.DBServer;

import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class CentralServer extends UnicastRemoteObject implements ICentralServer
{
    private static CentralServer centralServer = null;
    //private static Logger log = Logger.getLogger(CentralServer.class.getName());

    public CentralServer() throws Exception
    {
    }

    private void distribute(String[] args) throws Exception
    {
        String name = args[0];
        int port = Integer.parseInt(args[1]);
        java.rmi.registry.LocateRegistry.createRegistry(port);
        Naming.rebind(name, this);
        System.out.println(name+" is Up on Registry Port #"+port);
    }

    public static void main(String[] args)
    {
        try
        {
            //log.info("CentralServer Started");

            String[] arguments = {"DBSERVER", "1099"};
            DBServer.main(arguments);


            centralServer = new CentralServer();
            arguments[0] = "CENTRALSERVER";
            arguments[1] = "1100";
            centralServer.distribute(arguments);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    private void initialize()
    {

    }
}