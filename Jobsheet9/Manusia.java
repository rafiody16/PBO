public class Manusia {

    public void nyalakanPerangkat (Elektronik perangkat) {
        if (perangkat instanceof TelevisiModern) {
            System.out.println(((TelevisiModern) perangkat).getModelInput());
            System.out.println("Voltase televisi: " + perangkat.getVoltase());
        } else if (perangkat instanceof TelevisiJadul) {
            System.out.println(((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase televisi: " + perangkat.getVoltase());
            
        }
    }
    
}
