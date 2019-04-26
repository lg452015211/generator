package com.zhl.generator.util;

import com.zhl.generator.ZhlResourceGenerator;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: lv_ww
 * @Date: 2019/4/26 15:49
 */
public class MysqlUtilConnect {

    public static void main(String[] args) {
        ZhlResourceGenerator.main(null);
    }

    public static String[] getTable(){
        List<String> strList = new ArrayList<String>();
        strList.add("zhl_edu_lesson_sentence_mapping");
//        strList.add("");
//        strList.add("");
//        strList.add("");
//        strList.add("");
//        strList.add("");
//        strList.add("");
        String[] strings = new String[strList.size()];
        strList.toArray(strings);
        return strings;
    }

    public static ConnectInfo getConnectInfo(){
        ConnectInfo connectInfo = new ConnectInfo();
        connectInfo.setUrl(rc.URL);
        connectInfo.setUsername(rc.USERNAME);
        connectInfo.setPassword(rc.PASSWORD);
        return connectInfo;
    }

    public static class rc{
        public final static String URL = "jdbc:mysql://192.168.101.153:3306/zhl_rcenter_v2?autoReconnect=true&autoReconnectForPools=true&useUnicode=true&characterEncoding=utf8";
        public final static String USERNAME = "zhl_rcenter_v2";
        public final static String PASSWORD = "rcenter&1$9";
    }

    public static class edu{
        public final static String URL = "jdbc:mysql://192.168.101.153:3306/zhl_education_multi?autoReconnect=true&autoReconnectForPools=true&useUnicode=true&characterEncoding=utf8";
        public final static String USERNAME = "zhl_education";
        public final static String PASSWORD = "education.3@9";
    }

    @Data
    public static class ConnectInfo{
        private String url;
        private String username;
        private String password;
    }
}
