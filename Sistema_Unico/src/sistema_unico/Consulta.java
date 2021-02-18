/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_unico;

import java.util.Date;


public class Consulta {
    private int id_consulta;
    private Date data;
    private String cpf_paciente;
    Medico medico;

    public Consulta(int id_consulta, Date data, String cpf_paciente, String crm_medico) {
        this.id_consulta = id_consulta;
        this.data = data;
        this.cpf_paciente = cpf_paciente;
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCpf_paciente() {
        return cpf_paciente;
    }

    public void setCpf_paciente(String cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }

}
