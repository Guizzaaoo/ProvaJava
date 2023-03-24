package JavaProva;

public class Exercicio3 {
    public void Exercicio3() {
        Scanner input = new Scanner(System.in);
    }
     // Ler a quantidade (em Kg) de morangos adquiridos
     System.out.println("Quantidade (em Kg) de morangos adquiridos: ");
     double Morangos = input.nextDouble();

     // Ler a quantidade (em Kg) de maças adquiridas
     System.out.print("Quantidade (em Kg) de maças adquiridas: ");
     double Macas = input.nextDouble();

     // Ler a quantidade (em Kg) de bananas adquiridas
     System.out.print("Quantidade (em Kg) de bananas adquiridas: ");
     double Bananas = input.nextDouble();

     // Calcular o valor total da compra
     double valorTotal = (Morangos * 2.50) + (Macas * 1.80) + (Bananas * 1.30);

     // Verificar se o valor total da compra ultrapassa R$ 25,00 ou se a quantidade total de frutas adquiridas é maior que 8 Kg
     if (valorTotal > 25 || (Morangos + Macas + Bananas) > 8) {
         // Calcular o desconto de 10% sobre o valor total da compra
         double desconto = valorTotal * 0.1;
         valorTotal -= desconto;
     }

     // Exibir o valor a ser pago pelo cliente, considerando o desconto calculado no passo 7 (ou o valor total da compra, caso não haja desconto)
     System.out.println("Valor total da compra: R$ " + valorTotal);

     input.close();
 }

