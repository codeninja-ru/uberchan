package org.uberchan.shared.domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * User: vital
 * Date: 26.12.12
 * Time: 20:40
 */
public class ThreadContent implements Serializable {
    private ArrayList<Post> posts;
    private String tilte;

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }
}
