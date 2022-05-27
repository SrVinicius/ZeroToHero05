import java.util.Scanner;

public class media {
    public static void main(String[] args) throws Exception {
        float nota = 0;
        float notainput = 0;
        Scanner in = new Scanner(System.in); 
        System.out.println("Digite o numero de alunos: ");
        int alunos = in.nextInt();
        for(int i=0;i<alunos;i++){
            System.out.println("informe a nota "+ (i+1) + ": ");
            notainput = in.nextFloat();
            nota = nota + notainput;
        }
        float media = nota/alunos;
        System.out.println("A media eh: "+ media);
        in.close();
    }
}
