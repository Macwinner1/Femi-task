public class Uppercase{
public static void main(String[] args){

String name = "Semicolon";
char vaild = ' ';


for(int count = 1; count < name.length(); count++){
//vaild = name.charAt(count);
valid = Character.toUppercase(name.charAt(count));
System.out.print(valid);
}


}

}