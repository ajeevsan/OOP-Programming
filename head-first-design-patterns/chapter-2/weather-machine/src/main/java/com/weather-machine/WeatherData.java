class WeatherData {

    public interface Observer {
        void update(float temprature, float humidity, float pressure);
    }

    private float temprature, pressure, humidity;

    public float getTemprature() {
        return temprature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void updateWetherData(float newTemperature, float newHumidity, float newPressure) {
        temprature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;
    }
}