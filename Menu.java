
package jposantos.a3;

/**
 *
 * @author jposantos
 */

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    UsaPersonagem use = new UsaPersonagem();
    
    /*
    Função responsável por exibir e controlar as opções do menu
    */
    /**/
    public void exibirMenu(){
        char Opcao;

        do{
            System.out.println(" ");
            System.out.println("| -------- Menu -------- |");
            System.out.println("| Selecione uma opcao:   |");
            System.out.println("| 1 - Criar Personagem   |");
            System.out.println("| 2 - Listar Pesonagens  |");
            System.out.println("| 3 - Buscar Pesonagens  |");
            System.out.println("| 4 - Sair               |");
            System.out.println("| ---------------------- |");
            System.out.print("Escolha a opcao desejada:\n ");
            Opcao = sc.next().charAt(0);
            this.opcoesMenu(Opcao);
        } while (Opcao != '4');
    }
    
    public void opcoesMenu(char Opcao){
        switch(Opcao){
            case '1':
                use.criarPersonagem();
                break;
            case '2':
                use.listarPersonagens();
                break;
            case '3':
                use.buscarPersonangens();
                break;
            case '4':
                System.out.println("Saindo");
                break;
            default:  
             System.out.println("Opcao Invalida");
                break;
        } 
    }
}
