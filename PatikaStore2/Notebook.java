public class Notebook {
    private int Imei;
    private int price;
    private int memory;
    private String productName;
    private String brandName;
    private int Ram;
    private float ScreenSize;

    public void setImei(int imei) {
        Imei = imei;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void setMemory(int memory) {
        this.memory = memory;
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

    public int getImei() {
        return Imei;
    }

    public int getPrice() {
        return price;
    }

    public int getMemory() {
        return memory;
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
}
