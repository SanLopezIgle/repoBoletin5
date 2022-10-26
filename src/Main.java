public class Main {
    public static void main(String[] args) {

        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50f);
        consumo1.setPGas(1.98f);

        Consumo consumo2 = new Consumo(56.3f, 23.4f, 100f, 1.97f);

        System.out.println("Consumo medio: " + consumo2.consumoMedio());

        consumo2.setLitros(26f);

        System.out.println("Velocidad: " + consumo2.getVMed());
    }
}