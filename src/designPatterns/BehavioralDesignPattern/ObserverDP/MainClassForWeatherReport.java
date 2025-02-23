package designPatterns.BehavioralDesignPattern.ObserverDP;

public class MainClassForWeatherReport {
    public static void main(String[] args) {
        Weather weather = new Weather(); // Subject

        DisplayWeather mobileDisplay = new DisplayMobile(); //upcasting
        DisplayWeather tvDisplay = new DisplayTv(); //upcasting

        weather.add(mobileDisplay);
        weather.add(tvDisplay);

        weather.setTemp(25);
        System.out.println(weather.getTemp());

        weather.setTemp(30);
        System.out.println(weather.getTemp());



    }
}
