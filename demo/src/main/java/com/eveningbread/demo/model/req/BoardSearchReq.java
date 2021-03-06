package com.eveningbread.demo.model.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardSearchReq extends Pagination {

    private Long seqNo;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private String boardRegdate;
    private String searchType;
    private String searchValue;
}
