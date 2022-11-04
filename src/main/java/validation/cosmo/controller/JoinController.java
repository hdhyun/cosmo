package validation.cosmo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import validation.cosmo.dto.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import validation.cosmo.dto.UserDTO;
import validation.cosmo.service.JoinService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/join")
public class JoinController {

    private final JoinService joinService;

    @PostMapping
    public ResponseEntity<CommonResponse<UserDTO>> join(@RequestBody UserDTO payload) {

       UserDTO joinUser = joinService.join(payload);

        return ResponseEntity.ok(CommonResponse.<UserDTO>success(joinUser, null));

    }


}
