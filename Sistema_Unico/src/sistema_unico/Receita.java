package sistema_unico;


import java.util.Date;


public class Receita {
   private String medicamento;
   private String periodo;
   private String tarja;
   private Date data_inicio;
   private String crm_medico;

    public Receita(String medicamento, String periodo, String tarja, Date data_inicio, String crm_medico) {
        this.medicamento = medicamento;
        this.periodo = periodo;
        this.tarja = tarja;
        this.data_inicio = data_inicio;
        this.crm_medico = crm_medico;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(String crm_medico) {
        this.crm_medico = crm_medico;
    }
    
    
}
