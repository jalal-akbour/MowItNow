package com.jakbour.mowitnow.model;

import java.util.List;

public class Field {
    private List<Mower> mowers;
    private Position limit;

    public Field(List<Mower> mowers, Position limit) {
        this.mowers = mowers;
        this.limit = limit;
    }

    public List<Mower> getMowers() {
        return mowers;
    }

    public Position getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return mowers.toString();
    }

    public void moveMowers() {
        mowers.forEach(x->x.runCommands(limit));
    }

}
