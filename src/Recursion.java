public class Recursion {
    public static void main(String[] args) {

        System.out.println(addDollarSign("hello")); //expected h$l$l$o

        System.out.println(addDollarSign("james"));

    }

    public static String addDollarSign(String str) {
        if (str.length()==1){
            return str;
        }
        return str.charAt(0)+ "$" + addDollarSign(str.substring(1));

    }
}
