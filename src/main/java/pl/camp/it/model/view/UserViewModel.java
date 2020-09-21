package pl.camp.it.model.view;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class UserViewModel {

    private SimpleStringProperty login = new SimpleStringProperty();
    private SimpleStringProperty pass = new SimpleStringProperty();
    private SimpleIntegerProperty age = new SimpleIntegerProperty();

    private SimpleBooleanProperty loginFilled = new SimpleBooleanProperty(false);
    private SimpleBooleanProperty passFilled = new SimpleBooleanProperty(false);
    private SimpleBooleanProperty ageFilled = new SimpleBooleanProperty(false);

    public UserViewModel() {
        loginFilled.bind(login.isNotEmpty());
        passFilled.bind(pass.isNotEmpty());
        ageFilled.bind(age.isNotEqualTo(0));
    }

    public String getLogin() {
        return login.get();
    }

    public SimpleStringProperty loginProperty() {
        return login;
    }

    public void setLogin(String login) {
        this.login.set(login);
    }

    public String getPass() {
        return pass.get();
    }

    public SimpleStringProperty passProperty() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass.set(pass);
    }

    public int getAge() {
        return age.get();
    }

    public SimpleIntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public boolean isLoginFilled() {
        return loginFilled.get();
    }

    public SimpleBooleanProperty loginFilledProperty() {
        return loginFilled;
    }

    public void setLoginFilled(boolean loginFilled) {
        this.loginFilled.set(loginFilled);
    }

    public boolean isPassFilled() {
        return passFilled.get();
    }

    public SimpleBooleanProperty passFilledProperty() {
        return passFilled;
    }

    public void setPassFilled(boolean passFilled) {
        this.passFilled.set(passFilled);
    }

    public boolean isAgeFilled() {
        return ageFilled.get();
    }

    public SimpleBooleanProperty ageFilledProperty() {
        return ageFilled;
    }

    public void setAgeFilled(boolean ageFilled) {
        this.ageFilled.set(ageFilled);
    }

    @Override
    public String toString() {
        return "UserViewModel{" +
                "login=" + login +
                ", pass=" + pass +
                ", age=" + age +
                ", loginFilled=" + loginFilled +
                ", passFilled=" + passFilled +
                ", ageFilled=" + ageFilled +
                '}';
    }
}
