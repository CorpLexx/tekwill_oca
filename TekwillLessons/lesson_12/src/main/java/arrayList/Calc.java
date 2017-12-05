package arrayList;

public class Calc {

    double sum(String[] args) {
        double result = 0;
        for (String arg : args) {
            result += Double.parseDouble(arg);
        }
        return result;
    }

    double media(String[] args) {
        double result = 0;
        for (String arg : args) {
            result += Double.parseDouble(arg);
        }
        return result / args.length;
    }

    double produs(String[] args) {
        double result = 1;
        for (String arg : args) {
            result *= Double.parseDouble(arg);
        }
        return result;
    }

    double operation(String[] args, String operation) {
        double result = 0;

        switch (operation) {
            case "sum":
                for (String arg : args) {
                    result += Double.parseDouble(arg);
                }
                return result;
            case "media":
                for (String arg : args) {
                    result += Double.parseDouble(arg);
                }
                return result / args.length;
            case "produs":
                result = 1;
                for (String arg : args) {
                    result *= Double.parseDouble(arg);
                }
                return result;
            default:
                return result;
        }
    }
}




