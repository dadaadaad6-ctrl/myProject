    import java.util.ArrayList;
// problems - pi and pow doesnt work if you dont add spaces, and linear expressions dont work like 2+4+2
    public class CalculatorV2 {
        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Please provide numbers");
                return;
            }
            for (int x = 0; x < args.length; x++) {
                if (args[x].equalsIgnoreCase("pi")) {
                    double pi = Math.PI;
                    args[x] = String.valueOf(pi);
                    String s = args[x];
                }
            }
            Double output = 0.0;
            for (int i = 0; i < args.length; i++) {
                if (args[i].contains("pow") && (!(args[i].equals("pow")))) {
                    args[i] = args[i].replace("pow", " pow ");
                    String[] split = args[i].split(" ");

                    double num = Double.parseDouble(split[0]);
                    double po = Double.parseDouble(split[2]);
                    double powerful = Math.pow(num, po);
                    args[i] = String.valueOf(powerful);





                }
                if (args[i].contains("+") && (!(args[i].equals("+")))) {
                    if (!(args[i].contains("pow") || args[i].contains("pi"))) {
                        args[i] = args[i].replace("+", " + ");
                        String[] split = args[i].split(" ");
                        double num = Double.parseDouble(split[0]);
                        double po = Double.parseDouble(split[2]);
                        double powerful = num + po;
                        args[i] = String.valueOf(powerful);
                    }






                }
                else if (args[i].contains("-") && (!(args[i].equals("-")))) {
                    args[i] = args[i].replace("-", " - ");
                    String[] split = args[i].split(" ");
                    double num = Double.parseDouble(split[0]);
                    double po = Double.parseDouble(split[2]);
                    double powerful = num - po;
                    args[i] = String.valueOf(powerful);





                }
                else if (args[i].contains("/") && (!(args[i].equals("/")))) {
                    args[i] = args[i].replace("/", " / ");
                    String[] split = args[i].split(" ");
                    double num = Double.parseDouble(split[0]);
                    double po = Double.parseDouble(split[2]);
                    double powerful = num / po;
                    args[i] = String.valueOf(powerful);





                }
                else if (args[i].contains("x") && (!(args[i].equals("x")))) {
                    args[i] = args[i].replace("x", " x ");
                    String[] split = args[i].split(" ");
                    double num = Double.parseDouble(split[0]);
                    double po = Double.parseDouble(split[2]);
                    double powerful = num * po;
                    args[i] = String.valueOf(powerful);





                }
            }


                output = Double.parseDouble(args[0]);

            for (int i = 1; i < args.length; i++) {
                if (i % 2 != 0) {
                    if (args[i].equals("+")) {
                        output += Double.parseDouble(args[i + 1]);
                    } else if (args[i].equals("-")) {
                        output -= Double.parseDouble(args[i + 1]);
                    } else if (args[i].equals("x")) {
                        output *= Double.parseDouble(args[i + 1]);
                    } else if (args[i].equals("/")) {
                        output /= Double.parseDouble(args[i + 1]);
                    }
                    else if (args[i].equals("pow")) {
                        double num = Double.parseDouble(args[i - 1]);
                        double power = Double.parseDouble(args[i + 1]);
                        output = Math.pow(num, power);
                    }


                }
            }

            if (output.isInfinite() || output.isNaN()) {
                System.out.println("Can't divide by 0");
                return;
            }
                System.out.println(output);


        }
    }
