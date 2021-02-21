public class Exercise51 {
    
    public static void main(String[] args) {
        int[] array= {12, 43, 12, -65, 778, 123, 32, 76};
        int maxArray = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > maxArray)
            {
                maxArray = array[i];
            }
        }
        System.out.println(maxArray);
    }
}
