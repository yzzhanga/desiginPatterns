package com.yzzhanga.dp.creational.toClass.FactoryMethod;

import com.sun.istack.internal.NotNull;

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
}
