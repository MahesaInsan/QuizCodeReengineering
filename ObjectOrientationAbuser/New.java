public class New {
    abstract class Temperature{
        double temp;
        abstract double convertTemp();
        
    }

    public class Kelvin extends Temperature{
        public double convertTemp(){
            return temp + 273.15;
        }

    }

    public class Fahrenheit extends Temperature{
        public double convertTemp(){
            return (temp * 9/5) + 32;
        }

    }

    public class Rankine extends Temperature{
        public double convertTemp(){
            return (temp * 9/5) + 491.67;
        }
    }
}
