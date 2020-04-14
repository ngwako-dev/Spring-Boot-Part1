package springbootpart1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class UserServiceImpl implements UserService {

    private FakeRepo fakeRepo;
@Autowired
    @Override
    public String addUser(String name, String surname) {
        return FakeRepo.;
    }

    @Override
    public String removeUser(long Id) {
        return null;
    }

    @Override
    public String getUser(long Id) {
        return null;
    }
}
