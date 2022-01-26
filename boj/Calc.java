import java.util.Scanner;
import java.util.Stack;
public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operation = in.nextLine().replaceAll("\\s","");
        Stack<String> inope =  new Stack<String>();
        String tempop = "";
        int count = 0, minus = 0;
        for (int i = 0; i < operation.length(); i++) {
            if(count>minus){
                tempop=tempop+Character.toString(operation.charAt(i));
            }else if(operation.charAt(i)=='('){
                count++;
            }else if(operation.charAt(i)==')'){
                minus++;
                inope.push(calculater(tempop));
            }else{
                inope.push(Character.toString(operation.charAt(i)));
            }
        }
        //only use when there is * / close to () only those matter
        //use for by the length of operation can't use regular expression
        // System.out.println(calculater(operation));
        in.close();
    }
    public static String calculater(String operation) {
        Stack<String> operator = new Stack<String>();
        String  firstope[] = operation.split("[+-]");
        for (int i = 0; i < firstope.length; i++) {
            for (int j = 0; j < firstope[i].length(); j++) {
                if(firstope[i].charAt(j) == '*'||firstope[i].charAt(j)=='/') {
                    operator.push(String.valueOf(firstope[i].charAt(j)));
                }
            }
            String num[] = firstope[i].split("[*/]");
            firstope[i]=cacluate(num,operator);
        }
        operator.clear();
        for (String str : (operation.replaceAll("[0-9*/]","")).split("")) {
            operator.push(str);
        }
        return(cacluate(firstope, operator));
    }
    public static String cacluate(String n[],Stack<String > op) {
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
        return Integer.toString(sum);
    }
}
    