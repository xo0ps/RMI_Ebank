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
public class ShortProfitableAccountType implements Serializable {
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

    private float increaseRate;

    public float getIncreaseRate() {
        return increaseRate;
    }

    public void setIncreaseRate(float increaseRate) {
        this.increaseRate = increaseRate;
    }

    private Timestamp openingDate;

    public Timestamp getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Timestamp openingDate) {
        this.openingDate = openingDate;
    }

    private boolean hasAtmCards;

    public boolean isHasAtmCards() {
        return hasAtmCards;
    }

    public void setHasAtmCards(boolean hasAtmCards) {
        this.hasAtmCards = hasAtmCards;
    }

    private String atmCardsIDs;

    public String getAtmCardsIDs() {
        return atmCardsIDs;
    }

    public void setAtmCardsIDs(String atmCardsIDs) {
        this.atmCardsIDs = atmCardsIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShortProfitableAccountType that = (ShortProfitableAccountType) o;

        if (currentMoney != that.currentMoney) return false;
        if (hasAtmCards != that.hasAtmCards) return false;
        if (Float.compare(that.increaseRate, increaseRate) != 0) return false;
        if (row != that.row) return false;
        if (atmCardsIDs != null ? !atmCardsIDs.equals(that.atmCardsIDs) : that.atmCardsIDs != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (openingDate != null ? !openingDate.equals(that.openingDate) : that.openingDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (int) (currentMoney ^ (currentMoney >>> 32));
        result = 31 * result + (increaseRate != +0.0f ? Float.floatToIntBits(increaseRate) : 0);
        result = 31 * result + (openingDate != null ? openingDate.hashCode() : 0);
        result = 31 * result + (hasAtmCards ? 1 : 0);
        result = 31 * result + (atmCardsIDs != null ? atmCardsIDs.hashCode() : 0);
        return result;
    }
}
