package com.codekul.sqllitejava;

public interface Db {

    String DB_NAME = "my_info.sqlite";
    int DB_VERSION = 1;
    interface TabMyInfo{
        String TAB_NAME = "my_info";
        String COL_NAME = "my_name";
        String COL_CARD_NUM = "card_num";
    }

}
