
package jposantos.a3;

/*
Classe principal
 */

public class Personagens {
    
    private String nome;
    private String raca;
    private String trabalho;
    private int atributosForca;
    private int atributosAgilidade;
/*Construtor da classe*/
    public Personagens(String n, String r, String t, int f, int a) {
        this.setNome(n);
        this.setRaca(r);
        this.setTrabalho(t);
        this.setAtributosForca(f);
        this.setAtributosAgilidade(a);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public int getAtributosForca() {
        return atributosForca;
    }

    public void setAtributosForca(int atributosForca) {
        this.atributosForca = atributosForca;
    }

    public int getAtributosAgilidade() {
        return atributosAgilidade;
    }

    public void setAtributosAgilidade(int atributosAgilidade) {
        this.atributosAgilidade = atributosAgilidade;
    }
    /*metodos de string, retorna dados para impressão*/
    @Override 
    public String toString(){
        return "Nome: " +this.getNome()+ "| Raca: " +this.getRaca()+ "| Trabalho: " + this.getTrabalho();
    }
    
    public String imprimeAtributos(){
        return "Nome: " +this.getNome()+ " | Raca: " +this.getRaca()+ " | Trabalho: " + this.getTrabalho() + " | Forca: " + this.getAtributosForca() + " | Agilidade: " + this.getAtributosAgilidade();
    }

}


