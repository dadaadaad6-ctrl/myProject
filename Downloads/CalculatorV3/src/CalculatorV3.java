import java.util.Arrays;
public class CalculatorV3 {
    // so first add one loop to do multiple operations and tokenize
    public static void main(String[] args) {
        args = new String[] { String.join("", args) };
        String[] split = new String[args.length];
        for (int j = 0; j < args.length; j++) {
            args[j] = args[j].replace("+", " + ");
            args[j] = args[j].replace("-", " - ");
            args[j] = args[j].replace("/", " / ");
            args[j] = args[j].replace("x", " x ");
//            System.out.println("goes through here");
        }
        for (int x = 0; x < args.length; x++) {
          //  System.out.println("goes through here");
            split = args[x].split(" ");
          //  System.out.println(Arrays.toString(split));
        }


        double result = Double.parseDouble(split[0]);
        for (int i = 0; i < split.length; i++) {
             //   System.out.println("goes through here in if");
                if (split[i].contains("+")) {
                    double nextNum = Double.parseDouble(split[i + 1]);
                    result += nextNum;

                }
                if (split[i].contains("-")) {
                    double nextNum = Double.parseDouble(split[i + 1]);
                    result -= nextNum;
                }
                if (split[i].contains("/")) {
                    double nextNum = Double.parseDouble(split[i + 1]);
                    result /= nextNum;
                }
                if (split[i].contains("x")) {
                    double nextNum = Double.parseDouble(split[i + 1]);
                    result *= nextNum;
                }



        }
        System.out.println(result);
    }
}

