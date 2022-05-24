
public class Giocatore extends Thread{
    private int valoreT=0;
    private int valoreP;
    private int valore;
    private String nome;
    private static boolean primo = true;
    private  boolean terzoT = true;

    public Giocatore(String nome){
        Thread.currentThread().setName(nome);
        this.nome = nome;
    }

    public void run()
    {
        
            if(primo){
                try {
                    primo = false;
                    sleep(1000);
                    
                } catch (InterruptedException e) {}
            }
        
        
        
        for(int i = 0; i<2 ; i++)
        {
            do{
                valore = (int) (Math.random() * 7);
            }while(valore == 0);
            valoreT += valore;
            System.out.println(nome +" a ottenuto " + valore);
            if(valoreP == valore && terzoT){
                i--;
                terzoT = false;
                System.out.println(nome +" a ottenuto un lancio bonus");
            }
            valoreP = valore;
        }

        System.out.println(nome +" a totalizzato " + valoreT + " punti");


    } 


    public int getValoreT() {
        return this.valoreT;
    }

    public void setValoreT(int valoreT) {
        this.valoreT = valoreT;
    }

    public int getValoreP() {
        return this.valoreP;
    }

    public void setValoreP(int valoreP) {
        this.valoreP = valoreP;
    }

    public int getValore() {
        return this.valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

}