public class Main
{
    public static void main(String[] args)
    {
        int numToExamine = 588888098;
        int numModulo = numToExamine % 2;

        if (numModulo == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}