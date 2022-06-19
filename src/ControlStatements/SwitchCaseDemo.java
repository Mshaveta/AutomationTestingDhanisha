package operators.ControlStatements;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        int day=10;
        switch (day){
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("mon");//1
                break;
            case 3:
                System.out.println("Tue");//2
                break;
            case 4:
                System.out.println("Wed");//2
                break;
            case 5:
                System.out.println("Thu");//2
                break;
            case 6:
                System.out.println("fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Please enter the day  number between 1-7");
        }

        System.out.println("Exit");
    }
}
