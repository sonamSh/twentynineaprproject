public class AddingFirstFiveNumberTest {
    public static void main(String args[])
    {
        int sum = 0;
        int n=5;
        for(int i = 1;i <= n;i++)
        {
            sum = sum + i;
        }
        System.out.println("The Sum Of "+n+" Numbers are:" + sum);
    }
}
