package model;

import java.util.List;

public class Afectiune
{
    private int id;
    private String denumire;
    private List<String> simptome;
    private List<String> medicamente;

    public Afectiune()
    {
        this.id = 0;
        this.denumire = "";
        this.simptome = null;
        this.medicamente = null;
    }

    public Afectiune(int id, String denumire, List<String> simptome, List<String> medicamente)
    {
        this.id = id;
        this.denumire = denumire;
        this.simptome = simptome;
        this.medicamente = medicamente;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getDenumire() {return denumire;}
    public void setDenumire(String denumire) {this.denumire = denumire;}

    public List<String> getSimptome() {return simptome;}
    public void setSimptome(List<String> simptome) {this.simptome = simptome;}

    public List<String> getMedicamente() {return medicamente;}
    public void setMedicamente(List<String> medicamente) {this.medicamente = medicamente;}

    @Override
    public String toString()
    {
        String x = "Id: " + this.id + "\n" + "Denumire: " + this.denumire +  "\n" +
                "Simptome: " + this.simptome + "\n" + "Medicamente: " + this.medicamente + "\n";
        return  x;
    }
}
