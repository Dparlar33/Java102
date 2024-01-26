package Insurance;

import java.time.LocalDate;

public abstract class Insurance {
    public String insuranceName;
    public double insurancePrice;
    public LocalDate startDate;
    public LocalDate finishDate;

    public abstract void calculate();
}
