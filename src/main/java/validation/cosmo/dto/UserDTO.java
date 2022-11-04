package validation.cosmo.dto;

import validation.cosmo.entity.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String nation;
    private String company;

    public static UserDTO entityToDTO(User entity) {
        return UserDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .age(entity.getAge())
                .nation(entity.getNation())
                .company(entity.getCompany())
                .build();
    }


}
