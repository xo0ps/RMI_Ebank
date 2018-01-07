package com.iau.sadeghi.ebanking.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateUtils
{
    private static final SessionFactory mainSessionFactory;
    private static final SessionFactory backSessionFactory;
    private static ServiceRegistry serviceRegistry;

    static
    {
        try
        {
            Configuration mainDB = new Configuration();
            mainDB.configure("mainDB.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(mainDB.getProperties()).buildServiceRegistry();
            mainSessionFactory = mainDB.buildSessionFactory(serviceRegistry);

            Configuration backDB = new Configuration();
            backDB.configure("backDB.cfg.xml");
            serviceRegistry = new ServiceRegistryBuilder().applySettings(backDB.getProperties()).buildServiceRegistry();
            backSessionFactory = backDB.buildSessionFactory(serviceRegistry);
        }
        catch (Throwable ex)
        {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException
    {
        return mainSessionFactory.openSession();
    }

    public static Session getBackSession() throws HibernateException
    {
        return backSessionFactory.openSession();
    }

    public static void shutdown()
    {
        mainSessionFactory.close();
        backSessionFactory.close();
    }
}
