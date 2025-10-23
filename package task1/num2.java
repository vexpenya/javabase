import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = input.nextInt();
        
        if(age >= 0)
        {
            if(age <= 7)
            {
            
                System.out.println("Детский");
            }
            else if(age <= 17)
        {
            System.out.println("Подросток");
        }
        else if(age <= 60)
        {
            System.out.println("Взрослый");
        } else if(age > 60){
        System.out.println("Пенсионный");
        } else {
            System.out.println("error");
        }
        }
    }   
           
}
       
        