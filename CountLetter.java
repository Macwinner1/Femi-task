public class CountLetter{
public static void main(String[] args){

String name = "Emefele";
char valid = 'e';
char validB = 'E';
char confirm = ' ';
int total = 0;

for(int count = 0; count < name.length(); count++){
confirm = name.charAt(count);

if(confirm == valid){
total++;
}

if(validB == confirm){
total++;
}
}
System.out.print(total);


}

}