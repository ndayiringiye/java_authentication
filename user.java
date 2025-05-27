public class User {
	private Long id;
	private String username;
	private String email;
	private String password;

}


public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}