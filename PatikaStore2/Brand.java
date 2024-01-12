public class Brand {
    private int brandId;
    private String brandName;
    public Brand(int brandId,String brandName){
        this.brandId=brandId;
        this.brandName =brandName;
    }
    public String getBrandName() {
        return brandName;
    }

    public int getBrandId() {
        return brandId;
    }

}
