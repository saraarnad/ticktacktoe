package is.ru.ticktacktoe;

public class TickTackToe {

   public static String intRet() {
        return "ZUUUUPP!";
    }
    public static int uncovered() {
    	System.out.println("I am an uncovered function");
        return 0;
    }

   public static void main(String[] args) {
        System.out.println("Hello TickTackToe");
        for(String param: args)
            System.out.println("Parameter : "+param);
    }


}