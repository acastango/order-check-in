
public class comparator extends run {
    DB drug1 = new DB(); // * our drugs that we compare */
    DB drug2 = new DB();
    public String ABCFinal[] = {};

    public void compareDrug(DB drug1, DB drug2) { // method to compare vendor drug info vs pharmacy
        if (drug1.getDrugInfoString().equals(drug2.getDrugInfoString())) {
            r.p("No errors, nice! :)"); // if they match = good

        } else if (!drug1.getDrugInfoString().equals(drug2.getDrugInfoString())) {
            r.p("Discrepancy found, please view below:\nVENDOR INFO: \n" + drug1.getDrugInfoString() + "\n"
                    + "PHARMACY INFO:\n" + drug2.getDrugInfoString());
        }
    }

    public String[] printDrugInfo() {
        return ABCFinal;
    }

    public static void main(String[] args) {
        fileHandler f = new fileHandler();
        comparator c = new comparator();

        c.compareDrug(f.ABCList.get(0), f.ABCList.get(1));

    }

}
