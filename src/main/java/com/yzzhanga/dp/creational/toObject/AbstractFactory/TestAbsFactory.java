package com.yzzhanga.dp.creational.toObject.AbstractFactory;

import com.yzzhanga.dp.creational.toClass.FactoryMethod.AbstractFactory;
import com.yzzhanga.dp.creational.toClass.FactoryMethod.Docment;

/**
 * 这个类是用来测试抽象工厂的
 * 1.抽象工厂是工厂方法的升级版，工厂方法只能生产一种产品，而抽象工厂可以生产多种产品
 * 2.抽象工厂的缺点是，如果要增加一个产品C，那么就要修改抽象工厂的接口，所有的工厂都要修改，违反了开闭原则
 */
public class TestAbsFactory {
    public static void main(String[] args) {
        // 1.创建一个抽象工厂
        AbstractFactory factory = new AbstractFactory() {
            @Override
            protected Docment createDocument() {
                return null;
            }
        };
        // 2.创建一个产品A
        ProductA productA = factory.createProductA();
        // 3.创建一个产品B
        ProductB productB = factory.createProductB();
        // 4.使用产品A
        productA.use();
        // 5.使用产品B
        productB.use();
    }
    /**
     * 创建一个产品A类
     * 1.产品A类有一个use方法
     * 2.产品A类有一个实现use方法的类   ProductA1
     * 3.产品A类有一个实现use方法的类   ProductA2
     */
    public static abstract class ProductA {
        public abstract void use(); // 产品A的抽象方法
    }
    public static class ProductA1 extends ProductA {
        @Override
        public void use() {
            System.out.println("我是产品A1");
        }
    }
    public static class ProductA2 extends ProductA {
        @Override
        public void use() {
            System.out.println("我是产品A2");
        }
    }
    /**
     * 创建一个产品B类
     * 1.产品B类有一个use方法
     * 2.产品B类有一个实现use方法的类   ProductB1
     * 3.产品B类有一个实现use方法的类   ProductB2
     */
    public static abstract class ProductB {
        public abstract void use(); // 产品B的抽象方法
    }
    public static class ProductB1 extends ProductB {
        @Override
        public void use() {
            System.out.println("我是产品B1");
        }
    }
    public static class ProductB2 extends ProductB {
        @Override
        public void use() {
            System.out.println("我是产品B2");
        }
    }

}
