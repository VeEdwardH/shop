package discuss.service;

import discuss.entity.User;

public interface UserService {
    public User getUser(User user) throws Exception;
    public User getUserByName(User user) throws Exception;
    public User updateUser(User user) throws Exception;
    public User addUser(User user) throws Exception;
    public User delUser(User user) throws Exception;
}
