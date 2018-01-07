package com.iau.sadeghi.ebanking.model.to;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomersEssentialInfo implements Serializable {
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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    private String nationalNumber;

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    private short accountTypes;

    public short getAccountTypes() {
        return accountTypes;
    }

    public void setAccountTypes(short accountTypes) {
        this.accountTypes = accountTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomersEssentialInfo that = (CustomersEssentialInfo) o;

        if (accountTypes != that.accountTypes) return false;
        if (row != that.row) return false;
        if (family != null ? !family.equals(that.family) : that.family != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nationalNumber != null ? !nationalNumber.equals(that.nationalNumber) : that.nationalNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (nationalNumber != null ? nationalNumber.hashCode() : 0);
        result = 31 * result + (int) accountTypes;
        return result;
    }
}
