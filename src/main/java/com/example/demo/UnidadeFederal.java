package com.example.demo;

import java.util.Scanner;

public enum UnidadeFederal {
    RJ("Rio de Janeiro", "Sudeste", "RJ"),
    SP("São Paulo", "Sudeste", "SP"),
    MG("Minas Gerais", "Sudeste", "MG"),
    ES("Espírito Santo", "Sudeste", "ES"),

    SC("Santa Catarina", "Sul", "SC"),
    PR("Paraná", "Sul", "PR"),
    RS("Rio Grande do Sul", "Sul", "RS"),

    GO("Goiás", "Centro-Oeste", "GO"),
    MS("Mato Grosso do Sul", "Centro-Oeste", "MS"),
    MT("Mato Grosso", "Centro-Oeste", "MT"),

    TO("Tocantins", "Norte", "TO"),
    PA("Pará", "Norte", "PA"),
    AM("Amazonas", "Norte", "AM"),
    AC("Acre", "Norte", "AC"),
    RO("Roraima", "Norte", "RO"),

    BA("Bahia", "Nordeste", "BA"),
    SE("Sergipe", "Nordeste", "SE"),
    AL("Alagoas", "Nordeste", "AL"),
    PE("Pernambuco", "Nordeste", "PE"),
    PB("Paraíba", "Nordeste", "PB"),
    RN("Rio Grande do Norte", "Nordeste", "RN"),
    CE("Ceará", "Nordeste", "CE"),
    PI("Piauí", "Nordeste", "PI"),
    MA("Maranhão", "Nordeste", "MA");

    private final String nome;
    private final String uf;
    private final String regiao;

    private UnidadeFederal(String nome, String regiao, String uf) {
        this.nome = nome;
        this.regiao = regiao;
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }

    public String getNome() {
        return nome;
    }
    public String getRegiao() {
        return regiao;
    }

    // public static UnidadeFederal fromUf(String uf){
    //     for(UnidadeFederal estado : UnidadeFederal.values()){
    //         if (estado.getUf().equals(uf)){
    //             return estado;
    //         }
    //     }
    //     throw new IllegalArgumentException("UF inválida" + uf);
    // }

}
