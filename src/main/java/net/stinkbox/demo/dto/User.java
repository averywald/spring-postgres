package net.stinkbox.demo.dto;

import org.springframework.orm.jpa.*;
import org.postgresql.*;

public class User {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    // private String email;
}
