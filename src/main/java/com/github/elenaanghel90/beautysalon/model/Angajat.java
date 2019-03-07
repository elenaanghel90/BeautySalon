package com.github.elenaanghel90.beautysalon.model;

public class Angajat {
    private String nume;
    private String jobTitle;
    private CategorieServiciu categorieServiciu;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public CategorieServiciu getCategorieServiciu() {
        return categorieServiciu;
    }

    public void setCategorieServiciu(CategorieServiciu categorieServiciu) {
        this.categorieServiciu = categorieServiciu;
    }

}
