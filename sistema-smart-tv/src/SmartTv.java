public class SmartTv{
    boolean ligada=false;
    int canal=2;
    int volume=30;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
   }

    public void desligar(){
        ligada=false;
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
         System.out.println("O volume está diminuindo: " +volume);
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
         System.out.println("O volume está aumentando: " +volume);
    }


    public void aumentarCanal(){
        //canal = canal + 1;
        canal++;
    }

    public void diminuirCanal(){
        //canal = canal - 1;
        canal--;
    }
}

