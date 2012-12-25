package org.uberchan.client.board;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * Created with IntelliJ IDEA.
 * User: vital
 * Date: 25.12.12
 * Time: 20:21
 * To change this template use File | Settings | File Templates.
 */
public class BoardView extends ViewImpl implements BoardPresenter.MyView {

    public interface Binder extends UiBinder<Widget, BoardView> {
    }

    private Widget widget;

    @Inject
    public BoardView(final Binder binder) {
        widget = binder.createAndBindUi(this);
    }

    public Widget asWidget() {
        return widget;
    }
}