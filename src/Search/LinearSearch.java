package Search;

public class LinearSearch {
    public static void main(String[] args) {

        String[] s = {"Телефон", "Ноутбук", "Компьютер", "Телевизор"};

        //boolean x = search(s,"Телевизор");
        //System.out.println(x);



        Student[] students = new Student[10];
        students[0] = new Student("Иван", 25, 30000);
        students[1] = new Student("Елена", 30, 35000);
        students[2] = new Student("Пётр", 28, 32000);
        students[3] = new Student("Анна", 35, 40000);
        students[4] = new Student("Сергей", 27, 31000);
        students[5] = new Student("Мария", 32, 33000);
        students[6] = new Student("Дмитрий", 29, 38000);
        students[7] = new Student("Ольга", 31, 34000);
        students[8] = new Student("Александр", 26, 29500);
        students[9] = new Student("Екатерина", 33, 37000);
        students[9] = new Student("Екатерина2", 33, 37000);

        boolean result = studentSearch(students, "Сергей");
    }

    public static boolean search(String[] s, String s1) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(s1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean studentSearch(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return true;
            }
        }
        return false;

    }
}
