public class bes {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        int length = str.length();
        char ch = str.charAt(7);
        String kesim1 = str.substring(7);
        String kesim2 = str.substring(7, 12);
        String kucuk = str.toLowerCase();
        String buyuk = str.toUpperCase();
        String boskes = str.trim();

        System.out.println(length);
        System.out.println(ch);
        System.out.println(kesim1);
        System.out.println(kesim2);
        System.out.println(kucuk);
        System.out.println(buyuk);
        System.out.println(boskes);
    }
}