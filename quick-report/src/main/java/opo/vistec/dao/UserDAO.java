package opo.vistec.dao;

import java.util.List;

import opo.vistec.auth.model.User;

public interface UserDAO {
   List<User> findAllUsers();
}
