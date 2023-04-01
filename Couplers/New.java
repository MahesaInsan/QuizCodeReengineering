package Couplers;

public class New {
    public class Rookie{
        private Sergeant sergeant;
        
        public String getChiefNamefromSerge(){
            return sergeant.getChiefNamefromCaptain();
        }
    }

    public class Sergeant{
        private Captain captain;

        public String getChiefNamefromCaptain(){
            return captain.getChiefName();
        }
    }

    public class Captain{
        private Chief chief;
        
        public String getChiefName(){
            return chief.getName();
        }
    }

    public class Chief{
        String name;

        public String getName() {
            return name;
        }
    }
}

