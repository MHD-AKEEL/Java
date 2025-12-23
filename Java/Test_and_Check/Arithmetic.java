class Arithmetic {

    public static void main(String[] args) {

        int x = 4, y = 8, i = 4;

        /*System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("x+y=" + x + y);
        System.out.println("x-y=" + x - y);
        System.out.println("x*y=" + x * y);
        System.out.println("x/y=" + x / y);
        System.out.println("x%y=" + x % y);*/

	//AND
	System.out.println(i<=8 && y>=6);
	System.out.println(x<=5 && y>=7);
	System.out.println(y<=10 && i>=5);

	//OR
	System.out.println(i<=5 || y>=5);
	System.out.println(y<=9 || x>=2);
	System.out.println(x<=3 || x>=6);

	//NOT
	System.out.println(!(i>5)); 
	System.out.println(!(i>=3));
	System.out.println(!(x<=6));
	System.out.println(!(y<=4));

	System.out.println(!(i>=2 && y>=2));

    }
}

