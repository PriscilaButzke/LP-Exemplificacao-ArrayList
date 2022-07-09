package ListaCompras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Priscila Butzke
 */
public class ListaCompras {

    public static ArrayList lista = new ArrayList();

    public static void listar() {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia!");
        } else {
            System.out.println("-- Lista de compras: -- ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + "-" + lista.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int op = 1;

        while (op != 0) {
            System.out.println("--Escolha--"
                    + "\n1 - Adicionar na lista"
                    + "\n2 - Listar compras"
                    + "\n3 - Remover item por código"
                    + "\n4 - Remover item por nome"
                    + "\n5 - Alterar item"
                    + "\n0 - Sair");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    ler.nextLine();//limpar o buffer
                    System.out.println("Informe o item que deseja comprar: ");
                    lista.add(ler.nextLine());
                    System.out.println("Item salvo com sucesso!");
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    
                    if (lista.isEmpty()) {
                        System.out.println("Impossível excluir, lista vazia!");
                    } else {
                        listar();
                        int i;
                        System.out.println("Qual item deseja excluir ?");
                        i = ler.nextInt();
                        if (i > 0 && i <= lista.size()) {
                            lista.remove((i - 1));
                            System.out.println("Item removido");
                            listar();
                        } else {
                            System.out.println("Impossível remover, item não existe.");
                        }
                    }
                    break;
                case 4:
                     if (lista.isEmpty()) {
                        System.out.println("Impossível excluir, lista vazia!");
                    } else {
                        listar();
                        ler.nextLine(); //limpar buffer
                        System.out.println("Qual item deseja excluir ? ");
                        String item = ler.nextLine();
                        
                            for (int j = 0; j < lista.size(); j++) {
                                if (item.equals(lista.get(j))) {
                                    lista.remove(j);
                                    System.out.println("Item removido");
                                    listar();
                                }
                            }
                    }
                    break;
                case 5:
                   
                    if (lista.isEmpty()) {
                        System.out.println("Impossível alterar, lista vazia!");
                    } else {
                        listar();
                        System.out.println("Qual item deseja Alterar ? ");
                        int i = ler.nextInt();
                        if (i > 0 && i <= lista.size()) {
                            ler.nextInt();
                            System.out.println("Digite o novo item: ");
                            lista.set((i - 1), ler.nextLine());
                            listar();
                        } else {
                            System.out.println("Impossível remover, item não existe.");
                        }

                    }
                    break;
                case 6: 
                    if (lista.isEmpty()) {
                        System.out.println("Impossível alterar, lista vazia!");
                    } else {
                        listar();
                        ler.nextLine(); //limpar buffer
                        String item = null,novoItem;
                        
                        System.out.println("Qual item deseja alterar ? ");
                        item = ler.nextLine();
                        
                            for (int j = 0; j < lista.size(); j++) {
                                if (item.equals(lista.get(j))) {
                                    System.out.println("Novo item: ");
                                    novoItem = ler.nextLine();
                                    lista.set(j,novoItem);
                                    System.out.println("Item alterado");
                                    listar();
                                }
                            }
                    }
                    break;
            }
        }
    }
}
