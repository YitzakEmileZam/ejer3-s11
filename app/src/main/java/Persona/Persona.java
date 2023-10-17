package Persona;

public class Persona {
    int id, imgId;
    String nom,cel,correo,profesion;

    public Persona(int id, int imgId, String nom, String cel, String correo, String profesion) {
        this.id = id;
        this.imgId = imgId;
        this.nom = nom;
        this.cel = cel;
        this.correo = correo;
        this.profesion = profesion;
    }

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
