package sistema_unico;


public class Paciente {
    private String cpf;
    private String nome;
    private int idade;
    private String contato;
    private String bairro;
    private String rua;
    private String numero;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Paciente(String cpf, String nome, int idade, String contato, String bairro, String rua, String numero) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.contato = contato;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
}
