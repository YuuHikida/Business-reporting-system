package SUKKIRI_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

import static java.awt.AWTEventMulticaster.add;
import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {

        //これが標準関数インターフェイス
        Predicate<Integer> func1= x-> x%2==1;
        BiFunction<Integer,String,String> f2 =(point,name)->
        {
            return name+"さんは"+(point>65?"合格":"不合格");
        };
        System.out.println(func1.test(15));;
        System.out.println(f2.apply(100,"yaa"));



      //ArrayList<String> names= new ArrayList<>(){

        //Stream<String> names= Arrays<>stream(){
        List<String> names=
        List.of("湊雄介","朝香あさみ","菅原拓海","大江岳人");
        names.stream()
                .filter(n->n.length()<=4)
                .map(n->n+"さん")
                .forEach(System.out::println);


      //names.stream().filter(i-> i.length()>=4).forEach(names->);
      
//        Func1 f1 = FuncList::isOdd;
////        Func2 f2 = funcList::passCheck;
//        System.out.println(f1.call(15));
//        System.out.println(f2.call(66,"Smisth"));
//        List<Integer> kon = List.of(3,4,5);
//        List<Integer> testList=kon.stream().map(x->x+3).toList();
//        testList.forEach(System.out::println);
    }



}

//
//
//    public static Boolean judge(int num) {
//        Function<Integer, Boolean> func1 = FuncList::isOdd;
//        return func1.apply(num);
//    }
//
//    public  String judge2(int point, String name) {
//        FuncList a = new FuncList();
//        BiFunction<Integer, String, String> func2 = a::passCheck;
//        return func2.apply(point,name);
//    }

