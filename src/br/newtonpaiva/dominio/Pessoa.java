package br.newtonpaiva.dominio;

public  abstract class Pessoa {
    private String nome;


    public abstract void validarDocumento();


    public String getnome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
