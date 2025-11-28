abstract class Banco {
    abstract void getRateOfInterest();
}

class SBI extends Banco {
    void getRateOfInterest(){
        System.out.println("La taza de interes de SBI es 7%");
    }
}

class PNB extends Banco {
    void getRateOfInterest(){
        System.out.println("La taza de interes de PNB es 5%");
    }
}
