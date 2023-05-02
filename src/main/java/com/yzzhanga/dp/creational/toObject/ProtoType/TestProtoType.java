package com.yzzhanga.dp.creational.toObject.ProtoType;

public class TestProtoType {
    /**
     * 这个类是用来测试原型模式的
     * 1.原型模式是用来创建重复的对象，而不是创建新的对象
     */
    public static void main(String[] args) {
        // 1.创建一个原型对象
        ProtoType protoType = new ProtoType();
        // 2.克隆原型对象
        ProtoType clone = protoType.clone();
        // 3.使用克隆的对象
        clone.use();
    }
    /**
     * 创建一个原型类
     * 1.原型类有一个use方法
     * 2.原型类有一个实现use方法的类   ProtoType1
     * 3.原型类有一个实现use方法的类   ProtoType2
     */
    public static class ProtoType implements Cloneable {
        public void use() {
            System.out.println("我是原型类");
        }

        @Override
        protected ProtoType clone() {
            try {
                return (ProtoType) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
