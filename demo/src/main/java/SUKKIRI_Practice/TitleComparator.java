package SUKKIRI_Practice;

import java.util.Collections;
import java.util.Objects;
import java.util.Comparator;

//この処理はTitleを昇順で並び替えると定義
public class TitleComparator implements Comparator<Book>
{
        public int compare(Book x, Book y)
    {

        return x.getTitle().compareTo(y.getTitle());
    }
//import java.util.Comparator;
//
//    public class TitleComparator implements Comparator<Book> {
//        @Override
//        public int compare(Book x, Book y) {
//            // 2つのBookオブジェクトをタイトルで比較し、昇順に並べる
//            return x.getTitle().compareTo(y.getTitle());
//        }
//    }


}