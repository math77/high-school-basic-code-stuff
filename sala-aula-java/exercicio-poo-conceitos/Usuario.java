
import java.util.Date;


public class Usuario {
    
    private String nome;
    private String sobrenome;
    private String contato;
    private String senha;
    private boolean masculino;
    private Date niver;
   
    public Usuario(){
    
    }
    
    public Usuario(String nome, String sobrenome, String contato, String senha, boolean sexo, Date niver){
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.contato = contato;
       this.senha = senha;
       this.masculino = sexo;
       this.niver = niver;
    
    }
    
   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    public String getContato() {
        return contato;
    }

    
    public void setContato(String contato) {
        this.contato = contato;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public boolean getSexo() {
        return masculino;
    }

    
    public void setSexo(boolean sexo) {
        this.masculino = sexo;
    }

    
    public Date getNiver() {
        return niver;
    }

    
    public void setNiver(Date niver) {
        this.niver = niver;
    }
    
    public String toString(){
        return "Nome: " +nome+ "Sobrenome: " +sobrenome+ "Contato: " +contato+ "Senha: " +senha+ "Sexo: " +masculino + " Aniversário: " +niver;
    }
    
    
    
}
