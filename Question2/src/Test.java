public class Test {

    public static void main(String[] args) {
            for(int i = 2; i <= 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
     
    private static boolean isPrime(int num){
        boolean flag = true;
        for(int i = 2; i < num/2; i++){ 
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
