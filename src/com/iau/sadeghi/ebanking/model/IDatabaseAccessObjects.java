package com.iau.sadeghi.ebanking.model;

import com.iau.sadeghi.ebanking.model.to.TableObjectsTypes;

import java.rmi.Remote;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 5:16 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IDatabaseAccessObjects extends Remote
{
    public void insert(TableObjectsTypes tot);
    public void delete(TableObjectsTypes tot);
    public void update(TableObjectsTypes tot);
    public ArrayList<TableObjectsTypes> select(TableObjectsTypes tot);
    public boolean contains(TableObjectsTypes tot);
    public void backup();
}
