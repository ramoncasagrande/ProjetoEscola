public class Aluno extends Pessoa {

    private int turma;
    private String periodo;
    private String presenca = "F";
   
    
    public int getTurma() {
        return turma;
    }
    public void setTurma(int turma) {
        this.turma = turma;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPresenca() {
        return presenca;
    }
    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }
    @Override
    public String toString() {
        return  "Nome: " + getNome()+
                "\nIdade: " + getIdade()+ " anos" +
                "\nPeriodo: " + getPeriodo() +
                "\nTurma: " + getTurma()+
                "\nEndereço: " + getEndereço() +
                "\n";

    }
    
}
