package com.example.agenda.model;

// Todo esto sin getters y setter ni el constructor
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private boolean favorito;

    public Contacto(String nombre, String telefono, String email, boolean favorito){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.favorito = favorito;
    }

    public Contacto(){}

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

}
