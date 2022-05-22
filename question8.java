public class question8 {
    public static void main(String[] args) {
        String myString = "How dare you?";
        int i;
        int[] myArray = new int[13];
        if (myString.charAt(2) == 'w'){
            for ( i = 0; i < myString.length(); i++) {
                myArray[i] = i;
                System.out.print(myArray[i]);
            }
        }
        else{
            System.out.print("Third letter is not w");
        }  
    }
}
//0123456789101112
