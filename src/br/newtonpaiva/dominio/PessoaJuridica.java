package br.newtonpaiva.dominio;

import java.util.Objects;

public  class PessoaJuridica extends Pessoa{

    private String cnpj;

    @Override
    public void validarDocumento() {
        System.out.println("Validando cnpj");
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }
}
