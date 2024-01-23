package dependencyInjection;

import singleton.Root;

public class TaxCalculator2023 implements Calculator{
    @Override
    public float calculateTax(float bruto) {

        Root root3 = Root.getInstance();
        //no tax
        return 0;
    }
}
