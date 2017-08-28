/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author kelwin
 */
public class Moradores {
    private String Nome;
    private String Apelido;
    private String Curso;
    private String Ano_ingresso;

    public Moradores(String Nome, String Apelido, String Curso, String Ano_ingresso) {
        this.Nome = Nome;
        this.Apelido = Apelido;
        this.Curso = Curso;
        this.Ano_ingresso = Ano_ingresso;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getAno_ingresso() {
        return Ano_ingresso;
    }

    public void setAno_ingresso(String Ano_ingresso) {
        this.Ano_ingresso = Ano_ingresso;
    }
}
