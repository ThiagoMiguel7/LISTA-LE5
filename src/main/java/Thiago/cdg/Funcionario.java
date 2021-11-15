package Thiago.cdg;

public class Funcionario {

    private int id;
    private int filhos;
    private String estadoCivil;
    private String grauInstrucao;
    private double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Thiago.cdg.Funcionario{" + "id=" + id + ", filhos=" + filhos + ", estadoCivil='" + estadoCivil + '\'' + ", grauInstrucao='" + grauInstrucao + '\'' + ", salario=" + salario + '}';
    }
}
