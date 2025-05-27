@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		return ResponseEntity.ok(userService.register(user));
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		return ResponseEntity.ok(userService.login(user.getEmail(), user.getPassword()));
	}
}