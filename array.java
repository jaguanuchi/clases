public class array {
    public static void main(String[] args){
        int array[] = new int[7];
        for (int i=0;i<7;i++){
           array[i]=i+1;
        }
        for (int i=0;i<7;i++){
            System.out.println("vector ["+i+"]="+array[i]);
        }
    }
}
