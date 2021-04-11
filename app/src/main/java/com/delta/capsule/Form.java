package com.delta.capsule;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
class Form {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "mDate")
    private String mDate;
    @ColumnInfo(name = "mName")
    private String mName;
    @ColumnInfo(name="mKind")
    private String mKind;
    @ColumnInfo(name = "mEntry")
    private int mEntry;
    @ColumnInfo(name="mExit")
    private int mExit;
    @ColumnInfo(name="mDetail")
    private String mDetail;
    @ColumnInfo(name = "mPrice")
    private double mPrice;

    public Form() {
    }

    public Form(int id, String mDate, String mName, String mKind, int mEntry, int mExit, String mDetail, double mPrice) {
        this.id = id;
        this.mDate = mDate;
        this.mName = mName;
        this.mKind = mKind;
        this.mEntry = mEntry;
        this.mExit = mExit;
        this.mDetail = mDetail;
        this.mPrice = mPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String mKind) {
        this.mKind = mKind;
    }

    public int getEntry() {
        return mEntry;
    }

    public void setEntry(int mEntry) {
        this.mEntry = mEntry;
    }

    public int getExit() {
        return mExit;
    }

    public void setExit(int mExit) {
        this.mExit = mExit;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double mPrice) {
        this.mPrice = mPrice;
    }
}
