import java.text.DecimalFormat;
import java.util.Scanner;

public class montante {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); 
        System.out.println("Digite o capital inicial: ");
        double capital = in.nextFloat();
        System.out.println("Digite a taxa de juros: ");
        float taxa = in.nextFloat();
        System.out.println("Digite o periodo: ");
        int periodo = in.nextInt();
        for(int i=0;i<periodo;i++){
            capital = capital+(capital*taxa/100);
            System.out.println("Mes " + (i+1) + ": " + new DecimalFormat(".##").format(capital) + " Reais");
        }
        in.close();
    }
}
