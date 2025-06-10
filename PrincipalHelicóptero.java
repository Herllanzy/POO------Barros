public class PrincipalHelicoptero{                                             
    
    public static void main(String [] args){
        Helicoptero h = new Helicoptero(5);
        Helicoptero m = new Helicoptero(7);
        System.out.println(h);
        System.out.println(m);
        
        h.entra();
        h.ligar();
        h.decolar(200);

        m.entra();
        m.ligar();
        m.decolar(350);
    
        System.out.println("======================");
        System.out.println("======================");
        System.out.println(h);
        System.out.println(m);
        
        h.aterrisar();
        h.desligar();
        h.sai();

        m.aterrisar();
        m.desligar();
        m.sai();

        System.out.println("======================");
        System.out.println("======================");
        System.out.println(h);
        System.out.println(m);
    }

}