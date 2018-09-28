class ArrayDemo {
    public static void main(String[] args) {
        //0a test run
        int[] test = {1,2,3,4,5};
        System.out.print("0a Test : ");
        printArray(test);
        
        //0b test run
        int[][] test2 = {
            {6,7,8,9,10}, 
            {11,12,13,14,15}
        };
        System.out.print("0b Test : ");
        printArray(test2);
        
        //1 test run
        int[][] test3 = {
            {1,0,2,0,0},
            {3,0,4,0,5}
        };
        System.out.print("1  Test : ");
        System.out.println (countZero2D(test3));
        
        //2a
        int[][] test4 = {
            {9,9,99,9,9,9},
            {9,9,9,9,9},
            {9,9,9,9,9,99,9}
        };
        System.out.print ("2  Test : ");
        fill2D (test4);
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
        String returnValue = "";
        for (int i = 0; i < ary.length; i ++) {
            returnValue = returnValue + "[";
            for (int i2 = 0; i2 < ary[i].length; i2 ++) {
                returnValue = returnValue + ary[i][i2] + ", " ;
            }
            returnValue = returnValue.substring(0,returnValue.length()-2) + "] ";
        }        
        System.out.println (returnValue);
    }
    
    //1.
    public static int countZero2D(int[][] nums ) {
        int zeroCounter = 0;
        for (int i = 0; i < nums.length; i ++) {
            for (int i2 = 0; i2 < nums[i].length; i2 ++) {
                if (nums[i][i2] == 0) {
                    zeroCounter ++;
                }
            }
        }  
        return zeroCounter;
    }
    
    //2a
    public static void fill2D(int[][] vals){
        String newArray = "";
        for (int i = 0; i < vals.length; i ++) {
            newArray = newArray + "[";
            for (int i2 = 0; i2 < vals[i].length; i2 ++) {
                if (i == i2) {
                    newArray = newArray + "3, ";
                }
                else {
                    newArray = newArray + "1, ";
                }
            }
                newArray = newArray.substring(0,newArray.length()-2) + "] ";
            }
        System.out.println (newArray);
    }
}
