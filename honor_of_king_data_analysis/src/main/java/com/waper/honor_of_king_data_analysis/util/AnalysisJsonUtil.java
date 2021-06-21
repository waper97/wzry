package com.waper.honor_of_king_data_analysis.util;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName AnalysisJsonUtil
 * @Description 解析json工具类
 * @Author wangpeng
 * @Date 2021/6/21 18:17
 */
public  class AnalysisJsonUtil {

    /**
     * JSON字符串转JSON数组
     * @return
     */
    public static String JsonStringToJsonArray() {
        String filePath = "\\C:\\Users\\Administrator\\Desktop\\item.json";
        String jsonStr = "";
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            // 读取文件
            Reader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            return jsonStr = sb.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
