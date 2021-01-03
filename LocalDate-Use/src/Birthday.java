
import java.time.*;
import java.util.Scanner;




public class Birthday {

    public static void main(String[] args){
        LocalDate.now();
        LocalDate date = LocalDate.of(2018,2,13);
        Scanner input = new Scanner(System.in);
        int year, mo, day;
        System.out.println("year of birth?");
        year = input.nextInt();
        System.out.println("month of birth?");
        mo = input.nextInt();
        System.out.println("day of birth?");
        day = input.nextInt();

        LocalDate birth = LocalDate.of(year, mo, day);
        System.out.println("when will i become 10000 days old?");
        System.out.println(birth.plusDays(10000));

    }
}
