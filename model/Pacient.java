package model;

import java.util.List;

public class Pacient extends User
{
    private String statut;
    private List<String> simptome;
    private List<String> alte_Afectiuni;
    private String diagnostic;

    public Pacient()
    {
        super();
        this.statut = "";
        this.simptome = null;
        this.alte_Afectiuni = null;
        this.diagnostic = "";
    }

    public Pacient(int id, String parola, String email, String nume, String prenume, String gen, int varsta,
                   String numarTelefon, String statut, List<String> simptome, List<String> alte_Afectiuni,
                   String diagnostic)
    {
        super(id, parola, email, nume, prenume, gen, varsta, numarTelefon);
        this.statut = statut;
        this.simptome = simptome;
        this.alte_Afectiuni = alte_Afectiuni;
        this.diagnostic = diagnostic;
    }

    public String getStatut(){return statut;}
    public void setStatut(String statut) {this.statut = statut;}

    public List<String> getSimptome() {return simptome;}
    public void setSimptome(List<String> simptome) {this.simptome = simptome;}

    public List<String> getAlte_Afectiuni() {return alte_Afectiuni;}
    public void setAlte_Afectiuni(List<String> alte_Afectiuni) {this.alte_Afectiuni = alte_Afectiuni;}

    @Override
    public String toString()
    {
        String x = "ID: " + this.id + "\n" + "Parola: " + this.parola +  "\n" + "Email: " + this.email + "\n" +
                "Nume: " + this.nume + "\n" + "Prenume: " + this.prenume + "Gen: " + this.gen + "\n" +
                "Varsta: " + this.varsta + "\n" + "Numar de telefon: " + this.numarTeledon + "\n" +
                "Statut: " + this.statut + "\n" + "Simptome: " + this.simptome + "\n" +
                "Alte afectiuni: " + this.alte_Afectiuni + "\n" + "Diagnostic: " + this.diagnostic;
        return  x;
    }
}