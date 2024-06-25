package org.example.v1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{

    private List<Actor> queue;

    public Market(){
        this.queue = new ArrayList<>();
    }
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришёл в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList){
            System.out.println(actor.getName() + " ушёл из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
         takeOrders();
         giveOrders();
         releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " оформил заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue){
            if(!actor.isTakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actorList = new ArrayList<>();
        for (Actor actor : queue){
            if(actor.isTakeOrder()){
                actorList.add(actor);
                System.out.println(actor.getName() + " собирается уходить из магазина");
            }
        }
        releaseFromMarket(actorList);
    }



}
