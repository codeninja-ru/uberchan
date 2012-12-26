package org.uberchan.client.board;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Place;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import org.uberchan.client.place.NameTokens;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 25.12.12
 * Time: 20:13
 * To change this template use File | Settings | File Templates.
 */
public class BoardPresenter extends Presenter<BoardPresenter.MyView, BoardPresenter.MyProxy> {

    @Inject
    public BoardPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
        super(eventBus, view, proxy, RevealType.Root);
    }

    public interface MyView extends View {

    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends Proxy<BoardPresenter>, Place {
    }

    @Override
    protected void revealInParent() {
        RevealRootContentEvent.fire(this, this);
    }
}
