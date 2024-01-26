package Insurance;

import java.time.LocalDate;

public class ResidenceInsurance extends Insurance{
    private LocalDate finishDate;
    private LocalDate startDate;

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public void calculate() {
        int dailyPrice = 112;
        double priceWithoutTax= Math.abs(startDate.until(finishDate).getDays()) * dailyPrice;
        double tax = 14.3;
        double priceWithTax= priceWithoutTax + (Math.abs(startDate.until(finishDate).getDays()) * tax) / 100;
        System.out.println(priceWithTax);
    }
}
