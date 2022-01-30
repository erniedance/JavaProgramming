package day42_Exceptions;
/*
day41_Exceptions

MorningWorkOut:
        1. Do 30 push-ups and try pausing 1.5 seconds in each


        2. Do 20 Pull-ups and try pausing 2.5 seconds in each



Exception Handlings:

		1. try & catch: used for handling checked & unchecked exceptions

				try{
					exception code
				}catch(ExceptionType e){
					e.printStackTrace();
				}

		2. throws: used for handling checked exceptions ONLY

              Caller of the method will be responsible for handling the exception


throw keyword: used for manually creating exception

        throw ExceptionObject

       String browser = "Cydeo";


 */

public class Morning_Workout {
    public static void main(String[] args) {
        System.out.println("__________Push up started_______________");
        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush up  " +i);

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n__________Push up completed_______________");

        System.out.println("__________Pull up started_______________");
        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPull up  " +i);

            sleep(2.5);
        }
        System.out.println("\n__________Pull up completed_______________");
    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
MorningWorkOut:
        1. Do 30 push-ups and try pausing 1.5 seconds in each
        2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */