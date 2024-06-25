package org.example.v1;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Алексей");
        Human human2 = new Human("Ольга");
        Human human3 = new Human("Сергей");

        market.acceptToMarket(human1);
        market.update();

        market.acceptToMarket(human2);
        market.update();

        market.acceptToMarket(human3);
        market.update();

    }
}
