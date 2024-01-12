public class Phone {
    private int Imei;
    private int Price;
    private String productName;
    private String brandName;
    private int Ram;
    private float ScreenSize;
    private int Battery;
    private int Memory;
    private String Color;

    public void setImei(int imei) {
        Imei = imei;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public void setScreenSize(float screenSize) {
        ScreenSize = screenSize;
    }

    public void setBattery(int battery) {
        Battery = battery;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getImei() {
        return Imei;
    }

    public int getPrice() {
        return Price;
    }


    public String getProductName() {
        return productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getRam() {
        return Ram;
    }

    public float getScreenSize() {
        return ScreenSize;
    }

    public int getBattery() {
        return Battery;
    }

    public int getMemory() {
        return Memory;
    }

    public String getColor() {
        return Color;
    }
}
