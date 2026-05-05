package com.medication.medication_reminder.auth;

import com.medication.medication_reminder.entity.User;
import com.medication.medication_reminder.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        Optional<User> existing = userRepository.findByEmail(user.getEmail());
        if (existing.isPresent()) {
            return ResponseEntity.badRequest().body(Map.of("message", "Email déjà utilisé"));
        }
        User saved = userRepository.save(user);
        return ResponseEntity.ok(Map.of(
                "message", "Compte créé avec succès",
                "userId", saved.getId()
        ));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        Optional<User> userOpt = userRepository.findByEmail(email);

        if (userOpt.isEmpty() || !userOpt.get().getPassword().equals(password)) {
            return ResponseEntity.status(401).body(Map.of("message", "Email ou mot de passe incorrect"));
        }

        User user = userOpt.get();
        return ResponseEntity.ok(Map.of(
                "message", "Connexion réussie",
                "userId", user.getId(),
                "email", user.getEmail()
        ));
    }
}