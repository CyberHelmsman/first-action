class ReverseString {

    String reverse(String inputString) {
        if (inputString == null)
            return null;

        StringBuilder reversed = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed.append(inputString.charAt(i));
        }
        return reversed.toString();
    }

    /*
    public String reverseString(String str) {
    
    if (str == null) return null;
    
    return new StringBuilder(str).reverse().toString();
    
    }
    */
  
}
