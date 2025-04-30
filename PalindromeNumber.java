import java.util.Scanner;

public class PalindromeNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String number = " ";
char firstNumber = ' ';
char lastNumber = ' ';



System.out.print("Enter any 3 numbers to check if is a palindrome number: ");
number = input.next();

for(int count = 0; count <= number.length(); count++){
firstNumber = number.charAt(0);
lastNumber = number.charAt(2);
}

if(firstNumber == lastNumber){
System.out.print("This is a palindrome number");
}
else{
System.out.print("This is not a palindrome number");
}

}


}