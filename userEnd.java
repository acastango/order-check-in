import java.util.Scanner;

public class userEnd extends run {
    Scanner scnr = new Scanner(System.in);

    public String input(String msg) {
        r.p(msg);
        return msg;
    }

    public void mMenu() {

        r.p("||++- Order Check-In Tool -++||");
        r.p("|     [1] Verify Order        |");
        r.p("|     [2] Exit Tool           |");
        String response = input("\n Welcome to the automatic order import tool! Choose an option");

        switch (response) {
            case "1":

                break;

            case "2":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        userEnd u = new userEnd();
        u.mMenu();
    }

}
