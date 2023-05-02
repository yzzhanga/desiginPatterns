package com.yzzhanga.dp.creational.toObject.Builder;

public class TestBuilder {
    // 1.创建一个抽象建造者
    public static abstract class Builder {
        // 1.1.创建一个产品
        protected Product product = new Product();
        // 1.2.创建一个抽象方法，用来创建产品的第一个部分
        public abstract void buildPart1();
        // 1.3.创建一个抽象方法，用来创建产品的第二个部分
        public abstract void buildPart2();
        // 1.4.创建一个抽象方法，用来返回产品
        public abstract Product getResult();
    }
    // 2.创建一个具体建造者
    public static class ConcreteBuilder extends Builder {
        @Override
        public void buildPart1() {
            product.setPart1("编号：9527");
        }
        @Override
        public void buildPart2() {
            product.setPart2("名称：XXX");
        }
        @Override
        public Product getResult() {
            return product;
        }
    }
    // 3.创建一个产品
    public static class Product {
        private String part1;
        private String part2;
        public String getPart1() {
            return part1;
        }
        public void setPart1(String part1) {
            this.part1 = part1;
        }
        public String getPart2() {
            return part2;
        }
        public void setPart2(String part2) {
            this.part2 = part2;
        }
        @Override
        public String toString() {
            return "Product{" +
                    "part1='" + part1 + '\'' +
                    ", part2='" + part2 + '\'' +
                    '}';
        }
    }

    // 4.创建一个指挥者
    public static class Director {
        // 4.1.创建一个建造者
        private Builder builder;
        // 4.2.创建一个构造方法，用来传入建造者
        public Director(Builder builder) {
            this.builder = builder;
        }
        // 4.3.创建一个产品构建方法，用来构建产品
        public Product construct() {
            builder.buildPart1();
            builder.buildPart2();
            return builder.getResult();
        }
    }
    // 5.创建一个测试类
    public static void main(String[] args) {
        // 5.1.创建一个建造者
        Builder builder = new ConcreteBuilder();
        // 5.2.创建一个指挥者
        Director director = new Director(builder);
        // 5.3.让指挥者来构建产品
        Product product = director.construct();
        // 5.4.打印产品
        System.out.println(product);
    }
}
