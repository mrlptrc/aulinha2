public class Main {
    public static void main(String[] args) {
        Notas nota = new Notas();
        boletimUI ui = new boletimUI();

        ui.escrever("A media é "+ ui.calculaMedia());
    }
}
