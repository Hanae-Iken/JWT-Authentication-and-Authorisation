package ma.ensat.property_management.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
//@RequiredArgsConstructor
public class AuthenticationController {

    // Cette classe est un controleur REST dans une app Spring Boot, qui gere les endpoints lies a l'authentification et a l'enregistrement des utilisateurs
//    Le AuthenticationController fournit deux endpoints principaux :
//
    /// register : Pour enregistrer de nouveaux utilisateurs.
    /// authenticate : Pour authentifier les utilisateurs existants.
//Il utilise les classes de requête RegisterRequest et AuthenticationRequest, et la classe de réponse AuthenticationResponse pour communiquer avec les clients.
//
//Toute la logique métier est déléguée à un service dédié (AuthenticationService), ce qui respecte le principe de séparation des responsabilités (SRP).
//
//Ce design est extensible et maintenable, permettant d'ajouter facilement de nouvelles fonctionnalités liées à l'authentification.


    public AuthenticationController(AuthenticationService service) {
        this.service = service;
    }

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));
    }
}
