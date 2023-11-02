package SUKKIRI_3;

import java.util.function.BiFunction;

public interface Func2 {

    String call (int point , String name);
//    BiFunction<Integer,String,String> passCheck = (point,name)->
//    name +"さんは"+(point>65? "合格":"不合格");
    //return を省略した↑省略したら{}も省略する必要がある
    //{return name +"さんは"+(point>65? "合格":"不合格");};
}
