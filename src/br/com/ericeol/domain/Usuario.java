package br.com.ericeol.domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String name;
    private String email;
    private List<Curso> cursosAtivos = new ArrayList();
    private List<Curso> cursosFinalizados = new ArrayList();
    private int experienciaTotal;

    public Usuario(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Curso> getcursosAtivos() {
        for (Curso curso: this.cursosAtivos) System.out.println(curso);
        return this.cursosAtivos;
    }

    public void setCursoAtivo(Curso curso) {
        this.cursosAtivos.add(curso);
    }

    public List<Curso> getCursosFinalizados() {
        for (Curso curso: this.cursosFinalizados) System.out.println(curso);
        return this.cursosFinalizados;
    }

    public void setCursosFinalizados(Curso curso) {
        this.cursosFinalizados.add(curso);
    }

    public void removerCursoAtivo(Curso curso) {
        this.cursosAtivos.remove(curso);
    }



    public int getExperienciaTotal() {
        return experienciaTotal;
    }

    public void setExperienciaTotal(int experienciaTotal) {
        this.experienciaTotal = experienciaTotal;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
