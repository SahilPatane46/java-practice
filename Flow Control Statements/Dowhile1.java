class Dowhile1 {
	//reversing the number using dowhile loop
    public static void main(String[] args)
    {
        int a = 1;
        System.out.println("Main Start");
        System.out.print("Default order  : ");
        do {
            System.out.print(a + " ");
            ++a;
        }
        while (a <= 10);
        --a;

        System.out.println();

        System.out.print("Reverse order  : ");
        do {
            System.out.print(a + " ");
            --a;
        }
        while (a >= 1);
        System.out.println("\nMain End");
    }
}
