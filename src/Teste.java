import com.sun.jdi.Value;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner entradaDados = new Scanner(System.in);

        // Veiculo 1
        Veiculo veiculo1 = new Veiculo();

        System.out.print("Veiculo1 Placa: ");
        veiculo1.setPlaca(entradaDados.nextLine());

        System.out.print("Veiculo1 Marca: ");
        veiculo1.setMarca(entradaDados.nextLine());

        System.out.print("Veiculo1 Modelo: ");
        veiculo1.setModelo(entradaDados.nextLine());

        System.out.print("Veiculo1 Cor: ");
        veiculo1.setCor(entradaDados.nextLine());

        System.out.print("Veiculo1 Velocidade Max: ");
        veiculo1.setVelocMax(entradaDados.nextFloat());

        System.out.print("Veiculo1 Quantidade de Rodas: ");
        veiculo1.setQtdRodas(entradaDados.nextInt());

        System.out.print("Veiculo1 Quantidade pistao: ");
        veiculo1.getMotor().setQtdPist((entradaDados.nextInt()));

        System.out.print("Veiculo1 Potencia Motor: ");
        veiculo1.getMotor().setPotencia(entradaDados.nextInt());
        entradaDados.nextLine();

        System.out.print(veiculo1);
        System.out.println("\n");

        /************************************************************/

        // Veiculo 2
        Veiculo veiculo2 = new Veiculo();


        System.out.print("Veiculo2 Placa: ");
        veiculo2.setPlaca(entradaDados.nextLine());

        System.out.print("Veiculo2 Marca: ");
        veiculo2.setMarca(entradaDados.nextLine());

        System.out.print("Veiculo2 Modelo: ");
        veiculo2.setModelo(entradaDados.nextLine());

        System.out.print("Veiculo2 Cor: ");
        veiculo2.setCor(entradaDados.nextLine());

        System.out.print("Veiculo2 Velocidade Max: ");
        veiculo2.setVelocMax(entradaDados.nextFloat());

        System.out.print("Veiculo2 Quantidade de Rodas: ");
        veiculo2.setQtdRodas(entradaDados.nextInt());

        System.out.print("Veiculo2 Quantidade pistao: ");
        veiculo2.getMotor().setQtdPist((entradaDados.nextInt()));

        System.out.print("Veiculo2 Potencia Motor: ");
        veiculo2.getMotor().setPotencia(entradaDados.nextInt());
        entradaDados.nextLine();

        System.out.print(veiculo2);
        System.out.println("\n");

        /************************************************************/

        // Veiculo 3
        Veiculo veiculo3 = new Veiculo();

        System.out.print("Veiculo3 Placa: ");
        veiculo3.setPlaca(entradaDados.nextLine());

        System.out.print("Veiculo3 Marca: ");
        veiculo3.setMarca(entradaDados.nextLine());

        System.out.print("Veiculo3 Modelo: ");
        veiculo3.setModelo(entradaDados.nextLine());

        System.out.print("Veiculo3 Cor: ");
        veiculo3.setCor(entradaDados.nextLine());

        System.out.print("Veiculo3 Velocidade Max: ");
        veiculo3.setVelocMax(entradaDados.nextFloat());

        System.out.print("Veiculo3 Quantidade de Rodas: ");
        veiculo3.setQtdRodas(entradaDados.nextInt());

        System.out.print("Veiculo3 Quantidade pistao: ");
        veiculo3.getMotor().setQtdPist((entradaDados.nextInt()));

        System.out.print("Veiculo3 Potencia Motor: ");
        veiculo3.getMotor().setPotencia(entradaDados.nextInt());
        entradaDados.nextLine();

        System.out.print(veiculo3);
        System.out.println("\n");

        /************************************************************/

        // Veiculo 4
        Veiculo veiculo4 = new Veiculo();

        System.out.print("Veiculo4 Placa: ");
        veiculo4.setPlaca(entradaDados.nextLine());

        System.out.print("Veiculo4 Marca: ");
        veiculo4.setMarca(entradaDados.nextLine());

        System.out.print("Veiculo4 Modelo: ");
        veiculo4.setModelo(entradaDados.nextLine());

        System.out.print("Veiculo4 Cor: ");
        veiculo4.setCor(entradaDados.nextLine());

        System.out.print("Veiculo4 Velocidade Max: ");
        veiculo4.setVelocMax(entradaDados.nextFloat());

        System.out.print("Veiculo4 Quantidade de Rodas: ");
        veiculo4.setQtdRodas(entradaDados.nextInt());

        System.out.print("Veiculo4 Quantidade pistao: ");
        veiculo4.getMotor().setQtdPist((entradaDados.nextInt()));

        System.out.print("Veiculo4 Potencia Motor: ");
        veiculo4.getMotor().setPotencia(entradaDados.nextInt());
        entradaDados.nextLine();

        System.out.print(veiculo4);
        System.out.println("\n");

        /************************************************************/

        // Veiculo 5
        Veiculo veiculo5 = new Veiculo();

        System.out.print("Veiculo5 Placa: ");
        veiculo5.setPlaca(entradaDados.nextLine());

        System.out.print("Veiculo5 Marca: ");
        veiculo5.setMarca(entradaDados.nextLine());

        System.out.print("Veiculo5 Modelo: ");
        veiculo5.setModelo(entradaDados.nextLine());

        System.out.print("Veiculo5 Cor: ");
        veiculo5.setCor(entradaDados.nextLine());

        System.out.print("Veiculo5 Velocidade Max: ");
        veiculo5.setVelocMax(entradaDados.nextFloat());

        System.out.print("Veiculo5 Quantidade de Rodas: ");
        veiculo5.setQtdRodas(entradaDados.nextInt());

        System.out.print("Veiculo5 Quantidade pistao: ");
        veiculo5.getMotor().setQtdPist((entradaDados.nextInt()));

        System.out.print("Veiculo5 Potencia Motor: ");
        veiculo5.getMotor().setPotencia(entradaDados.nextInt());

        System.out.print(veiculo5);

        
    }
}
