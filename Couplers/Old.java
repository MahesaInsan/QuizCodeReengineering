package Couplers;

public class Old {
    public class Rookie{
        private Sergeant sergeant;

        public String getChiefNamefromSerge(){
            return sergeant.getChiefNamefromCaptain().getChiefName().getName();
        }
    }

    public class Sergeant{
        private Captain captain;

        public Captain getChiefNamefromCaptain(){
            return captain;
        }
    }

    public class Captain{
        private Chief chief;

        public Chief getChiefName(){
            return chief;
        }
    }

    public class Chief{
        String name;
        
        public String getName() {
            return name;
        }
    }
}

