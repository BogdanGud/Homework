package gojava.hw4.converttemp;


public class TemperatureConverter {
    public float FahrenheitToCelsius(float fahrenheitValue) {
        return ((fahrenheitValue - 32) * 5) / 9;
    }

    public float CelsiusToFahrenheit(float celsiusValue) {
        return (9 * celsiusValue) / 5 + 32;

    }
}
