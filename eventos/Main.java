package eventos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import eventos.dominio.Evento;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestão de Eventos do IFBA - LP-I");

        //System.out.println(e1.getNome());
        Evento e1 = new Evento("Semana Científica", "10/11/2026", "Auditório", 200);
        System.out.println(e1.resumo());
        Evento e2 = new Evento("Oficina de Gamemaker", "31/10/2026", "Mirante", 200);
        System.out.println(e2.resumo());
        
        Scanner scanner = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String n = scanner.nextLine();
            System.out.println("Turma: ");
            String t = scanner.nextLine();
            System.out.println("Nota: ");
            int s = scanner.nextInt();
            System.out.println("Email: ");
            String e = scanner.nextLine();
            System.out.println("Idade: ");
            int age = scanner.nextInt();

            Aluno a1 = new Aluno(n, t, s, e, age);
        }

        for (Aluno a1 : alunos) {
            System.out.println("Nome: " + a1.nome);
            System.out.println("Turma: " + a1.turma);
            System.out.println("Nota: " + a1.nota);
            System.out.println("Email: " + a1.email);
            System.out.println("Idade: " + a1.idade);
            alunos.add(a1);
        }
    }
}
