package springbootpart1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class, args);

        UserServiceImpl user =new UserServiceImpl();

        System.out.println(user.addUser(5,"Gift","Moshobane"));
        System.out.println(user.getUser(5));
        System.out.println(user.removeUser(5));





    }
}
