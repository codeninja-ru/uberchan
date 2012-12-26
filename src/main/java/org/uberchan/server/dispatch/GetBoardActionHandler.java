package org.uberchan.server.dispatch;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.AbstractActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import org.uberchan.shared.dispatch.GetBoardAction;
import org.uberchan.shared.dispatch.GetBoardResult;
import org.uberchan.shared.domain.ThreadContent;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 26.12.12
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class GetBoardActionHandler extends AbstractActionHandler<GetBoardAction, GetBoardResult> {
    public GetBoardActionHandler() {
        super(GetBoardAction.class);
    }

    public GetBoardResult execute(GetBoardAction getBoardAction, ExecutionContext executionContext) throws ActionException {
        GetBoardResult result = new GetBoardResult();

        result.setThreads((ArrayList<ThreadContent>) Arrays.asList(
                new ThreadContent(),
                new ThreadContent()
        ));

        return result;
    }

    public void undo(GetBoardAction getBoardAction, GetBoardResult getBoardResult, ExecutionContext executionContext) throws ActionException {
        // nothing
    }
}
