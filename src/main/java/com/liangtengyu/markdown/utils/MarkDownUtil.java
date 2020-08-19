package com.liangtengyu.markdown.utils;

import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 工具类
 *
 */
public class MarkDownUtil {

    /**
     * 判断 Elements 是否为空
     * @param elements
     * @return
     */
    public static Boolean elementsNotEmpty(Elements elements){
        if(elements != null && elements.size() > 0){
            return true;
        }

        return false;
    }

    /**
     * 获取 图片 file
     *
     * @param imageFilePath
     * @param imageFileName
     * @return
     */
    public static File getImageFile(String imageFilePath,String imageFileName) throws IOException {
       File imageFile =  new File(imageFilePath + File.separator + imageFileName);
       imageFile.createNewFile();
       return imageFile;
    }

}