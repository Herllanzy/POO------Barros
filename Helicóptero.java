public class Helicoptero {

    private boolean ligado;
    private int altitude;
    private int capacidadeDoHelicoptero;
    private int quantidadeDePessoas;

    public Helicoptero(int capacidadeDoHelicoptero){
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
    }

    public void entra(){
        if (quantidadeDePessoas < 5){
            quantidadeDePessoas = quantidadeDePessoas + 3;
        }
    }
    public void sai(){
        if (quantidadeDePessoas < 5){
            quantidadeDePessoas = quantidadeDePessoas - 3;
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
        this.ligado = ligado;
    }
     //Acessador
     public int getAltitude(){
        return altitude;
    }
    //Modificador 
    public void setAltitude(int novaAltitude){
        this.altitude = novaAltitude;
    } //Acessador
    public int getcapacidadeDoHelicoptero(){
        return capacidadeDoHelicoptero;
    }
    //Modificador 
    public void setcapacidadeDoHelicoptero(int novaCapacidadeDoHelicoptero){
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
    }
     //Acessador
    public int getQuantidade_de_pessoas(){
        return quantidadeDePessoas;
    }
    //Modificador 
    public void setQuantidadeDePessoas(int novaQuantidadeDePessoas){
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public String toString(){
        return String.format("Ligado: %s, Altitude: %d, Capacidade do helicóptero: %d, Quantidade de pessoas : %d", ligado ?  "sim" : "não", altitude, capacidadeDoHelicoptero, quantidadeDePessoas );
    }
}