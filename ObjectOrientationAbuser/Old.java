public class Old {
    public class Temperature{
        double temp;

        public double convertTemp(String type){
            switch(type){
                case "Kelvin":
                    return temp + 273.15;
                case "Fahrenheit":
                    return (temp * 9/5) + 32;
                case "Rankine":
                    return (temp * 9/5) + 491.67;
                default: 
                    return temp;
            }
        }

    }

}
