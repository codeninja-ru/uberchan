package org.uberchan.shared.dispatch;

import com.gwtplatform.dispatch.shared.Result;
import org.uberchan.shared.domain.*;

import java.util.ArrayList;

/**
 * User: vital
 * Date: 26.12.12
 * Time: 20:34
 */
public class GetBoardResult implements Result{
    private ArrayList<ThreadContent> threads;
    private String title;

    public ArrayList<ThreadContent> getThreads() {
        return threads;
    }

    public void setThreads(ArrayList<ThreadContent> threads) {
        this.threads = threads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
