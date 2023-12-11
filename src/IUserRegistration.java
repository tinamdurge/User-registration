@FunctionalInterface
interface IUserRegistration {
    boolean validate(String data) throws UserRegistrationException;
}
