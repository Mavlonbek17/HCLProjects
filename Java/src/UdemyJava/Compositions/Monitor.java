package UdemyJava.Compositions;

public class Monitor {
    private String Model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        Model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixwlat(int x, int y, String colour){
        System.out.println("Drawing Picture at "+x+""+y+"in color"+colour);

    }


}



