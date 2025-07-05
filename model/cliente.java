package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class cliente {
    private int codigo;
    private String nome;    
    private String cpf;
    private String email;  
    private String telefone;
    private LocalDate dataNascimento;
   
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //fromato de data persoanlizada

    public cliente(int codigo, String nome, String cpf, String email, String telefone, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    //getters e setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
