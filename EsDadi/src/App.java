
public class App {
    public static void main(String[] args) throws Exception {
        Giocatore g1 = new Giocatore("flavio");
        Giocatore g2 = new Giocatore("guido");

        g1.setPriority(10);

        System.out.println("inizio partita");

        g1.start();
        g2.start();

        g1.join();
        g2.join();
        System.out.println("fine partita");
        if(g1.getValoreT() < g2.getValoreT())
        System.out.println(g2.getNome()+ " ha vinto");
        else if(g1.getValoreT() > g2.getValoreT()){
            System.out.println(g1.getNome()+ " ha vinto");
        }else{
            System.out.println("pareggio");
        }

    }
}
