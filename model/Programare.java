package model;

public class Programare
{
    private int id;
    private int zi;
    private String luna;
    private int an;
    private String ora;
    private int durata; //in minute
    private String pacient;
    private String doctor;

    public Programare()
    {
        this.id = 0;
        this.zi = 0;
        this.luna = "";
        this.an = 0;
        this.ora = "";
        this.durata = 0;
        this.pacient = "";
        this.doctor = "";
    }

    public Programare(int id, int zi, String luna, int an, String ora, int durata, String pacient, String doctor)
    {
        this.id = id;
        this.zi = zi;
        this.luna = luna;
        this.an = an;
        this.ora = ora;
        this.durata = durata;
        this.pacient = pacient;
        this.doctor = doctor;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getZi() {return zi;}
    public void setZi(int zi) {this.zi = zi;}

    public String getLuna() {return luna;}
    public void setLuna(String luna) {this.luna = luna;}

    public int getAn() {return an;}
    public void setAn(int an) {this.an = an;}

    public String getOra() {return ora;}
    public void setOra(String ora) {this.ora = ora;}

    public int getDurata() {return durata;}
    public void setDurata(int durata) {this.durata = durata;}

    public String getPacient() {return pacient;}
    public void setPacient(String pacient) {this.pacient = pacient;}

    public String getDoctor() {return doctor;}
    public void setDoctor(String doctor) {this.doctor = doctor;}

    @Override
    public String toString()
    {
        String x = "Id: " + this.id + "\n" + "Zi: " + this.zi +  "\n" + "Luna: " + this.luna + "\n" +
                "An: " + this.an + "\n" + "Ora: " + this.ora + "\n" + "Durata: " + this.durata + "\n" +
                "Pacient: " + this.pacient + "\n" + "Doctor: " + this.doctor + "\n";
        return  x;
    }
}
