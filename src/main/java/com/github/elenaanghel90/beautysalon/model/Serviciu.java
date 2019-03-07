package com.github.elenaanghel90.beautysalon.model;

import java.math.BigDecimal;

public class Serviciu {

    private BigDecimal cost;
    private int durata;
    private TipServiciu tipServiciu;
    private CategorieServiciu categorieServiciu;

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata() {
        this.durata = durata;
    }

    public TipServiciu getTipServiciu() {
        return tipServiciu;
    }

    public void setTipServiciu(TipServiciu tipServiciu) {
        this.tipServiciu = tipServiciu;
    }

    public CategorieServiciu categorieServiciu() {
        return categorieServiciu;
    }

    public void setCategorieServiciu() {
        this.categorieServiciu = categorieServiciu;
    }
}
