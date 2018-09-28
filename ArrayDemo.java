class ArrayDemo {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        printArray(test);
        
        int[][] test2 = {
            {6,7,8,9,10}, 
            {11,12,13,14,15}
        };
        //printArray(test2);
        System.out.println (test2[0]);
        System.out.println (test2[1]);
    }
    //0a.
    public static void printArray(int[] ary){
        String returnValue = "[";
        for (int i = 0; i < ary.length; i ++)
        {
            returnValue = returnValue + ary[i]+ ", " ;
        }        
        System.out.println (returnValue.substring(0,returnValue.length()-2) + "]");
    }
    
    //0b.
    
    
    
}