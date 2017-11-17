package rylynn.hws.service;

import rylynn.hws.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findOvertimeUser();

    /*
    after 10:25 registerovertime is forbidden...
     */
    public void registerOvertime(String username ,String place);

    public void registerUser(User user);

    public void updateUserInfo(User user);

    /*
    set the status of all users to 0 on the second day
     */
    public void refreshStatus();

}
