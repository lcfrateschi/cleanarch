package com.frateschi.cleanarch.core.domain;

public class Address {

    private String street;
    private String cidade;
    private String estado;

    public Address(){

    }
    public Address(String street, String cidade, String estado) {
        this.street = street;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
