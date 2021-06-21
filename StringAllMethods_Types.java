public class StringAllMethods_Types {
    public static void main(String[] args) {
        String name = "Nayan";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "    Nayan    ";
        System.out.println(nonTrimmedString);

        // String trimmedString =nonTrimmedString.trim();
        // System.out.println(trimmedString);
        String trimmedString = "     Nayan     ";
        System.out.println(trimmedString.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(1, 4));

        // System.out.println(name.replace('n', 'c'));
        System.out.println(name.replace("yan", "ncm"));
        System.out.println(name.replace("y", "yz"));

        System.out.println(name.startsWith("Na"));

        System.out.println(name.endsWith("an"));

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("an"));
        System.out.println(name.indexOf("y", 3));

        System.out.println(name.lastIndexOf("y"));
        System.out.println(name.lastIndexOf("an", 5));

        System.out.println(name.equals("Nayan"));

        System.out.println(name.equalsIgnoreCase("nayan"));

    }
}
