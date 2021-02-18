package sistema_unico;


public class Medico {
    private String crm_medico;
    private String nome;
    private int idade;
    private String especialidade;

    public Medico(String crm_medico, String nome, int idade, String especialidade) {
        this.crm_medico = crm_medico;
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    public String getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(String crm_medico) {
        this.crm_medico = crm_medico;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
