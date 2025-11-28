public class TestBank {
    public static void main(String[] args) {
        
        // Creamos instancias de los bancos
        Banco sbi = new SBI();
        Banco pnb = new PNB();
        
        System.out.println("--- Comparación de Tasas de Interés ---");

        // Llamamos al método getRateOfInterest() en cada objeto
        // La vinculación (binding) se realiza en tiempo de ejecución (polimorfismo)
        sbi.getRateOfInterest(); 
        pnb.getRateOfInterest();
    }
}public class TestBank {

}
