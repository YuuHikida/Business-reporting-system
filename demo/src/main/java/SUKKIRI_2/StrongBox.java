package SUKKIRI_2;

public  class StrongBox<E> {
    private E data;
    public void put(E d){this.data=d;}
    public E get()
    {
        numberCounter+=1;
        if(numberCounter>=NumberOfTreatmentsRequired)
        {
            numberCounter=0;
            return this.data;
        }
        return null;
    }

    private KeyType keyType;
    private  int NumberOfTreatmentsRequired;
    private int numberCounter=0;
    public StrongBox(KeyType keyType)
    {
        switch (keyType)
        {
            case PADLOCK -> NumberOfTreatmentsRequired=1024;
            case BUTTON -> NumberOfTreatmentsRequired=10000;
            case DIAL -> NumberOfTreatmentsRequired=30000;
            case FINGER -> NumberOfTreatmentsRequired=1000000;
        }
    }




    //鍵の種類を示すフィールド
//    public enum KeyType
//    {
//
//    }
    //必要施術回数
    //子の変数は共通だがインスタンス事の

//
//
//    public String backCount(KeyType keyType,int count)
//    {
//        switch (keyType)
//        {
//            case PADLOCK:
//                if(count<1024)
//                    return null;
//                else
//                {return "おめ";}
//                break;
//            case BUTTON:
//
//
//        }
//        //if(KeyType.equals(PADLOCK)&&count>=1024)
//        return null;
//    }
//    //鍵の種類を受け取るコンストラクタ
//    public static class staticStrongBox
//    {
//        public
//
//    }



}
