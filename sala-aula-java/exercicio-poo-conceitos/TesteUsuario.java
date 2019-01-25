
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TesteUsuario {
    public static void main(String[] args) throws ParseException {
        Scanner leia = new Scanner(System.in);
        
        Usuario usuario1 = new Usuario();
        
        usuario1.setNome("Montgomery");
        usuario1.setSobrenome("Burns");
        usuario1.setContato("sr.burns@gmail.com");
        usuario1.setSenha("usina123");
        usuario1.setSexo(false);
        
        System.out.println(usuario1.toString());
        
        
        Usuario usuario2 = new Usuario();
        
        System.out.println("Digite seu nome: ");
        String nome = leia.next();
        usuario2.setNome(nome);
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = leia.next();
        usuario2.setSobrenome(sobrenome);
        
        System.out.println("Digite o seu contato: ");
        String contato = leia.nextLine();
        usuario2.setContato(contato);
        
        
        
        
        
        System.out.println("Digite seu aniversário: ");
        String data = leia.next();
        
        String formatoData = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatoData);
        
        Date aniversario = dateFormat.parse(data);
        
        
      
        
    }
}
