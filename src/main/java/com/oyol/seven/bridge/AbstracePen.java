package com.oyol.seven.bridge;

public abstract class AbstracePen {
    protected Color color;
    protected void setColor(Color color){this.color = color;}
    public abstract void draw(String name);
}
