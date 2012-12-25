package org.uberchan.client.board;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 25.12.12
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
public class BoardModule extends AbstractPresenterModule {
    @Override
    protected void configure() {

        bindPresenter(BoardPresenter.class,
                BoardPresenter.MyView.class,
                BoardView.class,
                BoardPresenter.MyProxy.class
                );
    }
}
