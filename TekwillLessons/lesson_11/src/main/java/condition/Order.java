package condition;

public class Order {

    double calcDiscountIf(String type, int amount) {
        if (type.equals("nonprofit")) {
            if (amount > 900) {
                return amount * 0.1;
            } else {
                return amount * 0.05;
            }
        } else if (type.equals("private")) {
            if (amount > 900) {
                return amount * 0.07;
            } else {
                return 0;
            }
        } else if (type.equals("corporate")) {
            if (amount > 900) {
                return amount * 0.08;
            } else {
                return amount * 0.05;
            }
        } else {
            return -1;
        }
    }

    double calcDiscountSwitch(String type, int amount) {

        switch (type) {

            case "nonprofit":
                if (amount > 900) {
                    amount *= 0.1;
                } else {
                    amount *= 0.05;
                }
                break;

            case "private":
                if (amount > 900) {
                    amount *= 0.07;
                } else {
                    return 0;
                }
                break;

            case "corporate":
                if (amount > 900) {
                    amount *= 0.08;
                } else {
                    amount *= 0.05;
                }
                break;

            default:
                return -1;
        }

        return amount;
    }
}

