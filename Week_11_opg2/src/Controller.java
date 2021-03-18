public class Controller {


    public Controller() {

    }

    public static void runController() {
        double userIn = Dialog.doDiag();
        double moms = VAT.doVAT();
        //double moms = 25.5;
        View.doView(moms,ComputeVATBetterStyleOO.MSG);
    }

}

