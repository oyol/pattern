package com.oyol.fiveplusone.prototype;

import java.util.ArrayList;
import java.util.List;

public class ProductA extends Product {
    // 装饰字符
    private char decochar;

    public ProductA(char decochar) {
        this.decochar = decochar;
    }


    public void use(String s) {
        int length = s.length();
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
    }

    public Product cloneObj() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
