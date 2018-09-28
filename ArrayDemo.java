class ArrayDemo {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        printArray(test);
        
        int[][] test2 = {
            {6,7,8,9,10}, 
            {11,12,13,14,15}
        };
        printArray(test2);
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
    public static void printArray(int[][] ary){
        String returnValue = "[";
        for (int i = 0; i < ary.length; i ++) {
            for (int i2 = 0; i2 < ary[i].length; i2 ++) {
                returnValue = returnValue + ary[i][i2] + ", " ;
            }
        }        
        System.out.print (returnValue.substring(0,returnValue.length()-2) + "]");
    }
    
}