public class  Gatto extends Animale {

    //Utilizzo l'override per andarmi a riscrivere il verso dell'animale nel metodo su animale
    @Override
    public void faiIlVerso() {
        System.out.println("Il gatto fà questo verso: Meow");
    }
}

