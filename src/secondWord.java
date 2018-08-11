public class secondWord {
    public static void main(String args[]) {
        String input1 = "asdasd 1234rtbasf Hey";
        int length, index, index2, space = 0;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == ' ') {
                space++;
            }
        }
        String[] ary = input1.split(" ");


        String subString, subString2;
       if(space<1)
           System.out.println("LESS");
       else
           System.out.println(ary[1].toUpperCase().trim());



    }
}
