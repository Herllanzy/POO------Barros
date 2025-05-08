public class Circulo {
    private float raio;
    private float pi;

    public Circulo (float raio){
        this.raio = raio;
        this.pi = 3.141516f;
    }

    public float calcularArea(){
        return pi * raio * raio;
    }
    
    public float calcularPerimetro(){
        return 2 * pi * raio;
    }

    public void imprimir(){
        System.out.printf("Raio: %f, pi: %f, Área: %f, Perîmetro: %f  \n", raio, pi, calcularArea(), calcularPerimetro());
    }

}
