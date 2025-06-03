package optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoTestUsingOptional {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfoList = new ArrayList<>();

        userInfoList.add(new UserInfo(12345, "James"));
        userInfoList.add(new UserInfo(12346, "Thomas"));
        userInfoList.add(new UserInfo(12347, "Edward"));

        usingOptional(userInfoList);
    }

    public static void usingOptional(ArrayList<UserInfo> list) {
        Optional<UserInfo> userInfoOptional = getUserInfoByIdOptional(12333, list);

        userInfoOptional.ifPresent(userInfo -> System.out.println("User name found: " + userInfo.getName()));

        if (userInfoOptional.isPresent()) {
            System.out.println("User name found: " + userInfoOptional.get().getName());
        } else {
            System.out.println("User not found.");
        }

        UserInfo nameOrDefault = userInfoOptional.orElse(new UserInfo(00000, "Guest"));
        System.out.println("User name: " + nameOrDefault.getName());

        UserInfo nameOrComputed = userInfoOptional.orElseGet(() ->
                generateDefaultUserInfo());
        System.out.println("User name: " + nameOrComputed.getName());

        try {
            UserInfo userNotFound = userInfoOptional.orElseThrow(() ->
                    new IllegalStateException("User not found"));
            System.out.println("User name: " + userNotFound.getName());
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
    }

    public static Optional<UserInfo>  getUserInfoByIdOptional(int id, ArrayList<UserInfo> list) {
        for (UserInfo userInfo : list) {
            if (id == userInfo.getId())
                return Optional.of(userInfo);
        }
        return Optional.empty();
    }

    public static UserInfo generateDefaultUserInfo() {
        return new UserInfo(00000, "Guest");
    }
}
