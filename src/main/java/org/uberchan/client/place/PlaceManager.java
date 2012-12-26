package org.uberchan.client.place;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 25.12.12
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class PlaceManager extends PlaceManagerImpl {

    @Inject
    public PlaceManager(EventBus eventBus, TokenFormatter tokenFormatter) {
        super(eventBus, tokenFormatter);
    }

    public void revealDefaultPlace() {
        revealPlace(new PlaceRequest(NameTokens.home));
    }
}
