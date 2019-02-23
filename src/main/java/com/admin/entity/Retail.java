package com.admin.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class Retail {
    @JSONField(name = "Name")
    private String Name;
    @JSONField(name = "Qty")
    private int Qty;

    public Retail() {
        super();
    }

    public Retail(String Name, int Qty) {
        this.Name = Name;
        this.Qty = Qty;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }
}
