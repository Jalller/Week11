public class VAT {
    private double number;

    public VAT() {
    }

    public static double doVAT(){
        double VAT = Dialog.doDiag() / 100 * ComputeVATBetterStyleOO.PRCVAT;
        return VAT;
    }
}
