package gojava.hw4.converttemp;


public class TestTemperatureConvertor {
    public static void main(String [] args){
        TemperatureConverter temperature = new TemperatureConverter();
        System.out.println(temperature.FahrenheitToCelsius(100f));
    }
}
