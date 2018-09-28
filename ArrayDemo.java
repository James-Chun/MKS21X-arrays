class ArrayDemo {
    //0a.
    public static void main(String[] args) {
        int[] a = {1,1,11,1};
        printArray(a);
    }
    public static void printArray(int[] ary){
        int[] newArray = new int [ary.length];
        System.out.println (newArray);
    }
}