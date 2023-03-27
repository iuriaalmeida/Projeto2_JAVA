package br.com.escolaweb.controller;

import br.com.escolaweb.model.Aluno;

public class AlunoController {
    
    public void cadastrar(Aluno aluno) throws Exception {
        if (aluno.getNome().equalsIgnoreCase(null)) {
            throw new Exception("Nome em branco!");
        } 
        if (aluno.getEmail().equalsIgnoreCase(null)) {
            throw new Exception("Email em branco!");
        } else if (aluno.getEmail().indexOf("@") == -1
                || aluno.getEmail().indexOf(".") == -1){
            throw new Exception("Email invalido!")
            }
        if (aluno.getDataNasc().equals(null)) {
            throw new Exception("Data de Nascimento em branco!");
        }
        if (aluno.getSenha().equalsIgnoreCase(null)) {
            throw new Exception("Senha em branco!");
        } else if (aluno.getEmail().length() < 8) {
            throw new Exception("Senha Invalida!");
        }
    }
}
