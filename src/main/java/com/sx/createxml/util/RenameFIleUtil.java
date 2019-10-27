package com.sx.createxml.util;

import java.io.File;

public class RenameFIleUtil {

    public static void renameFile(String createPathModified,String createPathNative) {
        // Old file
        File oldFile = new File(createPathModified);

        // new file
        File newFile = new File(createPathNative);
    /* renameTo() return boolean value
    It return true if rename operation is successful
     */
        boolean flag = oldFile.renameTo(newFile);
        if (flag) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Rename operation failed");
        }

    }

    public static void renameFilesInFolder(String folderPath) {
        //把folder中的文件里面的 %% 替换成 #
        File file = new File(folderPath);
        File[] list = file.listFiles();
        // 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {
                //取文件名子存入name中
                String name = list[i].getName();
                // 截取.之前的字符串出来
                int index = name.indexOf(".");
                // 截取.JPG出来
                int index2 = name.lastIndexOf(".");
                String name3 = name.substring(index2);
                // 拼接字符串
                String newName = "2016-4-15-" + (i + 1) + name3;
                //重命名
                File dest = new File("d:/photos" + "/" + newName);
                list[i].renameTo(dest);
                System.out.println(dest.getName());
            }
        }
    }

}
