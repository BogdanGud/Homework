package gojava.hw4.temperatureconverter;


public class TemperatureConverter {
    public float fahrenheitToCelsius(float fahrenheitValue) {
        return ((fahrenheitValue - 32) * 5) / 9;
    }

    public float celsiusToFahrenheit(float celsiusValue) {
        return (9 * celsiusValue) / 5 + 32;

    }
}
