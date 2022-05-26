package UdemyJava.Compositions;

public class Case {
    private String model;
    private String manaufacturer;
    private String powerSupply;
    private Dimesions dimesions;

    public Case(String model, String manaufacturer, String powerSupply, Dimesions dimesions) {
        this.model = model;
        this.manaufacturer = manaufacturer;
        this.powerSupply = powerSupply;
        this.dimesions = dimesions;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManaufacturer() {
        return manaufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimesions getDimesions() {
        return dimesions;
    }
}
