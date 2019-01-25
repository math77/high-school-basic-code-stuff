public class CarrinhoCompra {

    private Produto[] produtos;

    public CarrinhoCompra() {
        this.produtos = new Produto[7];
    }

    public boolean adicionar(Produto produto) {

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public Produto[] listarTodos() {
        return produtos;
    }

    public boolean remover(Produto produto) {

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == produto) {
                produtos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean atualizar(Produto produto) {

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].equals(produto)) {
                System.out.println(produto.getNome() + "\n" + produto.getCodigo() + "\n" + produto.getPreco());
                return true;
            }
        }
        
        return false;

    }

    //resolver aqui linha 54

    public Produto buscarPorNome(String nome) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getNome().equalsIgnoreCase(nome)) {
                return produtos[i];
            }
        }
        return null;
    }

    //resolver aqui linha 63

    public Produto buscarPorCodigo(long codigo) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].getCodigo() == codigo) {
                return produtos[i];
            }
        }

        return null;

    }
}
