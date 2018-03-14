package Exercicio02;

public class Usuario {

	private final int id;
	private final String nome;
	private final String cpf;
	private final String email;
	private final String telefone;

  Usuario(int uId, String uNome, String uCpf, String uEmail, String uTelefone){
    this.id = uId;
    this.nome = uNome;
    this.cpf = uCpf;
    this.email = uEmail;
    this.telefone = uTelefone;
}
 
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
  

}
