@PostMapping("/register")
public ResponseEntity<?> register(@ModelAttribute User user) {
	return ResponseEntity.ok(userService.register(user));
}

@PostMapping("/login")
public ResponseEntity<?> login(@ModelAttribute User user) {
	return ResponseEntity.ok(userService.login(user.getEmail(), user.getPassword()));
}
