class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch : identifier.toCharArray()) {
            if (ch == '-') {
                capitalizeNext = true;
                continue;
            }

            char current = switch (ch) {
                case ' ' -> '_';
                case '4' -> 'a';
                case '3' -> 'e';
                case '0' -> 'o';
                case '1' -> 'l';
                case '7' -> 't';
                default  -> ch;
            };

            if (capitalizeNext) {
                current = Character.toUpperCase(current);
                capitalizeNext = false;
            }

            if (Character.isLetter(current) || current == '_') {
                sb.append(current);
            }
        }

        return sb.toString();
    }
}