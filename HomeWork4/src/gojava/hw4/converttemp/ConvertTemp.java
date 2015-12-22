package gojava.hw4.converttemp;


public class ConvertTemp {
    float temp;

    public ConvertTemp() {
         temp = 0;
    }

    public float FahrenheitToCelsius(float temp){
        this.temp = temp;
        temp = ((temp - 32) * 5) / 9;
        return temp;
    }

    public float CelsiusToFahrenheit(float temp){
        this.temp = temp;
        temp = (9 * temp) / 5 + 32;
        return temp;
    }
}
