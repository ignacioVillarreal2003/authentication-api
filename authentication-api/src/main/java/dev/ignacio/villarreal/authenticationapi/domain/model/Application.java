package dev.ignacio.villarreal.authenticationapi.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "application")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 255)
    private String name;

    @Column(name = "client_id", nullable = false, unique = true, length = 255)
    private String clientId;

    @Column(name = "redirect_uri", nullable = false, unique = true, length = 255)
    private String redirectUri;
}