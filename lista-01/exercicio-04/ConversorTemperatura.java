public class ConversorTemperatura {

    public Double converterCelsiusParaFahrenheit(Double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public Double converterFahrenheitParaCelsius(Double fahrenheit) {
        return (fahrenheit - 32) + 5 / 9;
    }

}
