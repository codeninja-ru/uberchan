package org.uberchan.server;

import com.gwtplatform.dispatch.server.spring.HandlerModule;
import org.uberchan.server.dispatch.GetBoardActionHandler;
import org.uberchan.shared.dispatch.GetBoardAction;

/**
 * User: vital
 * Date: 26.12.12
 * Time: 23:06
 */
public class ServerModule extends HandlerModule{
    @Override
    protected void configureHandlers() {
        bindHandler(GetBoardAction.class, GetBoardActionHandler.class);
    }
}
