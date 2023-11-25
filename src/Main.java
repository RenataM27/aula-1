import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        String resultado = "";
        for(i = 1; i < 4; i += 1) {
            System.out.println("Qual é o nome do aluno" + i + "?");
            String nome = scanner.nextLine();
            System.out.println("Qual é o email do aluno" + i + "?");
            String email = scanner.nextLine();
            System.out.println("Qual a primeira nota do aluno" + i + "?");
            double nota1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Qual a segunda nota do aluno" + i + "?");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Qual a terceira nota do aluno" + i + "?");
            double nota3 = scanner.nextDouble();
            scanner.nextLine();
            double media = (nota1 + nota2 + nota3) / 3;
            resultado += "-----------------------------\n";
            resultado += "Resultados para o aluno: \n";
            resultado += "Nome: " + nome + "\n";
            resultado += "Email: " + email + "\n";
            resultado += "Notas: " + nota1 + ", " + nota2 + ", " + nota3 + "\n";
            resultado += "Média: " + String.format("%.1f", media) + "\n";
            if (media >= 7) {
                resultado += "Parabéns, você passou direto. Por acaso você programa em Java?" + "\n";
            } else {
                resultado += "Você foi reprovado. Ainda bem que é só simulação, hein?" + "\n";
            }
        }
        System.out.println(resultado);
        System.out.println("-----------------------------\n");
    }
}