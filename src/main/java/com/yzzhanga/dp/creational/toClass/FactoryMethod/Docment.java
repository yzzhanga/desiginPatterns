package com.yzzhanga.dp.creational.toClass.FactoryMethod;

public abstract class Docment {

  public abstract String getName();

  String aaa ;

  // 创建一个spring bean  用于测试
    public void setAaa(String aaa) {
        this.aaa = aaa;
    }
    // 创建一个spring bean  用于测试
    public String getAaa() {
        return aaa;
    }

// 创建 Docment 的工厂方法
  public static Docment createDocment(String type) {
    Docment docment = null;
    if ("word".equals(type)) {
      docment = new WordDocment();
    } else if ("excel".equals(type)) {
      docment = new ExcelDocment();
    }
    return docment;
  }
  // 创建一个Docment的枚举类
    public enum DocmentEnum {
        WORD("word") {
        @Override
        public Docment createDocment() {
            return new WordDocment();
        }
        },
        EXCEL("excel") {
        @Override
        public Docment createDocment() {
            return new ExcelDocment();
        }
        };
        private String type;

        DocmentEnum(String type) {
        this.type = type;
        }

        public abstract Docment createDocment();
    }
    /**
     * 继承Docment类的word文档类
     */
    static class WordDocment extends Docment {
        @Override
        public String getName() {
            return "我是word文档";
        }
    }
    static class ExcelDocment extends Docment {
        @Override
        public String getName() {
            return "我是excel文档";
        }
    }



}
