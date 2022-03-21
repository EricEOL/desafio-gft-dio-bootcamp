package br.com.ericeol.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private int carga_horaria;
    private List<Usuario> usuarios = new ArrayList();

    public Curso(String nome, int carga_horaria) {
        this.nome = nome;
        this.carga_horaria = carga_horaria;
    }

    public int experiencia() {
        return 20 * this.carga_horaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public List<Usuario> getUsuarios() {
        for (Usuario usuario: this.usuarios) System.out.println(usuario);
        return usuarios;
    }

    public void setUsuario(List<Usuario> usuarios) {
        this.usuarios.addAll(usuarios);
        for(Usuario novoInscrito: usuarios) novoInscrito.setCursoAtivo(this);
    }

    public void setUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        usuario.setCursoAtivo(this);
    }

    public void finalizarCurso(Usuario usuario) {

        Boolean usuarioExists = this.usuarios.contains(usuario);

        if(usuarioExists == true) {
            usuario.setExperienciaTotal(this.experiencia());
            this.usuarios.remove(usuario);
            usuario.removerCursoAtivo(this);
            usuario.setCursosFinalizados(this);
            System.out.println("Curso finalizado.");
        } else {
            System.out.println("Esse usuário não está cadastrado neste curso.");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", carga_horaria=" + carga_horaria +
                '}';
    }
}
