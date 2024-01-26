package Account;

import Authentication.Authentication;
import Insurance.Insurance;
import User.Users;

import java.util.ArrayList;

public abstract class Accounts {
    Authentication authenticationStatus;
    Users users;
    ArrayList<Insurance> insurances;

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
