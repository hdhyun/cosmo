package validation.cosmo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorInfo {
    private String code;
    private String message;
}
