package com.iau.sadeghi.ebanking.model.to;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: mahdi
 * Date: 7/1/13
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomersTransactions implements Serializable {
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

    private String t1;

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    private String t2;

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    private String t3;

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    private String t4;

    public String getT4() {
        return t4;
    }

    public void setT4(String t4) {
        this.t4 = t4;
    }

    private String t5;

    public String getT5() {
        return t5;
    }

    public void setT5(String t5) {
        this.t5 = t5;
    }

    private int turn;

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomersTransactions that = (CustomersTransactions) o;

        if (row != that.row) return false;
        if (turn != that.turn) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (t1 != null ? !t1.equals(that.t1) : that.t1 != null) return false;
        if (t2 != null ? !t2.equals(that.t2) : that.t2 != null) return false;
        if (t3 != null ? !t3.equals(that.t3) : that.t3 != null) return false;
        if (t4 != null ? !t4.equals(that.t4) : that.t4 != null) return false;
        if (t5 != null ? !t5.equals(that.t5) : that.t5 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (t1 != null ? t1.hashCode() : 0);
        result = 31 * result + (t2 != null ? t2.hashCode() : 0);
        result = 31 * result + (t3 != null ? t3.hashCode() : 0);
        result = 31 * result + (t4 != null ? t4.hashCode() : 0);
        result = 31 * result + (t5 != null ? t5.hashCode() : 0);
        result = 31 * result + turn;
        return result;
    }
}
