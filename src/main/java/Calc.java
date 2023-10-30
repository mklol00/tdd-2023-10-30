public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) {
            return 0;
        }
        if (exp.contains("-")) {
            String[] expBits = exp.split(" \\- ");

            int num1 = Integer.parseInt(expBits[0]);
            int num2 = Integer.parseInt(expBits[1]);
            return num1 - num2;

        }

        String[] expsBits = exp.split(" \\+ ");
        int num1 = Integer.parseInt(expsBits[0]);
        int num2 = Integer.parseInt(expsBits[1]);
        return num1 + num2;

    }
}
