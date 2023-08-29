import java.util.Scanner;

public class boletimUI {
    Notas notas = new Notas();
    public Scanner sc = new Scanner(System.in);

    public double calculaMedia(){

        double media;
        notas.setNota1(pedirNota("Insira sua nota 1:", 0, 10));
        notas.setNota2(pedirNota("Insira sua nota 2:", 0, 10));
        notas.setNota3(pedirNota("Insira sua nota 3:", 0, 10));

        media = (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3.0;

        return media;
    }

    public double pedirNota(String msg, double min, double max){
        double valor = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            try{
                System.out.println(msg);
                valor = sc.nextDouble();

                if (valor < 0 || valor > 10){
                    throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
                }

                entradaValida = true;

            } catch (java.util.InputMismatchException e){
                sc.nextLine();
                escrever("Entrada inválida, digite um valor numérico");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        return valor;
    }

    public String escrever(String msg){
        System.out.println(msg);
        return msg;
    }
}
