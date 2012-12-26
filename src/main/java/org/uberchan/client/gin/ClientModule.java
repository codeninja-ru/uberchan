package org.uberchan.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import org.uberchan.client.board.BoardModule;
import org.uberchan.client.place.PlaceManager;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 25.12.12
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
public class ClientModule extends AbstractPresenterModule{
    @Override
    protected void configure() {
        install(new DefaultModule(PlaceManager.class));

        install(new BoardModule());
    }
}
