package edu.wyldner.dio.conexaoMedia;
import java.util.Arrays;
import java.util.Scanner;

public class CalculaComboServicos {

    // Classe para representar um serviço
    static class Servico {
        private double valor;

        public Servico(double valor) {
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }
    }

    // Classe para representar o combo de serviços
    class ComboServicos {
        private Servico[] servicos;
        private double desconto1, desconto2, desconto3;
        private double descontoAdicional = 20.00;

        public ComboServicos(Servico[] servicos, double[] descontos) {
            this.servicos = servicos;
            this.desconto1 = descontos[0];
            this.desconto2 = descontos[1];
            this.desconto3 = descontos[2];
        }

        // Método para calcular o valor total do combo com descontos
        public double calcularValorTotal() {
            // Conta quantos serviços foram contratados (com valor maior que 0)
            int servicosContratados = (int) Arrays.stream(servicos)
                    .filter(servico -> servico.getValor() > 0)
                    .count();

            double desconto = 0;
            // Aplica o desconto correspondente à quantidade de serviços contratados
            switch (servicosContratados) {
                case 1:
                    desconto = desconto1;
                    break;
                case 2:
                    desconto = desconto2;
                    break;
                case 3:
                    desconto = desconto3;
                    break;
            }

            // Calcula o valor total com desconto
            double valorComDesconto = Arrays.stream(servicos)
                    .filter(servico -> servico.getValor() > 0)
                    .mapToDouble(Servico::getValor)
                    .sum() * (1 - desconto / 100);

            // Aplica o desconto adicional de R$ 20,00 se todos os três serviços forem contratados
            if (servicosContratados == 3) {
                valorComDesconto -= descontoAdicional;
            }

            return valorComDesconto;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da primeira linha de entrada (valores dos serviços)
        String[] entrada1 = scanner.nextLine().trim().split(",");
        double[] valoresServicos = Arrays.stream(entrada1)
                .mapToDouble(Double::parseDouble)
                .toArray();

        // Leitura da segunda linha de entrada (percentuais de desconto)
        String[] entrada2 = scanner.nextLine().trim().split(",");
        double[] descontos = Arrays.stream(entrada2)
                .mapToDouble(Double::parseDouble)
                .toArray();

        // Criando objetos Servico
        CalculaComboServicos calculaCombo = new CalculaComboServicos();
        Servico[] servicos = new Servico[valoresServicos.length];
        for (int i = 0; i < valoresServicos.length; i++) {
            servicos[i] = new Servico(valoresServicos[i]);
        }

        // Criando o combo de serviços
        ComboServicos combo = calculaCombo.new ComboServicos(servicos, descontos);

        // Calculando e imprimindo o valor total com desconto
        double valorTotal = combo.calcularValorTotal();
        System.out.printf("%.2f\n", valorTotal);

        scanner.close();
    }
}