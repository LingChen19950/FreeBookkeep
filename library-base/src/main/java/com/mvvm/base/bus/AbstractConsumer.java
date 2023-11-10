package com.mvvm.base.bus;

import io.reactivex.functions.Consumer;

public abstract class AbstractConsumer<T> implements Consumer<T> {

    public abstract void onAccept(T t);

    public  void onException(Exception e,T t){
    }
    @Override
    public void accept(T t) throws Exception{
        try {
            onAccept(t);
        }catch (Exception e){
            onException(e,t);
        }
    }
}
