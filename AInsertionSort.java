public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
              
        for (int i = 1; i < myNumbers.length; i++) {

            int val = myNumbers[i];

            int x;
            for (x = i; x > 0 && myNumbers[x - 1] > val; x--) {
                myNumbers[x] = myNumbers[x - 1];
            }

            myNumbers[x] = val;
        }

        for (int num : myNumbers) {
            System.out.print(num + " ");
        }
    }

    
}
