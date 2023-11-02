package SUKKIRI_Practice;

import java.time.LocalDate;
import java.util.*;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable
{
    private String title;
    private LocalDate publishDate;
    private String comment;

    //hashCodeのオーバーライド
    public int hashCode() {
        return Objects.hash(this.title, this.publishDate);
    }
    //Titlegetter・・・違うのか？
//    public String gettitile()

//    {
//        return this.title;
//    }
    public Book(String title, LocalDate publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public String getTitle()
    {
        return this.title=title;
    }

    //qualsメソッドのオーバーライド
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        //型が異なるなら
        if (!(o instanceof Book otherBook)) return false;
        //固有フィールドの比較
        //比較するためにキャスト変換しないといけないらしい
//        ◎  :Book型のインスタンス名.フィールド名
//        ×　:オブジェクト型インスタンス名.フィールド名
        if (!this.title.equals(otherBook.title)) {

            return false;
        }
        if (!this.publishDate.equals(otherBook.publishDate)) {
            return false;
        }
        return true;
//    }
    }

    //Comparableのインタフェース
    //自然順序
    public int compareTo(Book book) {
//        //実は完成
//        return this.publishDate.compareTo(book.publishDate);
        //return -1;
        if(this.publishDate.isBefore(book.publishDate))
        {
            return -1;
        }
        if(this.publishDate.isAfter(book.publishDate))
        {
            return 1;
        }
        return 0;
    }

    //クローン実装
    public Book clone() {
        return new Book(this.title, this.publishDate, this.comment);
    }
    //toString()オーバーライド
    public String toString()
    {
        String stringLocalDate= String.valueOf(this.publishDate);
        return "タイトル"+this.title+"発行日"+ stringLocalDate +"コメント"+this.comment;
    }
    public static void main(String[] args)
    {
        LocalDate ld2 = LocalDate.of(2011, 10, 7);
        Book book =new Book("Java入門",ld2,"スッキリわかる");
        LocalDate ld3=LocalDate.of(2019,6,11);
        Book book1 =new Book("APython入門",ld3,"スッキリわかる");

        LocalDate ld4=LocalDate.of(2018,6,21);
        Book book2 =new Book("C言語入門",ld4,"ポインタも自由自在");
        ArrayList<Book> list = new ArrayList<>(){
            {
                add(book);
                add(book1);
                add(book2);
            }
        };
        Collections.sort(list,new TitleComparator());
        System.out.println(list.toString());
    }

//    public Comparable<Object> getTitle() {
//        return  ;
//    }
//    //署名で昇順
//    Collections.sort()
}
