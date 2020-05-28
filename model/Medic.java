package model;

public class Medic extends User
{
    private String specializare;

    public Medic()
    {
        super();
        this.specializare = "";
    }

    public Medic(int id, String parola, String email, String nume, String prenume, String gen, int varsta,
                 String numarTelefon, String specializare)
    {
        super(id, parola, email, nume, prenume, gen, varsta, numarTelefon);
        this.specializare = specializare;
    }

    public void setSpecializare(String specializare) {this.specializare = specializare;}
    public String getSpecializare() {return this.specializare;}

    @Override
    public String toString()
    {
        String x = "ID: " + this.id + "\n" + "Parola: " + this.parola +  "\n" + "Email: " + this.email + "\n" +
                "Nume: " + this.nume + "\n" + "Prenume: " + this.prenume + "Gen: " + this.gen + "\n" +
                "Varsta: " + this.varsta + "\n" + "Numar de telefon: " + this.numarTeledon +
                "Specializare: " + this.specializare;
        return  x;
    }
}