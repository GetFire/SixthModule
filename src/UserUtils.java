
public class UserUtils {

        public User[] uniqueUsers(User[] users) {
        boolean maska[] = new boolean[users.length];
//            mask[0]=true;
        int removeCount = 0;

        for (int i = 0; i < users.length; i++) {
            if (!maska[i]) {
                User tmp = users[i];

                for (int j = i + 1; j < users.length; j++) {
                    if (tmp.equals(users[j]) ) {
                        maska[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        User[] uniq = new User[users.length - removeCount];

        for (int i = 0, j = 0; i < users.length; i++) {
            if (!maska[i]) {
                uniq[j++] = users[i];
            }
        }

        return uniq;
    }
    User[] usersWithContitionalBalance(User[] users, int balance){

    }


    }
