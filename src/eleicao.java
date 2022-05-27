import java.util.Scanner;

public class eleicao {
    public static void main(String[] args) throws Exception {
        int candidatoA = 0;
        int candidatoB = 0;
        int candidatoC = 0;
        Scanner in = new Scanner(System.in); 
        System.out.println("Favor inserir o total de eleitores: ");
        int eleitores = in.nextInt();
        for(int i=0;i<eleitores;i++){
            System.out.println("Ola! Escolha entre os tres candidatos: Candidato A (numero 1 ), B (numero 2 ) e C (numero 3) ");
            int voto = in.nextInt();
            if(voto == 1){
                candidatoA++;
            }else if(voto == 2){
                candidatoB++;
            }else if(voto == 3){
                candidatoC++;
            }else{
                System.out.println("Erro! Favor escolher apenas as tres opcoes possiveis (A-1, B-2, C-3");
            }
        }
        if(candidatoA > candidatoB && candidatoA > candidatoC){
            System.out.println("O vencedor foi: Candidato A! ");
        }else if(candidatoB > candidatoA && candidatoB > candidatoC ){
            System.out.println("O vencedor foi: Candidato B!" );
        }else if(candidatoC > candidatoA && candidatoC > candidatoB){
            System.out.println("O vencedor foi: Candidato C! ");
        }else{
            System.out.println("Empate!");
        }
        
        in.close();
    }
}
