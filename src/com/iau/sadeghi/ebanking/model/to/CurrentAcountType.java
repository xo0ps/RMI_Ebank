package com.iau.sadeghi.ebanking.model.to;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentAcountType implements Serializable {
    private int row;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private long currentMoney;

    public long getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(long currentMoney) {
        this.currentMoney = currentMoney;
    }

    private boolean hasCheques;

    public boolean isHasCheques() {
        return hasCheques;
    }

    public void setHasCheques(boolean hasCheques) {
        this.hasCheques = hasCheques;
    }

    private String chequesIDs;

    public String getChequesIDs() {
        return chequesIDs;
    }

    public void setChequesIDs(String chequesIDs) {
        this.chequesIDs = chequesIDs;
    }

    private String namesWhoCanTake;

    public String getNamesWhoCanTake() {
        return namesWhoCanTake;
    }

    public void setNamesWhoCanTake(String namesWhoCanTake) {
        this.namesWhoCanTake = namesWhoCanTake;
    }

    private Timestamp openingDate;

    public Timestamp getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Timestamp openingDate) {
        this.openingDate = openingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurrentAcountType that = (CurrentAcountType) o;

        if (currentMoney != that.currentMoney) return false;
        if (hasCheques != that.hasCheques) return false;
        if (row != that.row) return false;
        if (chequesIDs != null ? !chequesIDs.equals(that.chequesIDs) : that.chequesIDs != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (namesWhoCanTake != null ? !namesWhoCanTake.equals(that.namesWhoCanTake) : that.namesWhoCanTake != null)
            return false;
        if (openingDate != null ? !openingDate.equals(that.openingDate) : that.openingDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (int) (currentMoney ^ (currentMoney >>> 32));
        result = 31 * result + (hasCheques ? 1 : 0);
        result = 31 * result + (chequesIDs != null ? chequesIDs.hashCode() : 0);
        result = 31 * result + (namesWhoCanTake != null ? namesWhoCanTake.hashCode() : 0);
        result = 31 * result + (openingDate != null ? openingDate.hashCode() : 0);
        return result;
    }
}
