package com.iau.sadeghi.ebanking.model;

import com.iau.sadeghi.ebanking.model.to.*;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import java.math.BigInteger;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
//public class DBServer implements IDatabaseAccessObjects
public class DBServer extends UnicastRemoteObject implements IDatabaseAccessObjects
{
    private static DBServer dbServer = null;
    //static Logger log = Logger.getLogger(DBServer.class.getName());

    public DBServer() throws Exception
    {
    }

    private void distribute(String[] args) throws Exception
    {
        String name = args[0];
        int port = Integer.parseInt(args[1]);
        java.rmi.registry.LocateRegistry.createRegistry(port);
        Naming.rebind(name, this);
        System.out.println(name + " is Up on Registry Port #" + port);
    }

    public static void main(String[] args)
    {
        try
        {
            //log.info("DBServer Started");

            dbServer = new DBServer();
            //dbServer.TestInsert();
            //dbServer.TestUpdate();
            //dbServer.TestContains();
            //dbServer.TestSelect();
            //dbServer.TestDelete();

            //System.out.println("DBServer Tests Done.");
            args[0] = "sdfsf";
            args[1] = "1099";
            dbServer.distribute(args);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    @Override
    public void insert(TableObjectsTypes tot) {
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        if(null != tot.getAdminsInfo())
        {
            AdminsInfo info = tot.getAdminsInfo();
            session.save(info);
        }
        if(null != tot.getCurrentAcountType())
        {
            CurrentAcountType info = tot.getCurrentAcountType();
            session.save(info);
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            CustomersEssentialInfo info = tot.getCustomersEssentialInfo();
            session.save(info);
        }
        if(null != tot.getCustomersExtraInfo())
        {
            CustomersExtraInfo info = tot.getCustomersExtraInfo();
            session.save(info);
        }
        if(null != tot.getCustomersTransactions())
        {
            CustomersTransactions info = tot.getCustomersTransactions();
            session.save(info);
        }
        if(null != tot.getEmployeesInfo())
        {
            EmployeesInfo info = tot.getEmployeesInfo();
            session.save(info);
        }
        if(null != tot.getLongProfitableAccountType())
        {
            LongProfitableAccountType info = tot.getLongProfitableAccountType();
            session.save(info);
        }
        if(null != tot.getNonProfitableAccountType())
        {
            NonProfitableAccountType info = tot.getNonProfitableAccountType();
            session.save(info);
        }
        if(null != tot.getShortProfitableAccountType())
        {
            ShortProfitableAccountType info = tot.getShortProfitableAccountType();
            session.save(info);
        }
        if(null != tot.getUsersAuthentication())
        {
            UsersAuthentication info = tot.getUsersAuthentication();
            session.save(info);
        }
        if(null != tot.getUsersLevels())
        {
            UsersLevels info = tot.getUsersLevels();
            session.save(info);
        }
        session.getTransaction().commit();
    }

    @Override
    public void delete(TableObjectsTypes tot) {
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        if(null != tot.getAdminsInfo())
        {
            AdminsInfo info = tot.getAdminsInfo();
            session.delete(info);
        }
        if(null != tot.getCurrentAcountType())
        {
            CurrentAcountType info = tot.getCurrentAcountType();
            session.delete(info);
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            CustomersEssentialInfo info = tot.getCustomersEssentialInfo();
            session.delete(info);
        }
        if(null != tot.getCustomersExtraInfo())
        {
            CustomersExtraInfo info = tot.getCustomersExtraInfo();
            session.delete(info);
        }
        if(null != tot.getCustomersTransactions())
        {
            CustomersTransactions info = tot.getCustomersTransactions();
            session.delete(info);
        }
        if(null != tot.getEmployeesInfo())
        {
            EmployeesInfo info = tot.getEmployeesInfo();
            session.delete(info);
        }
        if(null != tot.getLongProfitableAccountType())
        {
            LongProfitableAccountType info = tot.getLongProfitableAccountType();
            session.delete(info);
        }
        if(null != tot.getNonProfitableAccountType())
        {
            NonProfitableAccountType info = tot.getNonProfitableAccountType();
            session.delete(info);
        }
        if(null != tot.getShortProfitableAccountType())
        {
            ShortProfitableAccountType info = tot.getShortProfitableAccountType();
            session.delete(info);
        }
        if(null != tot.getUsersAuthentication())
        {
            UsersAuthentication info = tot.getUsersAuthentication();
            session.delete(info);
        }
        if(null != tot.getUsersLevels())
        {
            UsersLevels info = tot.getUsersLevels();
            session.delete(info);
        }
        session.getTransaction().commit();
    }

    @Override
    public void update(TableObjectsTypes tot) {
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        if(null != tot.getAdminsInfo())
        {
            AdminsInfo info = tot.getAdminsInfo();
            session.update(info);
        }
        if(null != tot.getCurrentAcountType())
        {
            CurrentAcountType info = tot.getCurrentAcountType();
            session.update(info);
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            CustomersEssentialInfo info = tot.getCustomersEssentialInfo();
            session.update(info);
        }
        if(null != tot.getCustomersExtraInfo())
        {
            CustomersExtraInfo info = tot.getCustomersExtraInfo();
            session.update(info);
        }
        if(null != tot.getCustomersTransactions())
        {
            CustomersTransactions info = tot.getCustomersTransactions();
            session.update(info);
        }
        if(null != tot.getEmployeesInfo())
        {
            EmployeesInfo info = tot.getEmployeesInfo();
            session.update(info);
        }
        if(null != tot.getLongProfitableAccountType())
        {
            LongProfitableAccountType info = tot.getLongProfitableAccountType();
            session.update(info);
        }
        if(null != tot.getNonProfitableAccountType())
        {
            NonProfitableAccountType info = tot.getNonProfitableAccountType();
            session.update(info);
        }
        if(null != tot.getShortProfitableAccountType())
        {
            ShortProfitableAccountType info = tot.getShortProfitableAccountType();
            session.update(info);
        }
        if(null != tot.getUsersAuthentication())
        {
            UsersAuthentication info = tot.getUsersAuthentication();
            session.update(info);
        }
        if(null != tot.getUsersLevels())
        {
            UsersLevels info = tot.getUsersLevels();
            session.update(info);
        }
        session.getTransaction().commit();
    }

    @Override
    public ArrayList<TableObjectsTypes> select(TableObjectsTypes tot) {
        Session session = HibernateUtils.getSession();

        if(null != tot.getAdminsInfo())
        {
            String query = "select * from AdminsInfo e where e.";
            String colval = null;
            AdminsInfo input = tot.getAdminsInfo();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getName() != null)
            {
                query += "name = :colv";
                colval = input.getName().toString();
            }
            if(input.getFamily() != null)
            {
                query += "family = :colv";
                colval = input.getFamily().toString();
            }
            if(input.getNationalNumber() != null)
            {
                query += "nationalNumber = :colv";
                colval = input.getNationalNumber().toString();
            }
            if(input.getPhone() != null)
            {
                query += "phone = :colv";
                colval = input.getPhone().toString();
            }
            if(input.getMobile() != null)
            {
                query += "mobile = :colv";
                colval = input.getMobile().toString();
            }
            if(input.getEmail() != null)
            {
                query += "email = :colv";
                colval = input.getEmail().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setString("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                AdminsInfo info = new AdminsInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setName((String) field[2]);
                info.setFamily((String) field[3]);
                info.setNationalNumber((String) field[4]);
                info.setPhone((String) field[5]);
                info.setMobile((String) field[6]);
                info.setAddress((String) field[7]);
                info.setEmail((String) field[8]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setAdminsInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCurrentAcountType())
        {
            String query = "select * from CurrentAccountType e where e.";
            String colval = null;
            CurrentAcountType input = tot.getCurrentAcountType();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getCurrentMoney() != 0)
            {
                query += "currentMoney = :colv";
                colval = String.valueOf(input.getCurrentMoney());
            }
            if(input.isHasCheques() != false)
            {
                query += "hasCheques = :colv";
                colval = String.valueOf(input.isHasCheques());
            }
            if(input.getChequesIDs() != null)
            {
                query += "chequesIDs = :colv";
                colval = input.getChequesIDs().toString();
            }
            if(input.getNamesWhoCanTake() != null)
            {
                query += "namesWhoCanTake = :colv";
                colval = input.getNamesWhoCanTake().toString();
            }
            if(input.getOpeningDate() != null)
            {
                query += "openingDate = :colv";
                colval = input.getOpeningDate().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CurrentAcountType info = new CurrentAcountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Long) field[2]);
                info.setHasCheques((Boolean) field[3]);
                info.setChequesIDs((String) field[4]);
                info.setNamesWhoCanTake((String) field[5]);
                String date = String.valueOf(field[6]);
                //int year =  Integer.parseInt(date.substring(0,4));
                //int month = Integer.parseInt(date.substring(5,7));
                //int day = Integer.parseInt(date.substring(8,10));
                //int hour = Integer.parseInt(date.substring(11,13));
                //int minute = Integer.parseInt(date.substring(14,16));
                //int second = Integer.parseInt(date.substring(17,19));
                //int nano = 0;
                //new Date(date);
                //info.setOpeningDate(new Timestamp(year,month,day,hour,minute,second,nano));
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCurrentAcountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            String query = "select * from CustomersEssentialInfo e where e.";
            String colval = null;
            CustomersEssentialInfo input = tot.getCustomersEssentialInfo();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getName() != null)
            {
                query += "name = :colv";
                colval = input.getName().toString();
            }
            if(input.getFamily() != null)
            {
                query += "family = :colv";
                colval = input.getFamily().toString();
            }
            if(input.getNationalNumber() != null)
            {
                query += "nationalNumber = :colv";
                colval = input.getNationalNumber().toString();
            }
            if(input.getAccountTypes() != 0)
            {
                query += "accountTypes = :colv";
                colval = String.valueOf(input.getAccountTypes());
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CustomersEssentialInfo info = new CustomersEssentialInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setName((String) field[2]);
                info.setFamily((String) field[3]);
                info.setNationalNumber((String) field[4]);
                info.setAccountTypes((Short) (field[5]));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCustomersEssentialInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCustomersExtraInfo())
        {
            String query = "select * from CustomersExtraInfo e where e.";
            String colval = null;
            CustomersExtraInfo input = tot.getCustomersExtraInfo();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getPhone() != null)
            {
                query += "phone = :colv";
                colval = input.getPhone().toString();
            }
            if(input.getMobile() != null)
            {
                query += "mobile = :colv";
                colval = input.getMobile().toString();
            }
            if(input.getAddress() != null)
            {
                query += "address = :colv";
                colval = input.getAddress().toString();
            }
            if(input.getEmail() != null)
            {
                query += "email = :colv";
                colval = input.getEmail().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CustomersExtraInfo info = new CustomersExtraInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setPhone((String) field[2]);
                info.setMobile((String) field[3]);
                info.setAddress((String) field[4]);
                info.setEmail((String) (field[5]));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCustomersExtraInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCustomersTransactions())
        {
            String query = "select * from CustomersTransactions e where e.";
            String colval = null;
            CustomersTransactions input = tot.getCustomersTransactions();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getT1() != null)
            {
                query += "t1 = :colv";
                colval = input.getT1().toString();
            }
            if(input.getT2() != null)
            {
                query += "t2 = :colv";
                colval = input.getT2().toString();
            }
            if(input.getT3() != null)
            {
                query += "t3 = :colv";
                colval = input.getT3().toString();
            }
            if(input.getT4() != null)
            {
                query += "t4 = :colv";
                colval = input.getT4().toString();
            }
            if(input.getT5() != null)
            {
                query += "t5 = :colv";
                colval = input.getT5().toString();
            }
            if(input.getTurn() != 0)
            {
                query += "turn = :colv";
                colval = String.valueOf(input.getTurn());
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CustomersTransactions info = new CustomersTransactions();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setT1((String) field[2]);
                info.setT2((String) field[3]);
                info.setT3((String) field[4]);
                info.setT4((String) field[5]);
                info.setT5((String) field[6]);
                info.setTurn((Integer) field[7]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCustomersTransactions(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getEmployeesInfo())
        {
            String query = "select * from EmployeesInfo e where e.";
            String colval = null;
            EmployeesInfo input = tot.getEmployeesInfo();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getName() != null)
            {
                query += "name = :colv";
                colval = input.getName().toString();
            }
            if(input.getFamily() != null)
            {
                query += "family = :colv";
                colval = input.getFamily().toString();
            }
            if(input.getNationalNumber() != null)
            {
                query += "nationalNumber = :colv";
                colval = input.getNationalNumber().toString();
            }
            if(input.getPhone() != null)
            {
                query += "phone = :colv";
                colval = input.getPhone().toString();
            }
            if(input.getMobile() != null)
            {
                query += "mobile = :colv";
                colval = input.getMobile().toString();
            }
            if(input.getAddress() != null)
            {
                query += "address = :colv";
                colval = input.getAddress().toString();
            }
            if(input.getEmail() != null)
            {
                query += "email = :colv";
                colval = input.getEmail().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                EmployeesInfo info = new EmployeesInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setName((String) field[2]);
                info.setFamily((String) field[3]);
                info.setNationalNumber((String) field[4]);
                info.setPhone((String) field[5]);
                info.setMobile((String) field[6]);
                info.setAddress((String) field[7]);
                info.setEmail((String) field[8]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setEmployeesInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getLongProfitableAccountType())
        {
            String query = "select * from LongProfitableAccountType e where e.";
            String colval = null;
            LongProfitableAccountType input = tot.getLongProfitableAccountType();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getCurrentMoney() != 0)
            {
                query += "currentMoney = :colv";
                colval = String.valueOf(input.getCurrentMoney());
            }
            if(input.getIncreaseRate() != 0)
            {
                query += "increaseRate = :colv";
                colval = String.valueOf(input.getIncreaseRate());
            }
            if(input.getOpeningDate() != null)
            {
                query += "openingDate = :colv";
                colval = input.getOpeningDate().toString();
            }
            if(input.isHasAtmCard() != false)
            {
                query += "hasATMCard = :colv";
                colval = String.valueOf(input.isHasAtmCard());
            }
            if(input.getAtmCardsIDs() != null)
            {
                query += "ATMCardsIDs = :colv";
                colval = input.getAtmCardsIDs().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                LongProfitableAccountType info = new LongProfitableAccountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Integer) field[2]);
                info.setIncreaseRate((Integer) field[3]);
                String date = (String) field[4];
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                info.setHasAtmCard((Boolean) field[5]);
                info.setAtmCardsIDs((String) field[6]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setLongProfitableAccountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getNonProfitableAccountType())
        {
            String query = "select * from NonProfitableAccountType e where e.";
            String colval = null;
            NonProfitableAccountType input = tot.getNonProfitableAccountType();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getCurrentMoney() != 0)
            {
                query += "currentMoney = :colv";
                colval = String.valueOf(input.getCurrentMoney());
            }
            if(input.getOpeningDate() != null)
            {
                query += "openingDate = :colv";
                colval = input.getOpeningDate().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                NonProfitableAccountType info = new NonProfitableAccountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Integer) field[2]);
                String date = (String) field[3];
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setNonProfitableAccountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getShortProfitableAccountType())
        {
            String query = "select * from ShortProfitableAccountType e where e.";
            String colval = null;
            ShortProfitableAccountType input = tot.getShortProfitableAccountType();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getCurrentMoney() != 0)
            {
                query += "currentMoney = :colv";
                colval = String.valueOf(input.getCurrentMoney());
            }
            if(input.getIncreaseRate() != 0)
            {
                query += "increaseRate = :colv";
                colval = String.valueOf(input.getIncreaseRate());
            }
            if(input.getOpeningDate() != null)
            {
                query += "openingDate = :colv";
                colval = input.getOpeningDate().toString();
            }
            if(input.isHasAtmCards() != false)
            {
                query += "hasATMCard = :colv";
                colval = String.valueOf(input.isHasAtmCards());
            }
            if(input.getAtmCardsIDs() != null)
            {
                query += "ATMCardsIDs = :colv";
                colval = input.getAtmCardsIDs().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                ShortProfitableAccountType info = new ShortProfitableAccountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Integer) field[2]);
                info.setIncreaseRate((Integer) field[3]);
                String date = (String) field[4];
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                info.setHasAtmCards((Boolean) field[5]);
                info.setAtmCardsIDs((String) field[6]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setShortProfitableAccountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getUsersAuthentication())
        {
            String query = "select * from UsersAuthentication e where e.";
            String colval = null;
            UsersAuthentication input = tot.getUsersAuthentication();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getUsername() != null)
            {
                query += "username = :colv";
                colval = input.getUsername().toString();
            }
            if(input.getPassword() != null)
            {
                query += "password = :colv";
                colval = input.getPassword().toString();
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                UsersAuthentication info = new UsersAuthentication();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setUsername((String) field[2]);
                info.setPassword((String) field[3]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setUsersAuthentication(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getUsersLevels())
        {
            String query = "select * from UsersLevels e where e.";
            String colval = null;
            UsersLevels input = tot.getUsersLevels();
            if(input.getRow() != 0)
            {
                query += "row = :colv";
                colval = String.valueOf(input.getRow());
            }
            if(input.getId() != null)
            {
                query += "id = :colv";
                colval = input.getId().toString();
            }
            if(input.getLevel() != 0)
            {
                query += "level = :colv";
                colval = String.valueOf(input.getLevel());
            }

            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                UsersLevels info = new UsersLevels();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setLevel((Short) field[2]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setUsersLevels(info);
                tots.add(out);
            }
            return tots;
        }

        return null;
    }

    @Override
    public boolean contains(TableObjectsTypes tot) {
        Session session = HibernateUtils.getSession();
        session.beginTransaction();
        boolean result = false;
        if(null != tot.getAdminsInfo())
        {
            AdminsInfo info = tot.getAdminsInfo();
            result = session.contains(info);
        }
        if(null != tot.getCurrentAcountType())
        {
            CurrentAcountType info = tot.getCurrentAcountType();
            result = session.contains(info);
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            CustomersEssentialInfo info = tot.getCustomersEssentialInfo();
            result = session.contains(info);
        }
        if(null != tot.getCustomersExtraInfo())
        {
            CustomersExtraInfo info = tot.getCustomersExtraInfo();
            result = session.contains(info);
        }
        if(null != tot.getCustomersTransactions())
        {
            CustomersTransactions info = tot.getCustomersTransactions();
            result = session.contains(info);
        }
        if(null != tot.getEmployeesInfo())
        {
            EmployeesInfo info = tot.getEmployeesInfo();
            result = session.contains(info);
        }
        if(null != tot.getLongProfitableAccountType())
        {
            LongProfitableAccountType info = tot.getLongProfitableAccountType();
            result = session.contains(info);
        }
        if(null != tot.getNonProfitableAccountType())
        {
            NonProfitableAccountType info = tot.getNonProfitableAccountType();
            result = session.contains(info);
        }
        if(null != tot.getShortProfitableAccountType())
        {
            ShortProfitableAccountType info = tot.getShortProfitableAccountType();
            result = session.contains(info);
        }
        if(null != tot.getUsersAuthentication())
        {
            UsersAuthentication info = tot.getUsersAuthentication();
            result = session.contains(info);
        }
        if(null != tot.getUsersLevels())
        {
            UsersLevels info = tot.getUsersLevels();
            result = session.contains(info);
        }
        session.getTransaction().commit();
        return result;
    }

    @Override
    public void backup() {

        Session session = HibernateUtils.getSession();
        session.beginTransaction();

        TableObjectsTypes tot = new TableObjectsTypes();
        AdminsInfo info = new AdminsInfo();
        tot.setAdminsInfo(info);
        int count = getCount(tot);
        info.setRow(count);
        tot.setAdminsInfo(info);
        ArrayList<TableObjectsTypes> result = dbServer.selectRows(tot);
        insertToBackup(result);
    }

    public ArrayList<TableObjectsTypes> selectRows(TableObjectsTypes tot) {
        Session session = HibernateUtils.getSession();

        if(null != tot.getAdminsInfo())
        {
            String query = "select * from AdminsInfo e where e.row <= :colv";
            AdminsInfo input = tot.getAdminsInfo();
            String colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setString("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                AdminsInfo info = new AdminsInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setName((String) field[2]);
                info.setFamily((String) field[3]);
                info.setNationalNumber((String) field[4]);
                info.setPhone((String) field[5]);
                info.setMobile((String) field[6]);
                info.setAddress((String) field[7]);
                info.setEmail((String) field[8]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setAdminsInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCurrentAcountType())
        {
            String query = "select * from CurrentAccountType e where e.row <= :colv";
            String colval = null;
            CurrentAcountType input = tot.getCurrentAcountType();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CurrentAcountType info = new CurrentAcountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Long) field[2]);
                info.setHasCheques((Boolean) field[3]);
                info.setChequesIDs((String) field[4]);
                info.setNamesWhoCanTake((String) field[5]);
                String date = String.valueOf(field[6]);
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCurrentAcountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            String query = "select * from CustomersEssentialInfo e where e.row <= :colv";
            String colval = null;
            CustomersEssentialInfo input = tot.getCustomersEssentialInfo();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CustomersEssentialInfo info = new CustomersEssentialInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setName((String) field[2]);
                info.setFamily((String) field[3]);
                info.setNationalNumber((String) field[4]);
                info.setAccountTypes((Short) (field[5]));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCustomersEssentialInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCustomersExtraInfo())
        {
            String query = "select * from CustomersExtraInfo e where e.row <= :colv";
            String colval = null;
            CustomersExtraInfo input = tot.getCustomersExtraInfo();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CustomersExtraInfo info = new CustomersExtraInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setPhone((String) field[2]);
                info.setMobile((String) field[3]);
                info.setAddress((String) field[4]);
                info.setEmail((String) (field[5]));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCustomersExtraInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getCustomersTransactions())
        {
            String query = "select * from CustomersTransactions e where e.row <= :colv";
            String colval = null;
            CustomersTransactions input = tot.getCustomersTransactions();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                CustomersTransactions info = new CustomersTransactions();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setT1((String) field[2]);
                info.setT2((String) field[3]);
                info.setT3((String) field[4]);
                info.setT4((String) field[5]);
                info.setT5((String) field[6]);
                info.setTurn((Integer) field[7]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setCustomersTransactions(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getEmployeesInfo())
        {
            String query = "select * from EmployeesInfo e where e.row <= :colv";
            String colval = null;
            EmployeesInfo input = tot.getEmployeesInfo();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                EmployeesInfo info = new EmployeesInfo();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setName((String) field[2]);
                info.setFamily((String) field[3]);
                info.setNationalNumber((String) field[4]);
                info.setPhone((String) field[5]);
                info.setMobile((String) field[6]);
                info.setAddress((String) field[7]);
                info.setEmail((String) field[8]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setEmployeesInfo(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getLongProfitableAccountType())
        {
            String query = "select * from LongProfitableAccountType e where e.row <= :colv";
            String colval = null;
            LongProfitableAccountType input = tot.getLongProfitableAccountType();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                LongProfitableAccountType info = new LongProfitableAccountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Integer) field[2]);
                info.setIncreaseRate((Integer) field[3]);
                String date = (String) field[4];
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                info.setHasAtmCard((Boolean) field[5]);
                info.setAtmCardsIDs((String) field[6]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setLongProfitableAccountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getNonProfitableAccountType())
        {
            String query = "select * from NonProfitableAccountType e where e.row <= :colv";
            String colval = null;
            NonProfitableAccountType input = tot.getNonProfitableAccountType();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                NonProfitableAccountType info = new NonProfitableAccountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Integer) field[2]);
                String date = (String) field[3];
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                TableObjectsTypes out = new TableObjectsTypes();
                out.setNonProfitableAccountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getShortProfitableAccountType())
        {
            String query = "select * from ShortProfitableAccountType e where e.row <= :colv";
            String colval = null;
            ShortProfitableAccountType input = tot.getShortProfitableAccountType();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                ShortProfitableAccountType info = new ShortProfitableAccountType();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setCurrentMoney((Integer) field[2]);
                info.setIncreaseRate((Integer) field[3]);
                String date = (String) field[4];
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
                Date date2 = null;
                try
                {
                    date2 = formatter.parse(date);
                }
                catch (Exception e)
                {
                    date2 = new Date(System.currentTimeMillis());
                }
                info.setOpeningDate(new Timestamp(date2.getTime()));
                info.setHasAtmCards((Boolean) field[5]);
                info.setAtmCardsIDs((String) field[6]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setShortProfitableAccountType(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getUsersAuthentication())
        {
            String query = "select * from UsersAuthentication e where e.row <= :colv";
            String colval = null;
            UsersAuthentication input = tot.getUsersAuthentication();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                UsersAuthentication info = new UsersAuthentication();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setUsername((String) field[2]);
                info.setPassword((String) field[3]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setUsersAuthentication(info);
                tots.add(out);
            }
            return tots;
        }
        if(null != tot.getUsersLevels())
        {
            String query = "select * from UsersLevels e where e.row <= :colv";
            String colval = null;
            UsersLevels input = tot.getUsersLevels();
            colval = String.valueOf(input.getRow());
            SQLQuery q = session.createSQLQuery(query);
            q.setParameter("colv", colval);
            List<Object[]> fields = (List<Object[]>)q.list();
            ArrayList<TableObjectsTypes> tots = new ArrayList<TableObjectsTypes>();
            for(Object[] field : fields)
            {
                UsersLevels info = new UsersLevels();
                info.setRow((Integer) field[0]);
                info.setId((String) field[1]);
                info.setLevel((Short) field[2]);
                TableObjectsTypes out = new TableObjectsTypes();
                out.setUsersLevels(info);
                tots.add(out);
            }
            return tots;
        }

        return null;
    }

    private int getCount(TableObjectsTypes tot)
    {
        Session session = HibernateUtils.getSession();
        if(null != tot.getAdminsInfo())
        {
            Query q = session.createQuery("from AdminsInfo count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getCurrentAcountType())
        {
            Query q = session.createQuery("from CurrentAcountType count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getCustomersEssentialInfo())
        {
            Query q = session.createQuery("from CustomersEssentialInfo count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getCustomersExtraInfo())
        {
            Query q = session.createQuery("from CustomersExtraInfo count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getCustomersTransactions())
        {
            Query q = session.createQuery("from CustomersTransactions count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getEmployeesInfo())
        {
            Query q = session.createQuery("from EmployeesInfo count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getLongProfitableAccountType())
        {
            Query q = session.createQuery("from LongProfitableAccountType count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getNonProfitableAccountType())
        {
            Query q = session.createQuery("from NonProfitableAccountType count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getShortProfitableAccountType())
        {
            Query q = session.createQuery("from ShortProfitableAccountType count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getUsersAuthentication())
        {
            Query q = session.createQuery("from UsersAuthentication count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        if(null != tot.getUsersLevels())
        {
            Query q = session.createQuery("from UsersLevels count");//"(AdminsInfo.row)from AdminsInfo");
            return q.list().size();
        }
        return 0;
    }

    private void insertToBackup(ArrayList<TableObjectsTypes> input)
    {
        for(TableObjectsTypes tot : input)
        {
            Session session = HibernateUtils.getBackSession();
            session.beginTransaction();
            if(null != tot.getAdminsInfo())
            {
                AdminsInfo info = tot.getAdminsInfo();
                session.save(info);
            }
            if(null != tot.getCurrentAcountType())
            {
                CurrentAcountType info = tot.getCurrentAcountType();
                session.save(info);
            }
            if(null != tot.getCustomersEssentialInfo())
            {
                CustomersEssentialInfo info = tot.getCustomersEssentialInfo();
                session.save(info);
            }
            if(null != tot.getCustomersExtraInfo())
            {
                CustomersExtraInfo info = tot.getCustomersExtraInfo();
                session.save(info);
            }
            if(null != tot.getCustomersTransactions())
            {
                CustomersTransactions info = tot.getCustomersTransactions();
                session.save(info);
            }
            if(null != tot.getEmployeesInfo())
            {
                EmployeesInfo info = tot.getEmployeesInfo();
                session.save(info);
            }
            if(null != tot.getLongProfitableAccountType())
            {
                LongProfitableAccountType info = tot.getLongProfitableAccountType();
                session.save(info);
            }
            if(null != tot.getNonProfitableAccountType())
            {
                NonProfitableAccountType info = tot.getNonProfitableAccountType();
                session.save(info);
            }
            if(null != tot.getShortProfitableAccountType())
            {
                ShortProfitableAccountType info = tot.getShortProfitableAccountType();
                session.save(info);
            }
            if(null != tot.getUsersAuthentication())
            {
                UsersAuthentication info = tot.getUsersAuthentication();
                session.save(info);
            }
            if(null != tot.getUsersLevels())
            {
                UsersLevels info = tot.getUsersLevels();
                session.save(info);
            }
            session.getTransaction().commit();
        }
    }

    private void TestInsert()
    {
        Random random = new Random(System.nanoTime());
        int rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            AdminsInfo info = new AdminsInfo();
            info.setId(getRandomWord(10));
            info.setName(getRandomWord(15));
            info.setFamily(getRandomWord(17));
            info.setNationalNumber(getRandomWord(12));
            info.setPhone(getRandomWord(10));
            info.setMobile(getRandomWord(12));
            info.setAddress(getRandomWord(50));
            info.setEmail(getRandomWord(20));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setAdminsInfo(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into AdminsInfo");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            CurrentAcountType info = new CurrentAcountType();
            info.setId(getRandomWord(10));
            info.setCurrentMoney((Long) getRandomNumber());
            info.setHasCheques(getRandomNumber() % 2 == 0 ? true : false);
            info.setChequesIDs(getRandomWord(100));
            info.setNamesWhoCanTake(getRandomWord(100));
            info.setOpeningDate(new Timestamp(System.nanoTime()));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setCurrentAcountType(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into CurrentAccountType");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            CustomersEssentialInfo info = new CustomersEssentialInfo();
            info.setId(getRandomWord(10));
            info.setName(getRandomWord(20));
            info.setFamily(getRandomWord(12));
            info.setNationalNumber(getRandomWord(10));
            info.setAccountTypes(getRandomNumber().shortValue());
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setCustomersEssentialInfo(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into CustomersEssentialInfo");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            CustomersExtraInfo info = new CustomersExtraInfo();
            info.setId(getRandomWord(10));
            info.setPhone(getRandomWord(10));
            info.setMobile(getRandomWord(12));
            info.setAddress(getRandomWord(50));
            info.setEmail(getRandomWord(50));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setCustomersExtraInfo(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into CustomersExtraInfo");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            CustomersTransactions info = new CustomersTransactions();
            info.setId(getRandomWord(10));
            info.setT1(getRandomWord(100));
            info.setT2(getRandomWord(100));
            info.setT3(getRandomWord(100));
            info.setT4(getRandomWord(100));
            info.setT5(getRandomWord(100));
            info.setTurn(getRandomNumber().intValue() % 5);
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setCustomersTransactions(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into CustomersTransactions");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            EmployeesInfo info = new EmployeesInfo();
            info.setId(getRandomWord(10));
            info.setName(getRandomWord(10));
            info.setFamily(getRandomWord(12));
            info.setNationalNumber(getRandomWord(12));
            info.setPhone(getRandomWord(10));
            info.setMobile(getRandomWord(12));
            info.setAddress(getRandomWord(50));
            info.setEmail(getRandomWord(50));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setEmployeesInfo(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into EmployeesInfo");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            LongProfitableAccountType info = new LongProfitableAccountType();
            info.setId(getRandomWord(10));
            info.setCurrentMoney(getRandomNumber() % 100000000);
            info.setIncreaseRate((getRandomNumber().floatValue() % 10000) / 100);
            info.setOpeningDate(new Timestamp(System.nanoTime()));
            info.setHasAtmCard(getRandomNumber() % 2 == 0 ? true : false);
            info.setAtmCardsIDs(getRandomWord(100));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setLongProfitableAccountType(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into LongProfitableAccountType");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            NonProfitableAccountType info = new NonProfitableAccountType();
            info.setId(getRandomWord(10));
            info.setCurrentMoney(getRandomNumber() % 100000000);
            info.setOpeningDate(new Timestamp(System.nanoTime()));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setNonProfitableAccountType(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into NonProfitableAccountType");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            ShortProfitableAccountType info = new ShortProfitableAccountType();
            info.setId(getRandomWord(10));
            info.setCurrentMoney(getRandomNumber() % 100000000);
            info.setIncreaseRate((getRandomNumber().floatValue() % 10000) / 100);
            info.setOpeningDate(new Timestamp(System.nanoTime()));
            info.setHasAtmCards(getRandomNumber() % 2 == 0 ? true : false);
            info.setAtmCardsIDs(getRandomWord(100));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setShortProfitableAccountType(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into ShortProfitableAccountType");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            UsersAuthentication info = new UsersAuthentication();
            info.setId(getRandomWord(10));
            info.setUsername(getRandomWord(10));
            info.setPassword(getRandomWord(10));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setUsersAuthentication(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into UsersAuthentication");
        rand = random.nextInt(10);
        for(int i = 0; i < rand; i++)
        {
            UsersLevels info = new UsersLevels();
            info.setId(getRandomWord(10));
            info.setLevel((short) (getRandomNumber().shortValue()%5));
            TableObjectsTypes tot = new TableObjectsTypes();
            tot.setUsersLevels(info);
            dbServer.insert(tot);
        }
        System.out.println("TestInsert: "+rand+" Records inserted into UsersLevels");
    }

    private void TestDelete()
    {

    }
    private void TestUpdate()
    {

    }

    private void TestSelect()
    {

    }

    private void TestContains()
    {

    }

    private static String getRandomWord(int length)
    {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(length);
    }

    private static Long getRandomNumber()
    {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).longValue();
    }
}