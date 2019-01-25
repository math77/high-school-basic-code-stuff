
/**
 *
 * @author 20151114010668
 */
public class TestePessoa {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        
        p.setNome("Matheus");
        pf.setNome("Gostoso");
        pf.setCpf("777777777");
        
        System.out.println(p.getNome());
        System.out.println(pf.getNome());
        System.out.println(pf.getCpf());
    }
}
