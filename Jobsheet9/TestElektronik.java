/**
 * TestElektronik
 */
public class TestElektronik {

    public static void main(String[] args) {

        Manusia m = new Manusia();
        TelevisiModern tv = new TelevisiModern(220, "HDMI");
        TelevisiJadul tv2 = new TelevisiJadul(220, "DVI");
        
        m.nyalakanPerangkat(tv);
        m.nyalakanPerangkat(tv2);

    }
}