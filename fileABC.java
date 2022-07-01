import java.util.*;
import java.io.*;

class fileABC extends run {
    public String name;
    public String quantity;
    public String itemNumber;
    public String NDC;
    public String price;
    public char qty;
    public String newname;

    public void parser() {
        String orderString = "90 10191006 EMGALITY 120 PFP 2 EA 2 EA 2 EA 00002-1436-11 - - $639.42 $1278.84";
        Scanner scn = new Scanner(orderString);
        String e = "EA";
        while (scn.hasNext()) {
            scn.next(); /// skipping line # field
            itemNumber = scn.next();
            while (!scn.next().equals("EA")) {
                name += scn.next() + " ";
            }
            qty = name.charAt(name.length() - 2);
            newname = name.substring(0, name.length() - 1);
            quantity = qty + " " + e;
            scn.next(); /// skipping extra fields
            scn.next();
            scn.next();
            scn.next();
            NDC = scn.next();
            if (!scn.next().startsWith("$")) {
                scn.next();
            }
            price = scn.next();
            scn.next();
            System.out.println("Name: " + newname + "\nQty: " + quantity + "\nItem #: "
                    + itemNumber + "\nNDC: " + NDC + "\nPrice: " + price);
            DB d = new DB(name, NDC, itemNumber, price, quantity, " ");
            r.p(d.getDrugInfoString());
        }
    }

    // public String takeInput() {

    // }
    public static void main(String[] args) {
        fileABC f = new fileABC();
        f.parser();
    }
}