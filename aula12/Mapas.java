/*1 - Crie um mapa para o cadastro de alunos em uma turma (matricula, nome, disciplina e nota) em uma turma.
2 - Insira 5 alunos na turma.
3 - Liste os alunos cadastrados.
4 - Altere a nota de um aluno.
5 - Exclua um aluno.
6 - Esvazie o mapa. */

import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        Map<String, Aluno> alunos = new TreeMap<>();

        alunos.put("01", new Aluno("01", "Rafael", "Matemática", 10));
        alunos.put("02", new Aluno("02", "Carol", "Biologia", 9));
        alunos.put("03", new Aluno("03", "Davi", "Física", 8));
        alunos.put("04", new Aluno("04", "Izaias", "Química", 7));
        alunos.put("05", new Aluno("05", "Zenaide", "Português", 6));

        
        /*3 - Liste os alunos cadastrados. */
        /* Mostra os elementos do mapa */
        System.out.println("Alunos cadastrados: ");
        for (Map.Entry<String, Aluno > aluno : alunos.entrySet()) {
            aluno.getValue().listarAlunos();
        }
        
        System.out.println("\nAlterando nota do aluno com matrícula 03:");
        if (alunos.containsKey("03")) {
            Aluno alunoParaAlterar = alunos.get("03");
            alunoParaAlterar.setNota(9); // nova nota
            System.out.println("Nova nota do aluno " + alunoParaAlterar.getNome() + ": " + alunoParaAlterar.getNota());
        }


        /* 5 - Exclua um aluno. */
        alunos.remove("01");
        System.out.println("A matricula 01 foi removida do mapa.");
        System.out.println();


        /*6 - Esvazie o mapa. */
        /* Limpa o mapa */
        alunos.clear();
        
        /* Verifica se o mapa está vazio */
        if (alunos.isEmpty()) {
            System.out.println("O mapa esta vazio.");
        }
    }
}

class Aluno {
    private String matricula;
    private String nome;
    private String disciplina;
    private int nota;

    public Aluno(String matricula, String nome, String disciplina, int nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDisciplina (String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setNota (int nota) {
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }

    public void listarAlunos () {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Nota: " + nota);
    }
}
