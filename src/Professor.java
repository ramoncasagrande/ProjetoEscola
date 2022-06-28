public class Professor extends Pessoa {

    private String disciplina;
    private int cargaHoraria;
    
  
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public final String toString() {
        return  "Nome: " + this.getNome()+
                "\nIdade: " + this.getIdade()+ " anos" +
                "\nDisciplina: " + this.getDisciplina() +
                "\n";
    }

    

    

    
}
