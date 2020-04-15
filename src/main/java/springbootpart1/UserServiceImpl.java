package springbootpart1;

import org.springframework.beans.factory.annotation.Autowired;



public  class UserServiceImpl implements UserService {

 public FakeRepo fakeRepo=new FakeRepo();

//injecting or connecting objects from FakeRepo for creating UserServiceImpl class
@Autowired

    @Override
    public String addUser(long id,String name, String surname) {

        return fakeRepo.insertUser(id,name,surname);
    }


    @Override
    public String removeUser(long Id) {


    return fakeRepo.deleteUser(Id);
    }

    @Override
    public String getUser(long Id) {

        return fakeRepo.findUserById(Id);
    }
}
