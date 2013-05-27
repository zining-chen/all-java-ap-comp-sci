public class FCConverter
{

    private double temperature;  //kelvin :P

    public void setFahrenheit( double d )
    {
        temperature = (d - 32) * 5 / 9 - 273;
    }

    public double getFahrenheit()
    {
        return (temperature + 273) * 9 / 5 + 32;
    }

    public void setCelsius( double d )
    {
        temperature = d - 273;
    }

    public double getCelsius()
    {
        return temperature + 273;
    }

}


