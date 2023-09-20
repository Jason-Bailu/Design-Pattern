package com.bailu.prototype.deepcopy;

import java.io.*;

/**
 * @Author: JasonD
 * @date: 2023/9/2 09:38
 * @Description:
 */
public class Sheep implements Serializable, Cloneable {
    private String name;
    private int age;
    private String color;
    private Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    //重写clone方法进行深拷贝
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep) super.clone();
        if (this.friend != null) {
            Sheep friend = sheep.getFriend();
            Sheep cloneFriend = friend.clone();
            sheep.setFriend(cloneFriend);
        } else {
            sheep.setFriend(null);
        }
        return sheep;
    }

    //自定义序列化进行深拷贝
    public Sheep deepCopy() {
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep sheep = (Sheep) ois.readObject();
            return sheep;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
