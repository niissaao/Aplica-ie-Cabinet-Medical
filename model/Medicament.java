package model;

import java.util.List;

public class Medicament
{
    private int id;
    private String denumire;
    private double pret;
    private List<String> afectiuni;

    public Medicament()
    {
        this.id = 0;
        this.denumire = "";
        this.pret = 0;
        this.afectiuni = null;
    }

    public Medicament(int id, String denumire, double pret, List<String> afectiuni)
    {
        this.id = id;
        this.denumire = denumire;
        this.pret = pret;
        this.afectiuni = afectiuni;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getDenumire() {return denumire;}
    public void setDenumire(String denumire) {this.denumire = denumire;}

    public double getPret() {return pret;}
    public void setPret(double pret) {this.pret = pret;}

    public List<String> getAfectiuni() {return afectiuni;}
    public void setAfectiuni(List<String> afectiuni) {this.afectiuni = afectiuni;}

    @Override
    public String toString()
    {
        String x = "Id: " + this.id + "\n" + "Denumire: " + this.denumire +  "\n" + "Pret: " + this.pret + "\n" +
                "Afectiuni: " + this.afectiuni + "\n";
        return  x;
    }
}
