
public class DB extends run {
    public String name;
    public String NDC;
    public String itemNumber;
    public String price;
    public String qty;
    public String packSize;
    public String DrugInfo[] = { name, NDC, itemNumber, price, qty, packSize };

    public DB() {
    }

    public DB(String name, String NDC, String itemNumber, String price, String qty, String packSize) { /// overloaded
                                                                                                       /// constructer,
                                                                                                       /// mainly
        /// for testing
        this.name = name;
        this.NDC = NDC;
        this.itemNumber = itemNumber;
        this.price = price;
        this.qty = qty;
        this.packSize = packSize;
    }

    public void setNDC(String NDC) {
        this.NDC = NDC;
    }

    public String getNDC() {
        return NDC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setItemNum(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemNum() {
        return itemNumber;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setQTY(String qty) {
        this.qty = qty;
    }

    public String getQTY() {
        return qty;
    }

    public void setPkSz(String packSize) {
        this.packSize = packSize;
    }

    public String getPkSz() {
        return packSize;
    }

    public void setDrugInfo(String name, String NDC, String itemNumber, String price, String qty, String packSize) {
        this.name = name;
        this.NDC = NDC;
        this.itemNumber = itemNumber;
        this.price = price;
    }

    public String getDrugInfoString() {
        return "Name: " + name + "\nNDC: " + NDC + "\nItem #: " + itemNumber + "\nPrice: " + price;
    }

    public static void main(String[] args) {
        DB d = new DB();

        d.p("--Drug File--\n" + d.getDrugInfoString()); // just testing drug info string
    }
}
