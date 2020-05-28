package model;

public class User
{
    protected int id;
    protected String parola;
    protected String email;
    protected String nume;
    protected String prenume;
    protected String gen;
    protected int varsta;
    protected String numarTeledon;

    public User()
    {
        this.id = 0;
        this.parola = "";
        this.email = "";
        this.nume = "";
        this.prenume = "";
        this.gen = "";
        this.varsta = 0;
        this.numarTeledon = "";
    }

    public User(int id, String parola, String email, String nume, String prenume, String gen, int varsta,
                String numarTeledon)
    {
        this.id = id;
        this.parola = parola;
        this.email = email;
        this.nume = nume;
        this.prenume = prenume;
        this.gen = gen;
        this.varsta = varsta;
        this.numarTeledon = numarTeledon;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getParola() {return parola;}
    public void setParola(String parola) {this.parola = parola;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getNume() {return nume;}
    public void setNume(String nume) {this.nume = nume;}

    public String getPrenume() {return prenume;}
    public void setPrenume(String prenume) {this.prenume = prenume;}

    public String getGen() {return gen;}
    public void setGen(String gen) {this.gen = gen;}

    public int getVarsta() {return varsta;}
    public void setVarsta(int varsta) {this.varsta = varsta;}

    public String getNumarTeledon() {return numarTeledon;}
    public void setNumarTeledon(String numarTeledon) {this.numarTeledon = numarTeledon;}
}