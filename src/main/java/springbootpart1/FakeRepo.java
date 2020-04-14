package springbootpart1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo  implements FakeRepoInterface{
@Autowired
    private static ArrayList<User> DB =new ArrayList<>();


    @Override
    public String insertUser(long id, String name, String surname) {
        DB.add(new User(id,name,surname));
        return name;
    }

    @Override
    public String findUserById(long id) {
        for (User a: DB){
            long Id=a.getId();
            if (id==Id){
                return a.getName();
            }
        }return null;
    }

    @Override
    public String deleteUser(long id) {
        for(User b:DB){
            long Id=b.getId();
            if(Id==id){
                DB.remove(b);
                return b.getName();

            }
        }return null;
    }
}
