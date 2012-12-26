package org.uberchan.shared.dispatch;

import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;

/**
 * User: vital
 * Date: 26.12.12
 * Time: 20:34
 */
public class GetBoardAction extends UnsecuredActionImpl<GetBoardResult> {
    private String boardName;
    private int page = 1;

    public GetBoardAction(String boardName) {
        this.boardName = boardName;
    }

    @SuppressWarnings("unused")
    public GetBoardAction() {
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
