package designPatterns.BehavioralDesignPattern.ObserverDP;

interface DisplayWeather {
    void update(WeatherReport w);
}
class DisplayMobile implements  DisplayWeather{

    @Override
    public void update(WeatherReport w) {
        System.out.println("Current temp: "+w.getTemp()+" Celcius");

    }
}

class DisplayTv implements  DisplayWeather {

    @Override
    public void update(WeatherReport w) {
        System.out.println("Current temp: " + w.getTemp() + " Celcius");

    }
}