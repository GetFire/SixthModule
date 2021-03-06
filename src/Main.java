import java.util.Arrays;

public class  Main {


    public static void main(String[] args) {


        User user1 = new User(1111, "Ажимов", "Denis", 3200, 2500);
        User user2 = new User(2222, "Vysotska", "Masha", 3200, 12000);
        User user3 = new User(2222, "Vysotska", "Tetyana", 3200, 3500);
        User user4 = new User(3333, "Azhymova", "Tetyana", 3200, 12000);
        User user5 = user1;
        User[] users = {user1, user2, user3, user4, user5};

        System.out.println("================== Работаем с массивами =================================");
        System.out.println();

        int[] arr1 = {1, 2, 3, 4, 53, 6, 7, 8, 9, 10, 53, 2, 0, 1, 22};
        System.out.println(Arrays.toString(arr1));

        arr1 = ArrayUtils.reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ArrayUtils.findEvenElements(arr1)));

        System.out.println();
        System.out.println("================== Работаем с Юзерами =======================================");
        System.out.println();

        User[] uniq = UserUtils.uniqueUsers(users);
        System.out.println(Arrays.toString(uniq));
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(uniq, 2500)));
        User[] now = users;
        now[4] = null;

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();

        System.out.println(Arrays.toString(now));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(now)));

    }


}