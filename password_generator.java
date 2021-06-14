import java.util.*;
import java.util.Scanner;
public class password_generator {
    public static void main(String[] args) {
        //int length = 10;                                                //length of the password
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println(save_password(length));
    }
    static char [] save_password(int l)                                  //an array of characters of size l where array name is "save_password"
    {
        System.out.println("Generate random password using random() :");
        String capital_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";              //to choose from uppercase letters
        String small_letters = "abcdeghijklmnopqrstuvwxyz";                 //to choose from lower case letters
        String numbers = "0123456789";                                      //to choose from numbers
        String symbols = "@#$!%^&*_+=-/.?<>)";                              //to choose from special symbols
        String values = capital_letters+small_letters+numbers+symbols;      //the value of password is a combination of all
        Random rndm = new Random();                                         //random function to choose each value randomly each new time
        char [] password = new char[l];                                 //character array password of length l 
        for(int i=0;i<l;i++){
            password[i]=values.charAt(rndm.nextInt(values.length()));
        }
        return password;
    }
}
