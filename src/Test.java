import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5]; // Armazenará 5 veículos

        // Loop para criar 5 veículos
        for (int i = 0; i < 5; i++) {
            veiculos[i] = new Veiculo(); // Cria um novo objeto Veiculo
            System.out.println("Cadastro do Veículo " + (i + 1));

            // Recebe os dados do veículo
            System.out.print("Placa: ");
            veiculos[i].setPlaca(entradaDados.nextLine());

            System.out.print("Marca: ");
            veiculos[i].setMarca(entradaDados.nextLine());

            System.out.print("Modelo: ");
            veiculos[i].setModelo(entradaDados.nextLine());

            System.out.print("Cor: ");
            veiculos[i].setCor(entradaDados.nextLine());

            System.out.print("Velocidade Máxima: ");
            veiculos[i].setVelocMax(entradaDados.nextFloat());

            System.out.print("Quantidade de Rodas: ");
            veiculos[i].setQtdRodas(entradaDados.nextInt());

            // Motor
            Motor motor = new Motor();
            System.out.print("Quantidade de Pistões do Motor: ");
            motor.setQtdPist(entradaDados.nextInt());

            System.out.print("Potência do Motor: ");
            motor.setPotencia(entradaDados.nextInt());

            veiculos[i].setMotor(motor);

            // Limpa o buffer do scanner
            entradaDados.nextLine();
        }

        // Exibe os dados dos veículos cadastrados
        System.out.println("\nVeículos cadastrados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Veículo " + (i + 1) + ":");
            System.out.println("Placa: " + veiculos[i].getPlaca());
            System.out.println("Marca: " + veiculos[i].getMarca());
            System.out.println("Modelo: " + veiculos[i].getModelo());
            System.out.println("Cor: " + veiculos[i].getCor());
            System.out.println("Velocidade Máxima: " + veiculos[i].getVelocMax());
            System.out.println("Quantidade de Rodas: " + veiculos[i].getQtdRodas());
            System.out.println("Motor: " + veiculos[i].getMotor().getQtdPist() + " pistões, " +
                    veiculos[i].getMotor().getPotencia() + " de potência");
        }

        entradaDados.close();
    }
}
