public class AddBinary {

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String sum = addBinary.addBinary("100", "1");
        System.out.print(sum);
    }

    public String addBinary(String a, String b) {
        if (a.isEmpty() && b.isEmpty())
            return "";
        if (a.isEmpty())
            return b;
        if (b.isEmpty())
            return a;
        char[] result = new char[Math.max(a.length(), b.length()) + 1];
        int carry = 0, i = a.length() - 1, j = b.length() - 1, k = result.length - 1;
        while (i >= 0 && j >= 0) {
            int sum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j)) + carry;
            carry = fillResult(sum, k, result);
            i--;
            j--;
            k--;
        }
        while(i >= 0) {
            int sum = Character.getNumericValue(a.charAt(i)) + carry;
            carry = fillResult(sum, k, result);
            i--;
            k--;
        }
        while(j >= 0) {
            int sum = Character.getNumericValue(b.charAt(j)) + carry;
            carry = fillResult(sum, k, result);
            j--;
            k--;
        }
        if(carry > 0)
            result[k] = '1';
        StringBuilder resultBuilder = new StringBuilder("");
        for(int idx = 0; idx < result.length; idx++) {
            resultBuilder.append(result[idx]);
        }
        return resultBuilder.toString().trim();
    }

    private int fillResult(int sum, int k, char[] result){
        int carry = 0;
        switch (sum) {
            case 0:
                result[k] = '0';
                carry = 0;
                break;
            case 1:
                result[k] = '1';
                carry = 0;
                break;
            case 2:
                result[k] = '0';
                carry = 1;
                break;
            case 3:
                result[k] = '1';
                carry = 1;
                break;
        }
        return carry;
    }

}
