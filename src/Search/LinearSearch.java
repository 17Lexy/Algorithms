package Search;

public class LinearSearch {
    public static void main(String[] args) {

        String[] s = {"Телефон","Ноутбук","Компьютер","Телевизор"};

        boolean x = search(s,"Телевизор");
        System.out.println(x);


    }
    public static boolean search(String[]s, String s1){
        for (int i = 0; i < s.length; i++) {
            if(s[i].equals(s1)){
                return true;
            }
        } return false;
    }
}
