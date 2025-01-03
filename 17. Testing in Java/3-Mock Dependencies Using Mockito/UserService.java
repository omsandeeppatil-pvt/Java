public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserEmailById(int id) {
        User user = userRepository.findById(id);
        return user != null ? user.getEmail() : null;
    }
}
