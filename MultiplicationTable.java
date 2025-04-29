public class MultiplicationTable{
public static void main(String[] args){

int result = 0;

for(int count = 1; count <= 10; count++){
for(int number = 1; number <= 10; number++){
result = count * number;
System.out.println(count + "*" + number + "=" + result);
}

}



}

}