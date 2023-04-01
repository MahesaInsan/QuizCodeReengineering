package ChangePreventer.Old;

public class Old{
    public class Student{
        static String name, major;
        static Class studentClass = new Class();
        static Class newClass = new Class();

        public static String takeClass(){
            if(major.equals(newClass.major)){
                return "You are not eligible for this class"; 
            }
            
            studentClass = newClass;
            return "You took this class";
        }
    
        public static String schedule(){
            if(major.equals(newClass.major)){
                return "You are not eligible for this class"; 
            }
            return newClass.schedule;
        }
    }

    public static class Class{
        static String className, schedule, major;
        static int capacity, sks;
        
        public static void setClassName(String className) {
            Class.className = className;
        }

        public static String getClassName() {
            return className;
        }
    }   
}

