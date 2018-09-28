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
        
        //2a Test run
        int[][] test4 = {
            {9,9,99,9,9,9},
            {9,9,9,9,9},
            {9,9,9,9,9,99,9}
        };
        System.out.print ("2a Test : ");
        fill2D (test4);
        
        //2b test run
        int[][] test5 = {
            {-2,3,4,-5,6},
            {4,6,5,-45,-1},
            {-1,-1,0,2}
        };
        System.out.print("2b Test : ");
        printArray(fill2DCopy(test5) );
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
        for (int i = 0; i < vals.length; i ++) {
            for (int i2 = 0; i2 < vals[i].length; i2 ++) {
                if (i == i2) {
                    vals[i][i2]=3;
                }
                else {
                    vals[i][i2]=1;
                }
            }
        }
        printArray(vals);
    }
    
    //2b 
    public static int[][] fill2DCopy(int[][] vals){
        int[][] newArray = new int [vals.length][];
        for (int i = 0; i < vals.length; i ++) {
            newArray[i] = new int [vals[i].length];
        }
        for (int i = 0; i < vals.length; i ++) {
            for (int i2 = 0; i2 < vals[i].length; i2 ++) {
                if (vals[i][i2] < 0) {
                    newArray[i][i2] = 3;
                }
                else {
                    newArray[i][i2] = 1;
                }
            }
        }
        return newArray;
    }
}
