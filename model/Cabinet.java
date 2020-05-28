package model;

import java.util.List;

public class Cabinet
{
    private int id;
    private String specializare;
    private List<String> medici;
    private String adresa;

    public Cabinet()
    {
        this.id = 0;
        this.specializare = "";
        this.medici = null;
        this.adresa = "";
    }

    public Cabinet(int id, String specializare, List<String> medici, String adresa)
    {
        this.id = id;
        this.specializare = specializare;
        this.medici = medici;
        this.adresa = adresa;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getSpecializare() {return specializare;}
    public void setSpecializare(String specializare) {this.specializare = specializare;}

    public List<String> getMedici() {return medici;}
    public void setMedici(List<String> medici) {this.medici = medici;}

    public String getAdresa() {return adresa;}
    public void setAdresa(String adresa) {this.adresa = adresa;}

    @Override
    public String toString()
    {
        String x = "Id: " + this.id + "\n" + "Specializare: " + this.specializare +  "\n" +
                "Medici: " + this.medici + "\n" + "Adresa: " + this.adresa + "\n";
        return  x;
    }
}
