package com.sx.createxml.util;

import com.sx.createxml.pojo.CreateXMLResult;
import com.sx.createxml.pojo.XMLDataStruct.Print4XML;
import com.sx.createxml.pojo.mysql.MetaItem;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 16:42
 */
public class Class2XML {
    //TODO  把模板修改成拿到printLIst,写出标准的xml文件,以print.getName命名xml,并把xml的路径返回
    public static ArrayList<CreateXMLResult> createXMLByDOM(String destFolerPath, List<Print4XML> prints) {
        // 创建DocumentBuilderFactory
        ArrayList<CreateXMLResult> list_Result = new ArrayList<CreateXMLResult>();
        for (int j = 0; j < prints.size(); j++) {
            Print4XML print4XML = prints.get(j);
            List<MetaItem> items = print4XML.getItems();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {

                // 创建DocumentBuilder
                DocumentBuilder builder = factory.newDocumentBuilder();

                // 创建Document
                Document document = builder.newDocument();

                // 设置XML声明中standalone为yes，即没有dtd和schema作为该XML的说明文档，且不显示该属性
                // document.setXmlStandalone(true);

                // 创建根节点
                Element root = document.createElement("root");

                for (int i = 0; i < items.size(); i++) {
//                   File dest_path =  new File("./xmls/"+Items.get(i).getName());


                    // 创建子节点，并设置属性
                    Element metaItem = document.createElement("metaItem");
                    //book.setAttribute("id", "1");

                    // 为book添加子节点
                    Element name = document.createElement("name");
                    String name1 = items.get(i).getName();
                    if (StringUtils.isEmpty(name1)) {
                        name1 = "null";
                    }
                    name.setTextContent(name1);
                    metaItem.appendChild(name);

                    Element key = document.createElement("key");
                    String key1 = items.get(i).getKey();
                    if (StringUtils.isEmpty(key1)) {
                        key1 = "null";
                    }
                    key.setTextContent(key1);
                    metaItem.appendChild(key);


                    Element type = document.createElement("type");
                    String type1 = items.get(i).getType();
                    if (StringUtils.isEmpty(type1)) {
                        type1 = "null";
                    }
                    type.setTextContent(type1);
                    metaItem.appendChild(type);


                    Element length = document.createElement("length");
                    String length1 = items.get(i).getLength();
                    if (StringUtils.isEmpty(length1)) {
                        length1 = "null";
                    }
                    length.setTextContent(length1);
                    metaItem.appendChild(length);

                    Element source = document.createElement("source");
                    String source1 = items.get(i).getSource();
                    if (StringUtils.isEmpty(source1)) {
                        source1 = "null";
                    }
                    source.setTextContent(source1);
                    metaItem.appendChild(source);

                    Element unique = document.createElement("unique");
                    String unique1 = items.get(i).getUnique();
                    if (StringUtils.isEmpty(unique1)) {
                        unique1 = "null";
                    }
                    unique.setTextContent(unique1);
                    metaItem.appendChild(unique);

                    Element constrain = document.createElement("constrain");
                    String constrain1 = items.get(i).getConstrain();
                    if (StringUtils.isEmpty(constrain1)) {
                        constrain1 = "null";
                    }
                    constrain.setTextContent(constrain1);
                    metaItem.appendChild(constrain);

                    Element node = document.createElement("node");
                    String node1 = items.get(i).getNode();
                    if (StringUtils.isEmpty(node1)) {
                        node1 = "null";

                    }
                    node.setTextContent(node1);
                    metaItem.appendChild(node);

                    Element method = document.createElement("method");
                    String method1 = items.get(i).getMethod();
                    if (StringUtils.isEmpty(method1)) {
                        method1 = "null";
                    }
                    method.setTextContent(method1);
                    metaItem.appendChild(method);

                    Element range = document.createElement("range");
                    String range1 = items.get(i).getRange();
                    if (StringUtils.isEmpty(range1)) {
                        range1 = "null";
                    }
                    range.setTextContent(range1);
                    metaItem.appendChild(range);


                    Element notation = document.createElement("notation");
                    String notation1 = items.get(i).getNotation();
                    if (StringUtils.isEmpty(notation1)) {
                        notation1 = "null";

                    }
                    notation.setTextContent(notation1);
                    metaItem.appendChild(notation);

                    Element value = document.createElement("value");
                    String value1 = items.get(i).getValue();
                    if (StringUtils.isEmpty(value1)) {
                        value1 = "null";
                    }
                    value.setTextContent(value1);
                    metaItem.appendChild(value);


                    // 为根节点添加子节点
                    root.appendChild(metaItem);
                }
                // 将根节点添加到Document下
                document.appendChild(root);

                /*
                 * 下面开始实现： 生成XML文件
                 */

                // 创建TransformerFactory对象
                TransformerFactory tff = TransformerFactory.newInstance();

                // 创建Transformer对象
                Transformer tf = tff.newTransformer();

                // 设置输出数据时换行
                tf.setOutputProperty(OutputKeys.INDENT, "yes");
                //TODO 如果文件夹不存在 要创建       文件路径再学习
                //创建文件的传输路径
                if (StringUtils.isEmpty(destFolerPath)) {
                    destFolerPath = "xmls/";
                }
                String createPath = destFolerPath + "图纸ID:"+print4XML.getPrintId()+".xml";

                File dest = new File(createPath);
                // 使用Transformer的transform()方法将DOM树转换成XML
                tf.transform(new DOMSource(document), new StreamResult(dest));

                CreateXMLResult createXMLResult = new CreateXMLResult();

//                createXMLResult.setCreatePath("./xmls/"+ print4XML.getPrintId());

                createXMLResult.setCreatePath(createPath);

                createXMLResult.setPrintId(print4XML.getPrintId());
                list_Result.add(createXMLResult);

            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerException e) {
                e.printStackTrace();
            }


        }

        return list_Result;
    }
}
//        public void createXMLByDOM(File dest) {
//            // 创建DocumentBuilderFactory
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            try {
//
//                // 创建DocumentBuilder
//                DocumentBuilder builder = factory.newDocumentBuilder();
//
//                // 创建Document
//                Document document = builder.newDocument();
//
//                // 设置XML声明中standalone为yes，即没有dtd和schema作为该XML的说明文档，且不显示该属性
//                // document.setXmlStandalone(true);
//
//                // 创建根节点
//                Element bookstore = document.createElement("bookstore");
//
//                // 创建子节点，并设置属性
//                Element book = document.createElement("book");
//                book.setAttribute("id", "1");
//
//                // 为book添加子节点
//                Element name = document.createElement("name");
//                name.setTextContent("安徒生童话");
//                book.appendChild(name);
//                Element author = document.createElement("author");
//                author.setTextContent("安徒生");
//                book.appendChild(author);
//                Element price = document.createElement("price");
//                price.setTextContent("49");
//                book.appendChild(price);
//
//                // 为根节点添加子节点
//                bookstore.appendChild(book);
//
//                // 将根节点添加到Document下
//                document.appendChild(bookstore);
//
//                /*
//                 * 下面开始实现： 生成XML文件
//                 */
//
//                // 创建TransformerFactory对象
//                TransformerFactory tff = TransformerFactory.newInstance();
//
//                // 创建Transformer对象
//                Transformer tf = tff.newTransformer();
//
//                // 设置输出数据时换行
//                tf.setOutputProperty(OutputKeys.INDENT, "yes");
//
//                // 使用Transformer的transform()方法将DOM树转换成XML
//                tf.transform(new DOMSource(document), new StreamResult(dest));
//
//            } catch (ParserConfigurationException e) {
//                e.printStackTrace();
//            } catch (TransformerConfigurationException e) {
//                e.printStackTrace();
//            } catch (TransformerException e) {
//                e.printStackTrace();
//            }
//

