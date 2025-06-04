public class PrincipalHelicóptero{                                             
    
    public static void main(String [] args){
        Helicóptero h = new Helicóptero(5);
        Helicóptero m = new Helicóptero(7);
        System.out.println(h);
        System.out.println(m);
        
        h.entra();
        h.ligar();
        h.decolar();

        m.entra();
        m.ligar();
        m.decolar();
    
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