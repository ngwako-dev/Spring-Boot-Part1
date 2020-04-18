package springbootpart1;



public  class UserServiceImpl implements UserService {





 FakeRepo fakeRepo=new FakeRepo();


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
