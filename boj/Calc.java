import java.util.Scanner;
import java.util.Stack;
public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operation = in.nextLine().replaceAll("\\s","");
        Stack<String> inope =  new Stack<String>();
        //only use when there is * / close to () only those matter
        //use for by the length of operation can't use regular expression
        // System.out.println(calculater(operation));
        in.close();
    }
    public static int calculater(String operation) {
        Stack<String> operator = new Stack<String>();
        String  firstope[] = operation.split("[+-]");
        for (int i = 0; i < firstope.length; i++) {
            for (int j = 0; j < firstope[i].length(); j++) {
                if(firstope[i].charAt(j) == '*'||firstope[i].charAt(j)=='/') {
                    operator.push(String.valueOf(firstope[i].charAt(j)));
                }
            }
            String num[] = firstope[i].split("[*/]");
            firstope[i]=Integer.toString(cacluate(num,operator));
        }
        operator.clear();
        for (String str : (operation.replaceAll("[0-9*/]","")).split("")) {
            operator.push(str);
        }
        return(cacluate(firstope, operator));
    }
    public static int cacluate(String n[],Stack<String > op) {
        int sum=Integer.parseInt(n[0]);
        for (int i = 1; i < n.length && !op.isEmpty(); i++) {
            if(op.elementAt(0).equals("*")){
                sum*=(Integer.parseInt(n[i]));
            }else if(op.elementAt(0).equals("/")){
                sum/=(Integer.parseInt(n[i]));
            }else if(op.elementAt(0).equals("+")){
                sum+=(Integer.parseInt(n[i]));
            }else {
                sum-=(Integer.parseInt(n[i]));
            }
            op.remove(0);
        }
        return sum;
    }
}
    