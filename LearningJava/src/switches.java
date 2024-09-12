public class switches {

    public static void main(String[] args) {
        
        String day = "Yesterday";//value of string varaible day is "Friday

        switch (day) {/*evaulates the varaible day with the cases below. If its a match (equal) 
                        it will print that case's print statement*/
            case "Monday": System.out.println("It is Monday");
            break;
            case "Tuesday": System.out.println("It is Tuesday");
            break;
            case "Wednesday": System.out.println("It is Wednesday");
            break;
            case "Thursday": System.out.println("It is Thursday");
            break;
            case "Friday": System.out.println("It is Friday");
            break;
            case "Saturday": System.out.println("It is Saturday");
            break;
            case "Sunday": System.out.println("It is Sunday");
            break;
            default: System.out.println("That is not a day");/*if there is no mactch we can default 
                                                                 message print out*/ 
            
        }

    }

}
