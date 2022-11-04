package validation.cosmo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pagination {

    private int pageNum;
    private int totalItems;
    private int rows;

}
