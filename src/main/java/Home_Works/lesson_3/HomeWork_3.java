package Home_Works.lesson_3;



public class HomeWork_3 {



    public static void main (String[] args){
        int [] arr7 = {2,1,1,1};
//        task_1();
//        task_2();
//        task_3();
//        task_4();
//        task_5(5,1);
//        task_6();
//        System.out.println(task_7(arr7));
    }
    public static void task_1 (){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrl = arr.length;
        for (int i = 0; i < arrl; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }System.out.println("task_1");
        for (int i = 0;i<arrl; i++){
            System.out.println(i + "-" + arr[i]);
        }

    }

    public static void task_2 (){
        int[] arr = new int [100];

        for (int i = 0; i< arr.length; i++) {
                arr[i] = i + 1;
            System.out.print( arr[i] + " ");
        }

    }

    public static void task_3 (){
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i =0; i<arr.length; i++){
            if (arr[i]< 6){
                arr [i] = arr [i] * 2 ;
            }   System.out.print(arr[i] + " ");
        }
    }

    public static void task_4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static void task_5 (int len,int initialValue){
        int [] arr= new int[len];
        for (int i = 0; i< len; i++){
            arr[i]= initialValue;
            System.out.print("["+ i + "]" + arr[i] + " ");
        }
    }
    public static void task_6(){
        int[] arr = {61, 9, 13, 202, 11, 64, 5, 2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];

        for (int i =0; i<arr.length; i++){
            if (arr[i]>max){
                max =arr[i];
            }
        }
        for (int i = 0; i< arr.length; i++){
            if (arr[i]< min){
                min =arr[i];
            }
        }
        System.out.print(max);
        System.out.print( min);
    }
    public static boolean task_7 (int[] arr){

        int leftSum =arr[0];
        int rightSum = arr [0];

        for (int i = 0; i< arr.length; i++ ){
            rightSum += arr[i];
        }
        for (int i = 0; i< arr.length; i++ ){
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum ){
                return true;
            }
        }
        return false;

    }

}

