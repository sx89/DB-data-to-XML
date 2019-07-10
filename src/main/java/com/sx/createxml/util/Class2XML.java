package com.sx.createxml.util;

import com.sx.createxml.pojo.CreateXMLResult;
import com.sx.createxml.pojo.XMLDataStruct.Print4XML;
import com.sx.createxml.pojo.mysql.MetaItem;
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
import java.util.HashMap;
import java.util.List;
/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 16:42
 */
public class Class2XML {
    //TODO  把模板修改成拿到printLIst,写出标准的xml文件,以print.getName命名xml,并把xml的路径返回
    public static ArrayList<CreateXMLResult> createXMLByDOM(File dest, List<Print4XML> prints) {
        // 创建DocumentBuilderFactory
        for (int j = 0; j < prints.size(); j++) {
            Print4XML print4XML = prints.get(j);
            List<MetaItem> Items = print4XML.getItems();

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

                for (int i = 0; i < Items.size(); i++) {
//                   File dest_path =  new File("./xmls/"+Items.get(i).getName());


                    // 创建子节点，并设置属性
                    Element metaItem = document.createElement("metaItem");
                    //book.setAttribute("id", "1");

                    // 为book添加子节点
                    Element name = document.createElement("name");
                    name.setTextContent(Items.get(i).getName());
                    metaItem.appendChild(name);

                    Element key = document.createElement("key");
                    key.setTextContent(Items.get(i).getKey());
                    metaItem.appendChild(key);

                    Element type = document.createElement("type");
                    name.setTextContent(Items.get(i).getType());
                    metaItem.appendChild(type);

                    Element length = document.createElement("length");
                    length.setTextContent(Items.get(i).getLength());
                    metaItem.appendChild(length);

                    Element source = document.createElement("source");
                    source.setTextContent(Items.get(i).getSource());
                    metaItem.appendChild(source);

                    Element unique = document.createElement("unique");
                    unique.setTextContent(Items.get(i).getUnique());
                    metaItem.appendChild(unique);

                    Element constrain = document.createElement("constrain");
                    constrain.setTextContent(Items.get(i).getConstrain());
                    metaItem.appendChild(constrain);

                    Element node = document.createElement("node");
                    node.setTextContent(Items.get(i).getNode());
                    metaItem.appendChild(node);

                    Element method = document.createElement("method");
                    method.setTextContent(Items.get(i).getMethod());
                    metaItem.appendChild(method);

                    Element range = document.createElement("range");
                    range.setTextContent(Items.get(i).getRange());
                    metaItem.appendChild(range);

                    Element notation = document.createElement("notation");
                    notation.setTextContent(Items.get(i).getNotation());
                    metaItem.appendChild(notation);

                    Element value = document.createElement("value");
                    value.setTextContent(Items.get(i).getValue());
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

                // 使用Transformer的transform()方法将DOM树转换成XML
                tf.transform(new DOMSource(document), new StreamResult(dest));

                CreateXMLResult createXMLResult = new CreateXMLResult();

                createXMLResult.setCreatePath("./xmls/"+ print4XML.getPrintId());

                createXMLResult.setPrintId(print4XML.getPrintId());


                ArrayList<CreateXMLResult>  list_Result =  new ArrayList<CreateXMLResult>();

                list_Result.add(createXMLResult);

                return null;

            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerException e) {
                e.printStackTrace();
            }


        }
        return null;
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

