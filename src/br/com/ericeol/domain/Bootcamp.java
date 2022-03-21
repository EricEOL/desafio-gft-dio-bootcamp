package br.com.ericeol.domain;

import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private String descricao;
    private List<Curso> cursos = new ArrayList();
    private List<Usuario> usuarios = new ArrayList();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> novosInscritos) {
        this.usuarios.addAll(novosInscritos);
        for (Curso curso: this.cursos) curso.setUsuario(novosInscritos);
    }

    public void setUsuarios(Usuario usuario) {
        this.usuarios.add(usuario);
        for (Curso curso: this.cursos) curso.setUsuario(usuario);
    }
}
