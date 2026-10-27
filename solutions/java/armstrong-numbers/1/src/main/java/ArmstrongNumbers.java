class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        String s = Integer.toString(numberToCheck);
        int len = s.length();
        int sum = 0;
        
        for (char c : s.toCharArray()) {
            sum += Math.pow(Character.getNumericValue(c), len);
        }
        
        return sum == numberToCheck;
    }
}