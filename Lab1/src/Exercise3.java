public class Exercise3 {
    public static void main(String[] args) {
        
        for (int i = '\u0061'; i <= '\u007A'; i++) 
        {
			System.out.print((char) i + " ");
		}
        System.out.println();

        long begin = new java.util.Date().getTime();
        int i = 0;
        while (i < 100000000)
        {
            i++;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);

        long i2 = 0;
        while(i2 < 100000000)
        {
            i2++;
        }
        System.out.println(new java.util.Date().getTime() - end);

    }



    
}
