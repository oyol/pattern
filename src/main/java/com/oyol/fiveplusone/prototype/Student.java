package com.oyol.fiveplusone.prototype;

import java.io.*;


public class Student implements Serializable {
    // 自动生成序列化ID
    private static final long serialVersionUID = 296199231040740826L;
    private String name;

    public Student clone() {
        Student s = null;
        try {
            // 对象序列化成流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            // 将序列化的流转换成对象
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            s = (Student) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return s;
    }
}
