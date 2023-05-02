package com.yzzhanga.dp.creational.toClass.FactoryMethod;

import com.sun.istack.internal.NotNull;
import com.yzzhanga.dp.creational.toObject.AbstractFactory.TestAbsFactory;

public abstract   class AbstractFactory {

        protected abstract Docment createDocument();

        @NotNull
        public Docment createDocment(Class<Docment> docmentClass){
                try {
                        return docmentClass.newInstance();
                } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                }

        }


        public TestAbsFactory.ProductA createProductA() {
                // TODO Auto-generated method stub
                return null;
        }

        public TestAbsFactory.ProductB createProductB() {
                // TODO Auto-generated method stub
                return null;
        }
}
