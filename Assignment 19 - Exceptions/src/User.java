record User(String cpr, String password) {

    public Boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "cpr='" + cpr + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
