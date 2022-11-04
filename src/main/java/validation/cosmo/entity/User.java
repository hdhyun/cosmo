package validation.cosmo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Setter
    @Column(nullable = false)
    private String name;
    @Setter
    @Column(unique = true, nullable = false)
    private String email;
    @Setter
    @Column(nullable = false)
    private String password;
    @Setter
    @Column(nullable = false)
    private int age;
    @Setter
    @Column(nullable = false)
    private String nation;
    @Setter
    @Column(nullable = false)
    private String company;

    @Builder
    public  User(String name, String email, String password,int age,String nation,String company){
        this.name = name;
        this.email=email;
        this.password=password;
        this.age=age;
        this.nation=nation;
        this.company=company;
    }

}
