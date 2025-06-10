public class Helicoptero {

    private boolean ligado;
    private int altitude;
    private int capacidadeDoHelicoptero;
    private int quantidadeDePessoas;

    public Helicoptero(int capacidadeDoHelicoptero){
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
    }

    public void entra(){
        if (quantidadeDePessoas + 1 <= capacidadeDoHelicoptero){
            quantidadeDePessoas += 1; 
        }
    }
    public void sai(){
        if (quantidadeDePessoas >= 1){
            quantidadeDePessoas -= 1;
        }
    }

    public void ligar(){
        if (ligado == false){  
            ligado = true;
        }
    }

    public void decolar(int novaAltitude){
        if (ligado == true && altitude == 0){
            altitude = novaAltitude;
        }
    }

    public void aterrisar(){
        if (ligado == true && altitude > 0){
            altitude = 0;
        }
    }

    public void desligar(){
        if (ligado == true && altitude == 0){
            ligado = false;
        }
    }


    //Acessador
     public boolean getLigado(){
        return ligado;
    }
    //Modificador 
    public void setLigado(boolean novoLigado){
        this.ligado = novoLigado;
    }
     //Acessador
     public int getAltitude(){
        return altitude;
    }
    //Modificador 
    public void setAltitude(int novaAltitude){
        this.altitude = novaAltitude;
    } //Acessador
    public int getCapacidadeDoHelicoptero(){
        return capacidadeDoHelicoptero;
    }
    //Modificador 
    public void setCapacidadeDoHelicoptero(int novaCapacidadeDoHelicoptero){
        this.capacidadeDoHelicoptero = novaCapacidadeDoHelicoptero;
    }
     //Acessador
    public int getQuantidade_de_pessoas(){
        return quantidadeDePessoas;
    }
    //Modificador 
    public void setQuantidadeDePessoas(int novaQuantidadeDePessoas){
        this.quantidadeDePessoas = novaQuantidadeDePessoas;
    }

    public String toString(){
        return String.format("Ligado: %s, Altitude: %d, Capacidade do helicóptero: %d, Quantidade de pessoas : %d", ligado ?  "sim" : "não", altitude, capacidadeDoHelicoptero, quantidadeDePessoas );
    }
}