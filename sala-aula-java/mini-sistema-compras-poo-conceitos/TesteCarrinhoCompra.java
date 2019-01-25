import java.util.Scanner;

public class TesteCarrinhoCompra {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Produto p1 = new Produto(0001, "Carrinho", 7.50);
        Produto p2 = new Produto(0002, "Televisao", 1500.00);
        Produto p3 = new Produto(0003, "Xbox One", 1400.00);
        Produto p4 = new Produto(0004, "Playstation 4 ", 2500.00);
        Produto p5 = new Produto(0005, "Iphone 7 ", 4500.00);

        CarrinhoCompra car1 = new CarrinhoCompra();

        Produto[] sete = car1.listarTodos();

        int i = 0;

        System.out.println("------- Carrinho de Compras -------");

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Lista os prudutos disponíveis.");
            System.out.println("2 - Atualiza as informações do produto do carrinho.");
            System.out.println("3 - Remove um produto do carrinho.");
            System.out.println("4 - Busca um produto.");
            System.out.println("5 - Lista os produtos comprados.");
            System.out.println("6 - Finaliza a compra.");
            int opcao = leia.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Produto     Código      Preço");
                    System.out.println("---------------------------------");
                    System.out.println("Carrinho     999            7.50 ");
                    System.out.println("Televisão    777         1500.00 ");
                    System.out.println("Xbox One     888         1400.00 ");
                    System.out.println("Playstation  333         2500.00 ");
                    System.out.println("Iphone 7     111         4500.00 ");

                    System.out.println("\nDigite o código do produto que você deseja: ");
                    int codigo = leia.nextInt();

                    switch (codigo) {

                        case 999:
                            boolean cond = car1.adicionar(p1);
                            if (cond == true) {
                                System.out.println("Produto adicionado ao carrinho!");
                            } else {
                                System.out.println("Não foi possível adicionar o produto ao carrinho.");
                            }
                            break;

                        case 777:
                            boolean cond2 = car1.adicionar(p2);
                            if (cond2 == true) {
                                System.out.println("Produto adicionado ao carrinho!");
                            } else {
                                System.out.println("Não foi possível adicionar o produto ao carrinho.");
                            }
                            break;

                        case 888:
                            boolean cond3 = car1.adicionar(p3);
                            if (cond3 == true) {
                                System.out.println("Produto adicionado ao carrinho!");
                            } else {
                                System.out.println("Não foi possível adicionar o produto ao carrinho.");
                            }
                            break;

                        case 333:
                            boolean cond4 = car1.adicionar(p4);
                            if (cond4 == true) {
                                System.out.println("Produto adicionado ao carrinho!");
                            } else {
                                System.out.println("Não foi possível adicionar o produto ao carrinho.");
                            }
                            break;

                        case 111:
                            boolean cond5 = car1.adicionar(p5);
                            if (cond5 == true) {
                                System.out.println("Produto adicionado ao carrinho!");
                            } else {
                                System.out.println("Não foi possível adicionar o produto ao carrinho.");
                            }
                            break;

                        default:
                            System.out.println("Código digitado inválido! ");
                            break;

                    }

                    break;

                case 2:

                    System.out.println("Digite o nome do poduto que você deseja atualizar:");

                    String prod = leia.nextLine();
                    Produto result = car1.buscarPorNome(prod);
                    
                    System.out.println(result);

                    car1.atualizar(result);

                    break;

                case 4:
                    System.out.println("1 - Buscar por nome, 2 - Buscar por código ");
                    System.out.println("Escolha uma das opções: ");
                    int tipoBusca = leia.nextInt();

                    switch (tipoBusca) {
                        //resolver aqui linha 87
                        case 1:
                            System.out.println("Digite o nome do produto ");
                            String nomeProduto = leia.nextLine();
                            Produto seila0 = car1.buscarPorNome(nomeProduto);

                            if (seila0 != null) {
                                System.out.println(seila0.getNome());
                            }
                            break;
                        //resolver aqui  
                        case 2:
                            System.out.println("Digite o código do produto ");
                            long codigoProduto = leia.nextLong();
                            Produto seila1 = car1.buscarPorCodigo(codigoProduto);
                            //resolver aqui linha 94

                            if (seila1 != null) {
                                System.out.println(seila1.getNome());
                            }

                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;

            }
        } while (i != 6);

        /*for (int i = 0; i < sete.length; i++) {
         if (sete[i] != null) {

         System.out.println(sete[i]);
         }
         }
    
    
         */
    }
}
