import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileHandler extends run {
    String filename;
    String orderInfoo;
    public ArrayList<DB> ABCList = new ArrayList<>();

    public ArrayList<DB> getABCList() {
        return ABCList;
    }

    public void readFile(String filename) {
        try {
            Scanner scnr = new Scanner(new File(filename));

            while (scnr.hasNext()) {
                String token = scnr.next();
                orderInfoo += token;
            }

        } catch (FileNotFoundException e) {
            r.p("File not found!");
        }

    }

    public void parsePPFile() {
        String orderString = "";
        String itemNumber = "";
        String name = "";
        String NDC = "";
        String packSize = "";
        String qty = "";
        String price = "";
        String orderInfo = "";
        readFile("files/order.csv");
        for (int i = 0; i < orderInfoo.length() - 1; i++) {
            char ii = orderInfoo.charAt(i);
            String iii = "";
            iii += ii;
            if (iii.equals(",")) {

            } else if (!iii.equals(",")) {
                if (i >= 15) {
                    orderString += iii;
                }
            }
        }
        String[] split = orderString.split("\"\"");

        for (int i = 16; i < split.length - 11; i++) {
            orderInfo += split[i] + " ";
        }
        r.p(orderInfo);
        Scanner sc = new Scanner(orderInfo);
        while (sc.hasNext()) {
            itemNumber = sc.next();
            name = sc.next();
            NDC = sc.next();
            packSize = sc.next();
            qty = sc.next();
            price = sc.next();
            DB newDrug = new DB();
            newDrug.setDrugInfo(name, NDC, itemNumber, price, qty, packSize);
            ABCList.add(newDrug);
            if (sc.hasNext()) {
                sc.next();
                sc.next();
                sc.next();
                sc.next();
            } else {
                System.out.print("Done");
            }
            orderInfoo = "";
        }

        sc.close();

    }

    public static void main(String[] args) {
        fileHandler f = new fileHandler();
        comparator c = new comparator();
        f.parsePPFile();
        r.p("\n \n");
        c.compareDrug(f.ABCList.get(0), f.ABCList.get(1));
        // f.parseABCFile();

    }

}
