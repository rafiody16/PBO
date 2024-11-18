public class TelevisiJadul extends Elektronik{

    private String modelInput;

    public TelevisiJadul(int voltase, String modelInput) {
        super(voltase);
        this.modelInput = modelInput;
    }

    public String getModelInput() {
        return "Nyalakan televisi jadul dengan input: " + modelInput;
    }
    
}
