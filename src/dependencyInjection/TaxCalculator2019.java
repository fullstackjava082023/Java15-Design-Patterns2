package dependencyInjection;

public class TaxCalculator2019 implements Calculator{

    public float calculateTax(float bruto) {
        //8%
        return bruto * 0.08f;
    }
}
