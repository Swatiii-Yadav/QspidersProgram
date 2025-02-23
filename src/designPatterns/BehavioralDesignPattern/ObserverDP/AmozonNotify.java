package designPatterns.BehavioralDesignPattern.ObserverDP;

import java.util.ArrayList;
import java.util.List;

interface AmazonNotify {
    abstract void add(NotificationUpdate update);

    abstract void remove(NotificationUpdate update);

    abstract void notifies();

    abstract void setData(int data);

    int getData();

}

class StockUpdateAmazon implements AmazonNotify {
    List<NotificationUpdate> list = new ArrayList<>();
    int data=0;

    @Override
    public void add(NotificationUpdate update) {
        list.add(update);
    }

    @Override
    public void remove(NotificationUpdate update) {
        list.remove((update));
    }

    @Override
    public void notifies() {

        if (data == 0) {
            for (NotificationUpdate x : list) {
                x.update();
            }
        }
    }

    @Override
    public void setData(int d) {
        boolean outOfStock=(data==0);
        data+=d;
      if(outOfStock && data>0) {
          notifies();
      }

    }

    @Override
    public int getData() {
        return data;
    }
}

