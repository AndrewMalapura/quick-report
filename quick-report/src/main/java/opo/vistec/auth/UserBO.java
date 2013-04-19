package opo.vistec.auth;

import java.util.List;

import opo.vistec.auth.model.User;

public interface UserBO {
   List<User> findAllUsers();
}
