package org.uberchan.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import org.uberchan.client.gin.ClientGinjector;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class uberchan implements EntryPoint {
    public final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

    public void onModuleLoad() {
        DelayedBindRegistry.bind(ginjector);
        ginjector.getPlaceManager().revealCurrentPlace();
    }
}
