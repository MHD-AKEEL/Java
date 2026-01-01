public class check{
public static void main(String args[]){

int x = 3, result=4;
switch(x+3)
{
case 6: result = 0;
case 7: result = 2;
case 8: result = 5;
default: result += 4;
}
System.out.println(result); // Expected output: 9
}}

