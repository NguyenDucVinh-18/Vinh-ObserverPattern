public class Main {
    public static void main(String[] args) {
        Stock Stock1 = new Stock("Iphone 14", 500);
        Investor investor1 = new Investor("Vinh");
        Investor investor2 = new Investor("Hai");
        Investor investor3 = new Investor("Huy");

        Stock1.addObserver(investor1);
        Stock1.addObserver(investor2);
        Stock1.addObserver(investor3);

        Stock1.setPrice(400);
        System.out.println();
        Stock1.setPrice(600);


    }
}