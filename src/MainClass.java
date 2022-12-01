public class MainClass {
    public static void main(String args[] ) {

        String mainString = "to be or not to be";
        String subString = "to be or not to be";

        System.out.println(stringContains(mainString,subString));
    }


    public static boolean stringContains(String mainString, String subString) {
        if (mainString == null || subString == null) {
            return false;
        }

        String mainStringWords[] = mainString.split(" ");
        String subStringWords[] = subString.split(" ");
        int counter = 0;
        if (subStringWords.length == 0) {
            return false;
        }

        for (int i = 0; i < mainStringWords.length; i++) {

            if (mainStringWords[i].equals(subStringWords[counter])) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter == subStringWords.length) {
                return true;
            }
        }
        return false;
    }
}