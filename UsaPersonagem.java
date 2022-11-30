
package jposantos.a3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jposantos
 */
public class UsaPersonagem {
    /*Declarando dados da classe personagem*/
    Scanner sc = new Scanner(System.in);
    ArrayList<Personagens> Lista = new ArrayList<>();
    
     /*Criação de 7 personagens para teste*/
    public ArrayList preenchePersonagem(ArrayList Lista){
        Lista.add(new Personagens("Joao", "humano","carpinteiro", 5, 5 ));
        Lista.add(new Personagens("Leo", "orc","pescador", 5, 5 ));
        Lista.add(new Personagens("Jose", "humano","pedreiro", 5, 5 ));
        Lista.add(new Personagens("Rafael", "humano","carpinteiro", 5, 5 ));
        Lista.add(new Personagens("Adailton", "humano","carpinteiro", 5, 5 ));
        Lista.add(new Personagens("Ze", "anao","carpinteiro", 5, 5 ));
        Lista.add(new Personagens("Miraldo", "humano","carpinteiro", 5, 5 ));
        
        return Lista;
    }
   
   ArrayList<Personagens> NovosPersonagens = preenchePersonagem(Lista);
    /*Metodo para criação de novos personagens pelo usuario*/
    public void criarPersonagem(){
        char Controle = 's';
        do{
            System.out.println("Informe um nome");
            String nome = sc.next();
            String raca = null;
            String trabalho = null;
            int pontosRestantes = 10;
            int atributoForca = 0;
            int atributoAgilidade = 0;
            String Opcao;
            do{
            System.out.println("Selecione sua raca");
            System.out.println("1 - Humano");
            System.out.println("2 - Orc");
            System.out.println("3 - Anao");
            Opcao = sc.next();
            /*Seleciona a raça do personagem*/
                switch(Opcao){
                    case "1":
                        raca = "humano";
                        Opcao = "4";
                        break;
                    case "2":
                        raca = "orc";
                        Opcao = "4";
                        break;
                    case "3":
                        raca = "anao";
                        Opcao = "4";
                        break;
                    case "4":
                        Opcao = "0";
                        System.out.println("Opcao invalida");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        Opcao = "0";
                        break;
                }
            } while (Opcao != "4");

            do{
            System.out.println("Selecione seu trabalho");
            System.out.println("1 - Carpinteiro");
            System.out.println("2 - Pedreiro");
            System.out.println("3 - Pescador");
            Opcao = sc.next();
             /*Seleciona O TRABALHO do personagem*/
                switch(Opcao){
                    case "1":
                        trabalho = "carpinteiro";
                        Opcao = "4";
                        break;
                    case "2":
                        trabalho = "pedreiro";
                        Opcao = "4";
                        break;
                    case "3":
                        trabalho = "pescador";
                        Opcao = "4";
                        break;
                    case "4":
                        Opcao = "0";
                        System.out.println("Opcao invalida");
                        break;
                    default:
                        System.out.println("Opcao invalida");
                        Opcao = "0";
                        break;
                }
            } while (Opcao != "4");
            
             /*Distribu~ção de atributos do personagem*/
            do{
                System.out.println("Pontos Restantes: " +pontosRestantes);
                System.out.println("Informe quantos pontos deseja adicionar em forca");
                atributoForca = sc.nextInt();
                pontosRestantes -= atributoForca;
                if (pontosRestantes <=0 ) {
                    System.out.println("Pontos de atributos acabaram");
                } else {
                   System.out.println("Pontos Restantes: " +pontosRestantes);
                   System.out.println("Informe quantos pontos deseja adicionar em agilidade");
                   atributoAgilidade = sc.nextInt();
                   pontosRestantes -= atributoAgilidade;
                }
            } while (pontosRestantes != 0);
                /*Adiciona os personagens criados no Arraylist*/
            Personagens p = new Personagens(nome, raca, trabalho, atributoForca, atributoAgilidade);
            NovosPersonagens.add(p);
            System.out.println("Deseja cadastrar mais algum personagem? S ou N?");
            Controle = sc.next().charAt(0);
        } while (Controle == 's' || Controle == 'S');
    }
    /*Metodos para Imprimi a lista de personagens criados*/
    public void listarPersonagens(){
        for (Personagens i: NovosPersonagens) {
            System.out.println(i);
        }
    }
    /*Metodo para buscar os personagens pelo nome*/
    public void buscarPersonangens(){
        System.out.println("Informe o nome do personagem que deseja buscar");
        String nome = sc.next();
        int size = NovosPersonagens.size();
        
        for (int i=0; i<size; i++) {
            String nomeCompara = NovosPersonagens.get(i).getNome();
            if (nome.equals(nomeCompara)) {
                System.out.println(NovosPersonagens.get(i).imprimeAtributos());
            }
        }
    }
    
}
        
    
