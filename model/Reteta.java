package model;

import java.util.List;

public class Reteta
{
    private int id;
    private String pacient;
    private List<String> medicamente;
    private int reducere;
    private double pret;

    public Reteta()
    {
        this.id = 0;
        this.pacient = "";
        this.medicamente = null;
        this.reducere = 0;
        this.pret = 0;
    }

    public Reteta(int id, String pacient, List<String> medicamente, int reducere, int pret)
    {
        this.id = id;
        this.pacient = pacient;
        this.medicamente = medicamente;
        this.reducere = reducere;
        this.pret = pret;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getPacient() {return pacient;}
    public void setPacient(String pacient) {this.pacient = pacient;}

    public List<String> getMedicamente() {return medicamente;}
    public void setMedicamente(List<String> medicamente) {this.medicamente = medicamente;}

    public int getReducere() {return reducere;}
    public void setReducere(int reducere) {this.reducere = reducere;}

    public double getPret() {return pret;}
    public void setPret(double pret) {this.pret = pret;}

    @Override
    public String toString()
    {
        String x = "Id: " + this.id + "\n" + "Pacient: " + this.pacient +  "\n" +
                "Medicamente: " + this.medicamente + "\n" + "Reducere: " + this.reducere + "\n" +
                "Pret: " + this.pret + "\n";
        return  x;
    }
}
