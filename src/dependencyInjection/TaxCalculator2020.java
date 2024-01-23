package dependencyInjection;

public class TaxCalculator2020 implements Calculator {
    public float calculateTax(float bruto) {
        //10%
        return bruto * 0.1f;
    }

}
