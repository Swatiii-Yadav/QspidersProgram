package designPatterns.BehavioralDesignPattern.ObserverDP;

import java.util.ArrayList;
import java.util.List;

interface WeatherReport {
    abstract void add(DisplayWeather dw);

    abstract void remove(DisplayWeather dw);

    abstract void notifies();

    abstract void setTemp(int temp);

    int getTemp();

}

class Weather implements WeatherReport {
    List<DisplayWeather> displyaList = new ArrayList<>();
    int temp;

    @Override
    public void add(DisplayWeather dw) {
        displyaList.add(dw);
    }

    @Override
    public void remove(DisplayWeather dw) {
        displyaList.remove(dw);

    }

    @Override
    public void notifies() {
        for (DisplayWeather disp : displyaList) {
            disp.update(this);

        }
    }

    @Override
    public void setTemp(int temp) {
        this.temp = temp;
        notifies();
    }

    @Override
    public int getTemp() {
        return temp;
    }
}
