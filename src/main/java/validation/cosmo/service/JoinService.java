package validation.cosmo.service;

import validation.cosmo.dto.UserDTO;
import validation.cosmo.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import validation.cosmo.repository.UserRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class JoinService {

    private final UserRepository userRepository;

    public UserDTO join(UserDTO payload) {

    User entity = User.builder()
            .name(payload.getName())
            .email(payload.getEmail())
            .password(payload.getPassword())
            .age(payload.getAge())
            .nation(payload.getNation())
            .company(payload.getCompany())
            .build();

    userRepository.save(entity);
    return UserDTO.entityToDTO(entity);

    }
}
