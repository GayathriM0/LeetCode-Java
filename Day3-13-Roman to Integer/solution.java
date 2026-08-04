class Solution {

    // Method to convert Roman character to integer value
    public int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int currentValue = getValue(s.charAt(i));
            int nextValue = getValue(s.charAt(i + 1));

            if (currentValue < nextValue) {
                sum = sum - currentValue;
            } else {
                sum = sum + currentValue;
            }
        }

        // Add the value of the last character
        sum = sum + getValue(s.charAt(s.length() - 1));

        return sum;
    }
}