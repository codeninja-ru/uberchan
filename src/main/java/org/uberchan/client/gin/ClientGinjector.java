package org.uberchan.client.gin;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import org.uberchan.client.board.BoardPresenter;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 25.12.12
 * Time: 21:30
 * To change this template use File | Settings | File Templates.
 */
@GinModules({DispatchAsyncModule.class, ClientModule.class})
public interface ClientGinjector extends Ginjector{
    EventBus getEventBus();

    Provider<BoardPresenter> getMainPagePresenter();

    PlaceManager getPlaceManager();
}
