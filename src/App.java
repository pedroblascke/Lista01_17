import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
       int area;
       double litros,latas,preco_lata,galao,preco_galao;
       double litros_mix,mix_latas,mix_galao,valor_mix; 


        Scanner teclado = new Scanner(System.in); 
      
       System.out.print("Digite em metros quadrados o tamanho da área a ser pintada: ");
            area = teclado.nextInt();
      
            litros = (area / 6);
            latas = Math.ceil(litros / 18);
            preco_lata = latas * 80.00;
            galao = Math.ceil(litros / 3.6);
            preco_galao = galao * 25;

            litros_mix = (area / 6) * 1.1;
            mix_latas = Math.ceil(litros_mix / 18);
            mix_galao = Math.ceil((litros_mix - mix_latas * 18) / 3.6);

            if ((litros_mix - (mix_latas * 18) % 3.6 != 0)) {
                mix_galao += 1;
            }
            valor_mix = (mix_latas * 80) + (mix_galao * 25);



         System.out.println("A.  Se você comprar somente latas terá que comprar " + latas + " latas de tinta!");
         System.out.println("    E o valor ficará R$ " + preco_lata);

         System.out.println("B.  Já em galões terá de comprar " + galao + " galões de 3,6 litros!");
         System.out.println("    E o valor ficará R$ " + preco_galao);

         System.out.println("C.  E caso você prefira misturar ambos" + mix_latas + " latas e " + mix_galao + " galões serão nescessários!");
         System.out.println("    E o valor ficará R$ " + valor_mix);  
         teclado.close();
         
          }
        }