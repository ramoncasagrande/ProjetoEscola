import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Aluno> alunosMatriculados;
    static ArrayList<Professor> profCadastrado;
        public static void main(String[] args) throws Exception {

            alunosMatriculados = new ArrayList<Aluno>();
            profCadastrado = new ArrayList<Professor>();
            menuInicial();
            
        }

    public static void menuInicial(){
        System.out.println  ("\n| SISTEMA ENTRA21 V2.0     by Ramon Casagrande |");
            System.out.println("|==============================================|");
            System.out.println("|1 - Cadastrar Professor  5 - Remover Professor|");
            System.out.println("|2 - Cadastrar Aluno      6 - Remover Alunos   |");
            System.out.println("|3 - Listar Professores   7 - Fazer Chamada    |");
            System.out.println("|4 - Listar Alunos        8 - Listar Chamada   |");
            System.out.println("|                         9 - SAIR             |");
            System.out.print(" Selecione uma opção =>");
            int op = sc.nextInt();

            switch(op){

                case 1:
                    cadastrarProfessor();
                    break;

                case 2:
                    cadastrarAluno();
                    break;

                case 3:
                    listarProf();
                    break;

                case 4:
                    listarAluno();
                    break;

                case 5:
                    removeProfessor();
                    break;

                case 6:
                    removeAluno();
                    break;

                case 7:
                    fazerChamada();
                    break;

                case 8:
                    listarChamada();
                    break;
                
                case 9:
                    System.out.println("Valeu Falow!!\n");
                    System.exit(0);
                

                default:
                    System.out.println("Opção Inválida!");
                    menuInicial();
                    break;
            }

    }

    public static void cadastrarProfessor() {
        Professor professor = new Professor();
        System.out.println("\n--Cadastro de Novo Professor--");
        sc.nextLine();
        System.out.print("Nome: ");
        professor.setNome(sc.nextLine());
        System.out.print("Idade: ");
        professor.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Endereço: ");
        professor.setEndereço(sc.nextLine());
        System.out.print("Disciplina: ");
        professor.setDisciplina(sc.nextLine());
        System.out.print("Carga Horária: ");
        professor.setCargaHoraria(sc.nextInt());
        profCadastrado.add(professor);
        menuInicial();
    }

    public static void cadastrarAluno(){
       Aluno aluno = new Aluno();
        System.out.println("\n--Cadastro de Novo Aluno--");
        sc.nextLine();
        System.out.print("Nome: ");
        aluno.setNome(sc.nextLine());
        System.out.print("Idade: ");
        aluno.setIdade(sc.nextInt());
        sc.nextLine();
        System.out.print("Endereço: ");
        aluno.setEndereço(sc.nextLine());
        System.out.print("Turma: ");
        aluno.setTurma(sc.nextInt());
        sc.nextLine();
        System.out.print("Período: ");
        aluno.setPeriodo(sc.nextLine());
        alunosMatriculados.add(aluno);
        menuInicial();

        
    }

    public static void listarProf(){
        System.out.println("\n---LISTA DE PROFESSORES---\n");
        profCadastrado.forEach((prof) -> System.out.println(prof));
        menuInicial();
    }

    public static void listarAluno(){
        System.out.println("\n---LISTA DE ALUNOS---\n");
        alunosMatriculados.forEach((alun) -> System.out.println(alun));
        menuInicial();
    }

    public static void removeAluno(){
        System.out.println("\nEscolha o Aluno para Remover");
        int i = 0;
        for (Aluno a : alunosMatriculados){
            System.out.println(i + " - " + a.getNome());
            i++;
        }
        System.out.print("\nNumero do aluno a remover: ");
        int j = sc.nextInt();
        if (j < alunosMatriculados.size()){
            alunosMatriculados.remove(j);
            menuInicial();
        }else{
            System.out.println("Valor Inválido");
            removeAluno();
        }
    }

    public static void removeProfessor(){
        System.out.println("\nEscolha o Professor para Remover");
        int i = 0;
        for (Professor p : profCadastrado){
            System.out.println(i + " - " + p.getNome());
            i++;
        }
        System.out.print("\nNumero do professor a remover: ");
        int j = sc.nextInt();
        if (j < profCadastrado.size()){
            profCadastrado.remove(j);
            menuInicial();
        }else{
            System.out.println("Valor Inválido");
            removeProfessor();
        }
        
    }

    public static void fazerChamada(){
        System.out.println("\nChamada: [P/F]");
        for (Aluno a : alunosMatriculados){
            System.out.print(a.getNome()+": ");
            a.setPresenca(sc.next().toUpperCase());
        }
        menuInicial();
    }

    public static void listarChamada(){
        System.out.println("\nLista de Chamada:\n");
        for (Aluno a : alunosMatriculados){
            System.out.printf("%-10s %s\n",a.getNome(),a.getPresenca());
        }
        menuInicial();
    }

    

    
}
