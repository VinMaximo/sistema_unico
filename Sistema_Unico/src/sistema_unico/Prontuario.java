
package sistema_unico;

import java.util.Date;


public class Prontuario {
    private int id_prontuario;
    private String problema;
    private String situacao;
    private String analise;
    private String observacao;
    private Date data;
    Medico medico;
    Paciente paciente;
    private int consulta;

    public Prontuario(int id_prontuario, String problema, String situacao, String analise, String observacao, Date data, String crm_medico, String cpf_paciente, int consulta) {
        this.id_prontuario = id_prontuario;
        this.problema = problema;
        this.situacao = situacao;
        this.analise = analise;
        this.observacao = observacao;
        this.data = data;
        this.consulta = consulta;
    }

    public int getId_prontuario() {
        return id_prontuario;
    }

    public void setId_prontuario(int id_prontuario) {
        this.id_prontuario = id_prontuario;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getAnalise() {
        return analise;
    }

    public void setAnalise(String analise) {
        this.analise = analise;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getConsulta() {
        return consulta;
    }

    public void setConsulta(int consulta) {
        this.consulta = consulta;
    }
    
    
}
