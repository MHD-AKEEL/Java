public class array2d{
public static void main(String args[]){

String[] cars={"RAM","BMW","GMC","BENZ","CT100"};
{
for (int i=0; i<cars.length; i++)
System.out.println(cars[i]);

System.out.println(cars.length); //5

System.out.println(cars[cars.length-1]); //CT100
}

{
for (int i=4; i>=1; i--)
System.out.println(cars[i]);
}

int[][] myNumber={{1,2,3,4},{5,6,7}};

int x=myNumber[1][2];

System.out.println(x); //7


}}